package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import javafx.util.*;

import soot.Local;
import soot.Value;
import soot.*;

class AssignConstraint {
	Object from, to;
	AssignConstraint(Object from, Object to) {
		this.from = from;
		this.to = to;
	}
}

class NewConstraint {
	Object to;
	int allocId;
	NewConstraint(int allocId, Object to) {
		this.allocId = allocId;
		this.to = to;
	}
}

class InstanceAssignConstraint {
	// Forall x in a, x.next >= b
	Object a, b;
	SootField c;
	InstanceAssignConstraint(Object a, Object b, SootField c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}

class AssignInstanceConstraint {
	// Forall x in b, a >= x.next
	Object a, b;
	SootField c;
	AssignInstanceConstraint(Object a, Object b, SootField c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}

public class Anderson {
	private List<AssignConstraint> assignConstraintList = new ArrayList<AssignConstraint>();
	private List<NewConstraint> newConstraintList = new ArrayList<NewConstraint>();
	private List<InstanceAssignConstraint> instanceAssignConstraintList = new ArrayList<InstanceAssignConstraint>();
	private List<AssignInstanceConstraint> assignInstanceConstraintList = new ArrayList<AssignInstanceConstraint>();
	Map<Object, TreeSet<Integer>> pts = new HashMap<Object, TreeSet<Integer>>();
	void addAssignConstraint(Object from, Object to) {
		assignConstraintList.add(new AssignConstraint(from, to));
	}
	void addNewConstraint(int alloc, Object to) {
		newConstraintList.add(new NewConstraint(alloc, to));		
	}
	void addInstanceAssignConstraint(Object a, Object b, SootField c) { instanceAssignConstraintList.add(new InstanceAssignConstraint(a, b, c)); }
	void addAssignInstanceConstraint(Object a, Object b, SootField c) { assignInstanceConstraintList.add(new AssignInstanceConstraint(a, b, c)); }
	void run() {
		for (NewConstraint nc : newConstraintList) {
			if (!pts.containsKey(nc.to)) {
				pts.put(nc.to, new TreeSet<Integer>());
			}
			pts.get(nc.to).add(nc.allocId);
		}
		for (boolean flag = true; flag; ) {
			flag = false;
			for (AssignConstraint ac : assignConstraintList) {
				if (!pts.containsKey(ac.from)) {
					continue;
				}
				if (!pts.containsKey(ac.to)) {
					pts.put(ac.to, new TreeSet<Integer>());
				}
				if (pts.get(ac.to).addAll(pts.get(ac.from))) {
					flag = true;
				}
			}
			for (InstanceAssignConstraint ac: instanceAssignConstraintList) {
				if (!pts.containsKey(ac.b)) {
					continue;
				}
				if (!pts.containsKey(ac.a)) {
					continue;
				}
				for (Integer x : pts.get(ac.a)) {
					Pair<Integer, SootField> p = new Pair<Integer, SootField>(x, ac.c);
					if (!pts.containsKey(p)) {
						pts.put(p, new TreeSet<Integer>());
					}
					if (pts.get(p).addAll(pts.get(ac.b))) {
						flag = true;
					}
				}
			}
			for (AssignInstanceConstraint ac: assignInstanceConstraintList) {
				if (!pts.containsKey(ac.b)) {
					continue;
				}
				if (!pts.containsKey(ac.a)) {
					pts.put(ac.a, new TreeSet<Integer>());
				}
				for (Integer x : pts.get(ac.b)) {
					Pair<Integer, SootField> p = new Pair<Integer, SootField>(x, ac.c);
					if (!pts.containsKey(p)) {
						continue;
					}
					if (pts.get(ac.a).addAll(pts.get(p))) {
						flag = true;
					}
				}
			}
		}
	}
	TreeSet<Integer> getPointsToSet(Object local) {
		return pts.get(local);
	}
	
}
