package jry.util;

import soot.Unit;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

abstract class Rule {}
class BasicRule extends Rule{
    int typeS, typeL, typeR;
    public BasicRule(int S, int L, int R) {
        typeS = S; typeL = L; typeR = R;
    }
}
class SpecialRule extends Rule{
    int typeS, typeM, typeLR;
    public SpecialRule(int S, int M, int LR) {
        typeS = S; typeM = M; typeLR = LR;
    }
}

public class CFLReachbilitySolver {
    public List<Rule> rules;
    public Map<Integer, String> names;
    public CFLGraph graph;
    Queue<CFLGraph.GraphEdge> Q = new LinkedList<>();
    public CFLReachbilitySolver(List<Rule> _rules, Map<Integer, String> _names, CFLGraph _graph) {
        graph = _graph; rules = _rules; names = _names;
    }

    public void tryExtend(CFLGraph.GraphEdge edge) {
        // System.out.println("[NewEdge] " + edge.u.id + "->" + edge.v.id + " " + names.get(edge.type) + " " + edge.value);
        for (Rule rootRule: rules) {
            if (rootRule instanceof BasicRule) {
                BasicRule rule = (BasicRule)rootRule;
                if (edge.type == rule.typeL) {
                    List<CFLGraph.GraphEdge> outEdges = edge.v.getOutByType(rule.typeR);
                    for (CFLGraph.GraphEdge outEdge : outEdges) {
                        CFLGraph.GraphEdge newEdge = graph.initEdge(edge.u, outEdge.v, rule.typeS, 0);
                        if (graph.addEdge(newEdge)) Q.add(newEdge);
                    }
                }
                if (edge.type == rule.typeR) {
                    List<CFLGraph.GraphEdge> inEdges = edge.u.getInByType(rule.typeL);
                    for (CFLGraph.GraphEdge inEdge : inEdges) {
                        CFLGraph.GraphEdge newEdge = graph.initEdge(inEdge.u, edge.v, rule.typeS, 0);
                        if (graph.addEdge(newEdge)) Q.add(newEdge);
                    }
                }
            } else if (rootRule instanceof SpecialRule) {
                SpecialRule rule = (SpecialRule)rootRule;
                if (edge.type == rule.typeM) {
                    List<CFLGraph.GraphEdge> inEdges = edge.u.getInByType(rule.typeLR);
                    for (CFLGraph.GraphEdge inEdge : inEdges) {
                        List<CFLGraph.GraphEdge> outEdges = edge.v.getOutByValue(-inEdge.type, inEdge.value);
                        for (CFLGraph.GraphEdge outEdge : outEdges) {
                            CFLGraph.GraphEdge newEdge = graph.initEdge(inEdge.u, outEdge.v, rule.typeS, 0);
                            if (graph.addEdge(newEdge)) Q.add(newEdge);
                        }
                    }
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
