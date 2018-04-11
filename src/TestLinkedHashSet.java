import java.util.*;
import java.util.Iterator;
import java.util.Set;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("London");
		set.add("New York");
		set.add("Los Angels");
		set.add("Berlin");
		set.add("Bejing");
		set.add("San Francisco");
		set.add("New York");
		
		System.out.println(set);
			
		for (Object element: set) {
			System.out.print(element.toString().toLowerCase() + " ");
		}
	}

}
