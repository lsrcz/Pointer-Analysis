package jry.util;

import java.util.*;

public class CFLGraph {

    public String getString(Integer type, Integer value) {
        return type + "," + value;
    }

    public class GraphNode {
        public Integer id;
        public Map<Integer, List<GraphEdge>> outByType = new HashMap<>();
        public Map<String, List<GraphEdge>> outByValue = new HashMap<>();
        public Map<Integer, List<GraphEdge>> inByType = new HashMap<>();
        public Map<String, List<GraphEdge>> inByValue = new HashMap<>();

        public GraphNode(Integer _id) {
            id = _id;
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GraphNode) {
                return id.equals(((GraphNode) obj).id);
            } else return false;
        }

        private void putIn(Map map, Object key, GraphEdge edge) {
            if (!map.containsKey(key)) {
                map.put(key, new LinkedList<>());
            }
            ((List<GraphEdge>)map.get(key)).add(edge);
        }

        public void addOutEdge(GraphEdge edge) {
            Integer type = edge.type;
            String value = getString(edge.type, edge.value);
            putIn(outByType, type, edge);
            putIn(outByValue, value, edge);
        }

        public void addInEdge(GraphEdge edge) {
            Integer type = edge.type;
            String value = getString(edge.type, edge.value);
            putIn(inByType, type, edge);
            putIn(inByValue, value, edge);
        }

        public List<GraphEdge> getOutByType(int type) {
            if (!outByType.containsKey(type)) return new LinkedList<GraphEdge>();
            return outByType.get(type);
        }

        public List<GraphEdge> getOutByValue(int type, Integer value) {
            if (!outByValue.containsKey(getString(type, value))) return new LinkedList<GraphEdge>();
            return outByValue.get(getString(type, value));
        }

        public List<GraphEdge> getInByType(int type) {
            if (!inByType.containsKey(type)) return new LinkedList<GraphEdge>();
            return inByType.get(type);
        }
    }

    public class GraphEdge {
        public GraphNode u, v;
        public Integer type;
        public Integer value;
        public GraphEdge(GraphNode _u, GraphNode _v, Integer _type, Integer _value) {
            u = _u; v = _v; type = _type; value = _value;
        }

        public String toString() {
            return u.toString() + "," + v.toString() + "," + type + "," + value;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GraphEdge) {
                GraphEdge edge = (GraphEdge)obj;
                return u.equals(edge.u) && v.equals(edge.v) && type.equals(edge.type) && value.equals(edge.value);
            } else return false;
        }
    }

    public Map<Integer, GraphNode> nodes = new HashMap<Integer, GraphNode>();
    public Set<GraphEdge> edges = new HashSet<GraphEdge>();

    public GraphNode getNode(Integer id) {
        if (nodes.containsKey(id)) {
            return nodes.get(id);
        } else {
            GraphNode node = new GraphNode(id);
            nodes.put(id, node);
            return node;
        }
    }

    public boolean addEdge(GraphEdge edge) {
        if (edges.contains(edge)) return false;
        edges.add(edge);
        edge.u.addOutEdge(edge);
        edge.v.addInEdge(edge);
        return true;
    }

    public GraphEdge initEdge(GraphNode u, GraphNode v, int type, Integer value) {
        return new GraphEdge(u, v, type, value);
    }

    public List<Integer> query(GraphNode node, int type) {
        List<GraphEdge> edges = node.getOutByType(type);
        List<Integer> result = new LinkedList<>();
        for (GraphEdge edge : edges) {
            result.add(edge.v.id);
        }
        return result;
    }
}
