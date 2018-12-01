package jry.util;

import java.util.*;

public class CFLLib {
    /*
    FlowTo = new (assign | put[f] Alias get[f]) *
    PointsTo = (c_assign | c_get[f] Alias c_put[f]) * c_new
    Alias = PointsTo FlowTo

    FlowTo = new assign
    assign = assign assign | put[f] Alias get[f]
    PointsTo = c_assign c_new
    c_assign = c_assign c_assign | c_get[f] Alias c_put[f]
    Alias = PointsTo FlowTo

    Alias 0
    new 1
    c_new -1
    FlowTo 2
    PointsTo -2
    assign 3
    c_assign -3
    put[f] 4
    get[f] -4
    c_get[f] = 5
    c_put[f] = -5
     */
    public static List<Rule> FieldCFL = new ArrayList<Rule>(Arrays.asList(
            new BasicRule(2, 1, 3),
            new BasicRule(3, 3, 3),
            new SpecialRule(3, 0, 4),
            new BasicRule(-2, -3, -1),
            new BasicRule(-3, -3, -3),
            new SpecialRule(-3, 0, 5),
            new BasicRule(0, -2, 2)
    ));

    public static HashMap<Integer, String > FieldCFLName = new HashMap<Integer, String>(){{
        put(0, "Alias"); put(1, "new"); put(-1, "c_new");
        put(2, "FlowTo"); put(-2, "PointsTo"); put(3, "assign");
        put(-3, "c_assign"); put(4, "put[f]"); put(-4, "get[f]");
        put(5, "c_get[f]"); put(-5, "c_put[f]");
    }};

    public static List<Rule> ContextCFL = new ArrayList<>(Arrays.asList(
            new BasicRule(0, 0, 0),
            new SpecialRule(0, 0, 1)
    ));

    public static HashMap<Integer, String> ContextCFLName = new HashMap<Integer, String>() {{
        put(0, "assign"); put(1, "call"); put(-1, "return");
    }};

}
