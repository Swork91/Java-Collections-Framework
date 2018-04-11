import java.util.*;

public class TestHashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("London");
		set.add("New York");
		set.add("Los Angels");
		set.add("Berlin");
		set.add("Bejing");
		set.add("San Francisco");
		set.add("New York");
		
		System.out.println(set);
		
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next().toUpperCase()+" ");
		}
	}

}
