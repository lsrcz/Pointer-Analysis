package jry.util;

import soot.Unit;

import java.util.*;

public class CFLGraph {

    public String getString(int type, String value) {
        return type + "," + value;
    }

    public class GraphNode {
        public Unit unit;
        public Map<Integer, List<GraphEdge>> outByType = new HashMap<>();
        public Map<String, List<GraphEdge>> outByValue = new HashMap<>();
        public Map<Integer, List<GraphEdge>> inByType = new HashMap<>();
        public Map<String, List<GraphEdge>> inByValue = new HashMap<>();

        public GraphNode(Unit _unit) {
            unit = _unit;
        }

        @Override
        public String toString() {
            return unit.toString();
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GraphNode) {
                return unit.equals(((GraphNode) obj).unit);
            } else return false;
        }

        private void putIn(Map map, Object key, GraphEdge edge) {
            if (!map.containsKey(key)) {
                map.put(key, new LinkedList<>());
            }
            outByType.get(key).add(edge);
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
            return outByType.get(type);
        }

        public List<GraphEdge> getOutByvalue(int type, String value) {
            return outByValue.get(getString(type, value));
        }

        public List<GraphEdge> getInByType(int type) {
            return inByType.get(type);
        }

        public List<GraphEdge> getInByvalue(int type, String value) {
            return inByValue.get(getString(type, value));
        }
    }

    public class GraphEdge {
        public GraphNode u, v;
        public Integer type;
        public String value;
        public GraphEdge(GraphNode _u, GraphNode _v, Integer _type, String _value) {
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

    public HashMap<Unit, GraphNode> nodes = new HashMap<Unit, GraphNode>();
    public HashSet<GraphEdge> edges = new HashSet<GraphEdge>();

    public GraphNode getNode(Unit unit) {
        if (nodes.containsKey(unit)) {
            return nodes.get(unit);
        } else {
            GraphNode node = new GraphNode(unit);
            nodes.put(unit, node);
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

    public GraphNode initNode(Unit unit) {
        return new GraphNode(unit);
    }

    public GraphEdge initEdge(GraphNode u, GraphNode v, int type, String value) {
        return new GraphEdge(u, v, type, value);
    }
}
