package Anderson;

import java.util.*;
import java.io.*;

import soot.*;
import soot.util.*;

import jry.evaluation.RunDataset;
import jry.evaluation.AbstractPTATransformer;

public class Test {
    public static void main(String args[]) {
        ArrayList<Class<? extends AbstractPTATransformer>> l = new ArrayList<>();
        l.add(InterProcedureAndersonTrans.class);
        RunDataset r = new RunDataset(l);
        r.testAllTransformerWithSingleData(38);
    }
}
