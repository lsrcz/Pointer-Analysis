package jry.util;

import soot.toolkits.scalar.ArraySparseSet;

import java.lang.reflect.Array;
import java.util.*;

public class CFLGraphBuilder {
    CFLGraph graph = new CFLGraph();
    Map<Integer, Integer> allocId = new HashMap<Integer, Integer>();
    Map<Object, Integer> valueId = new HashMap<Object, Integer>();
    Map<Object, Integer> Id = new HashMap<Object, Integer>();
    int totalValue = 0;
    int totalId = 0;

    int getValueId(Object obj) {
        if (valueId.containsKey(obj)) {
            return valueId.get(obj);
        } else {
            totalValue += 1;
            valueId.put(obj, totalValue);
            return totalValue;
        }
    }

    public Integer getId(Object obj) {
        if (Id.containsKey(obj)) {
            return Id.get(obj);
        } else {
            totalId += 1;
            //System.out.println("[NewNode] " + totalId + " " + obj + " " + obj.getClass());
            /*for (Map.Entry<Object, Integer> entry : Id.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getKey().getClass() + " " + entry.getKey().equals(obj));
            }*/
            Id.put(obj, totalId);
            return totalId;
        }
    }

    public void assignAllocId(Object obj, Integer id) {
        int nodeId = getId(obj);
        allocId.put(nodeId, id);
    }

    public void addEdge(Object u, Object v, Integer type, Object value) {
        CFLGraph.GraphNode uNode = graph.getNode(getId(u));
        CFLGraph.GraphNode vNode = graph.getNode(getId(v));
        // System.out.println(uNode.id + " " + vNode.id);
        CFLGraph.GraphEdge edge = graph.initEdge(uNode, vNode, type, getValueId(value));
        // System.out.println(edge.u + " " + edge.v + " " + edge.type + " " + edge.value);
        graph.addEdge(edge);
    }

    public ArraySparseSet<Integer> getPointTo(Object u, int type) {
        List<Integer> nodeId = graph.query(graph.getNode(getId(u)), type);
        ArraySparseSet<Integer> resultSet = new ArraySparseSet<>();
        for (Integer id : nodeId) {
            // System.out.println("Reach " + id);
            if (allocId.containsKey(id)) {
                resultSet.add(allocId.get(id));
            }
        }
        return resultSet;
    }

    public void doAnalysis(List<Rule> rules, Map<Integer, String> names) {
        CFLReachbilitySolver solver = new CFLReachbilitySolver(rules, names, graph);
        solver.doAnalysis();
    }
}
