package jry.util;

import soot.toolkits.scalar.ArraySparseSet;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ResultOperator {
    Map<Integer, ArraySparseSet<Integer>> result = new TreeMap<Integer, ArraySparseSet<Integer>>();
    public ResultOperator(Map<Integer, ArraySparseSet<Integer>> S) {
        for (Map.Entry<Integer, ArraySparseSet<Integer>> entry : S.entrySet()) {
            result.put(entry.getKey(), entry.getValue().clone());
        }
    }

    public void Intersect(Map<Integer, ArraySparseSet<Integer>> S) {
        for (Map.Entry<Integer, ArraySparseSet<Integer>> entry : S.entrySet()) {
            assert result.containsKey(entry.getKey());
            ArraySparseSet current = result.get(entry.getKey());
            current.intersection(entry.getValue(), current);
        }
    }

    public void Union(Map<Integer, ArraySparseSet<Integer>> S) {
        for (Map.Entry<Integer, ArraySparseSet<Integer>> entry : S.entrySet()) {
            assert result.containsKey(entry.getKey());
            ArraySparseSet current = result.get(entry.getKey());
            current.union(entry.getValue(), current);
        }
    }

    public Map<Integer, ArraySparseSet<Integer>> getResult() {
        return result;
    }

    @Override
    public String toString() {
        String s = "";
        for (Map.Entry<Integer, ArraySparseSet<Integer>> entry : result.entrySet()) {
            s += entry.getKey() + ":";
            for (int allocID : entry.getValue()) {
                s += " " + allocID;
            }
            s += "\n";
        }
        return s;
    }
}
