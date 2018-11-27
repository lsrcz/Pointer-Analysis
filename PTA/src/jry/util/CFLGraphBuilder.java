package jry.util;

import java.util.*;

public abstract class CFLGraphBuilder {
    CFLGraph graph = new CFLGraph();
    Map<Integer, Integer> allocId = new HashMap<Integer, Integer>();
    Map<Object, Integer> valueId = new HashMap<Object, Integer>();
    int totalValue = 0;

    int getValueId(Object obj) {
        if (valueId.containsKey(obj)) {
            return valueId.get(obj);
        } else {
            totalValue += 1;
            valueId.put(obj, totalValue);
            return totalValue;
        }
    }

    public abstract Integer getId(Object obj);

    public void assignAllocId(Object obj, Integer id) {
        int nodeId = getId(obj);
        allocId.put(nodeId, id);
    }

    public void addEdge(Object u, Object v, Integer type, Object value) {
        CFLGraph.GraphNode uNode = graph.getNode(getId(u));
        CFLGraph.GraphNode vNode = graph.getNode(getId(v));
        CFLGraph.GraphEdge edge = graph.initEdge(uNode, vNode, type, getValueId(value));
        graph.addEdge(edge);
    }

    public List<Integer> getPointTo(Object u, int type) {
        List<Integer> nodeId = graph.query(graph.getNode(getId(u)), type);
        Set<Integer> resultSet = new TreeSet<Integer>();
        for (Integer id : nodeId) {
            if (allocId.containsKey(id)) {
                resultSet.add(allocId.get(id));
            } else resultSet.add(0);
        }
        List<Integer> result = new LinkedList<>();
        for (Integer id : resultSet) {
            result.add(id);
        }
        return result;
    }
}
