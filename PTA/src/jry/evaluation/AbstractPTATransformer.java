package jry.evaluation;

import soot.SceneTransformer;
import soot.toolkits.scalar.ArraySparseSet;

import java.util.Map;

public abstract class AbstractPTATransformer extends SceneTransformer {
    public abstract Map<Integer, ArraySparseSet<Integer>> getResult();
}