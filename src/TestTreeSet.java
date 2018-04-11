import java.util.*;
import java.util.Iterator;
import java.util.Set;

public class TestTreeSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("London");
		set.add("New York");
		set.add("Los Angels");
		set.add("Berlin");
		set.add("Bejing");
		set.add("San Francisco");
		set.add("New York");
		
		TreeSet<String> treeSet = new TreeSet<String>(set);
		System.out.println("Sorted tree set: "+treeSet);
			
		// set is in order, elements anc be picked by their order, removed, etc...
		System.out.println("1st: "+treeSet.first());
		System.out.println("end: "+treeSet.last());
		System.out.println("floor \"P\": "+treeSet.floor("P"));
		System.out.println("ceiling \"P\": "+treeSet.ceiling("P"));
		System.out.println("1st deleted: "+treeSet.pollFirst());
		System.out.println("new set: "+treeSet);
	}

}
