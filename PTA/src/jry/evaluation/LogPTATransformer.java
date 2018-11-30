package jry.evaluation;

import java.util.Map;

public abstract class LogPTATransformer extends AbstractPTATransformer {
    abstract protected void myInternalTransform(String s, Map<String, String> map);

    @Override
    protected void internalTransform(String s, Map<String, String> map) {
        System.out.println("[Start Analyze] " + this.getClass());
        myInternalTransform(s, map);
        System.out.println("[Finish Analyze] " + this.getClass());
    }
}
