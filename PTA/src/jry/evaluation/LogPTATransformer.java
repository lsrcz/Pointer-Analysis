package jry.evaluation;

import java.util.Map;

public abstract class LogPTATransformer extends AbstractPTATransformer {
    public boolean fail = false;
    abstract protected void myInternalTransform(String s, Map<String, String> map);

    @Override
    protected void internalTransform(String s, Map<String, String> map) {
        System.out.println("[Start Analyze] " + this.getClass());
        try {
            myInternalTransform(s, map);
        } catch (Exception e) {
            e.printStackTrace();
            fail = true;
        }
        System.out.println("[Finish Analyze] " + this.getClass());
    }
}
