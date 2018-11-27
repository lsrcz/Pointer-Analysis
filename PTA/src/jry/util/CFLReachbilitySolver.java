package jry.util;

import soot.Unit;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class CFLReachbilitySolver {
    public class Rule {}
    public class BasicRule extends Rule{
        int typeS, typeL, typeR;
    }
    public class SpecialRule extends Rule{
        int typeS, typeM, typeLR;
    }

    public List<Rule> rules;
    public CFLGraph graph;
    Queue<CFLGraph.GraphEdge> Q = new LinkedList<>();
    public CFLReachbilitySolver(List<Rule> _rules, CFLGraph _graph) {
        graph = _graph; rules = _rules;
    }

    public void tryExtend(CFLGraph.GraphEdge edge) {
        for (Rule rootRule: rules) {
            if (rootRule instanceof BasicRule) {
                BasicRule rule = (BasicRule)rootRule;
                if (edge.type == rule.typeL) {
                    List<CFLGraph.GraphEdge> outEdges = edge.v.getOutByType(rule.typeR);
                    for (CFLGraph.GraphEdge outEdge : outEdges) {
                        CFLGraph.GraphEdge newEdge = graph.initEdge(edge.u, outEdge.v, rule.typeS, "");
                        if (graph.addEdge(newEdge)) Q.add(newEdge);
                    }
                }
                if (edge.type == rule.typeR) {
                    List<CFLGraph.GraphEdge> inEdges = edge.u.getInByType(rule.typeR);
                    for (CFLGraph.GraphEdge inEdge : inEdges) {
                        CFLGraph.GraphEdge newEdge = graph.initEdge(inEdge.u, edge.v, rule.typeS, "");
                        graph.addEdge(newEdge);
                        if (graph.addEdge(newEdge)) Q.add(newEdge);
                    }
                }
            } else if (rootRule instanceof SpecialRule) {
                SpecialRule rule = (SpecialRule)rootRule;
                List<CFLGraph.GraphEdge> inEdges = edge.u.getInByType(rule.typeLR);
                for (CFLGraph.GraphEdge inEdge : inEdges) {
                    List<CFLGraph.GraphEdge> outEdges = edge.v.getOutByvalue(-inEdge.type, inEdge.value);
                }
            }
        }
    }

    public void doAnalysis() {
        for (CFLGraph.GraphEdge edge : graph.edges) Q.add(edge);
        while (!Q.isEmpty()) {
            CFLGraph.GraphEdge edge = Q.remove();
            tryExtend(edge);
        }
    }
}
