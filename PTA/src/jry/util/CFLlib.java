package jry.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CFLlib {
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
    public List<Rule> FieldSFL = new ArrayList<Rule>(Arrays.asList(
            new BasicRule(2, 1, 3),
            new BasicRule(3, 3, 3),
            new SpecialRule(3, 0, 4),
            new BasicRule(-2, -3, -1),
            new BasicRule(-3, -3, -3),
            new SpecialRule(-3, 0, 5),
            new BasicRule(0, -2, 2)
    ));

}
