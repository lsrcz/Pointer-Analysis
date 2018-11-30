package vasco;

import vasco.soot.ContextSensitiveJimpleRepresentation;
import vasco.soot.DefaultJimpleRepresentation;

public class VascoClearer {
    public static void clear() {
        ContextSensitiveJimpleRepresentation.clear();
        DefaultJimpleRepresentation.clear();
        Context.clear();
    }
}
