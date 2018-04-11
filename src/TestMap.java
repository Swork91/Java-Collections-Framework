import java.util.*;
public class TestMap {

	public static void main(String[] args) {
		//hash map - not so sorted
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("Smith", 30);
		hashMap.put("Anderson", 32);
		hashMap.put("Lewis", 29);
		hashMap.put("Cook", 28);
		hashMap.put("Washington", 29);
		
		System.out.println("Display entries in hashMap");
		System.out.println(hashMap+"\n");
		
		//tree map - sorted
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(hashMap);
		
		System.out.println("Display entries in treeMap");
		System.out.println(treeMap+"\n");
		
		//linked hash map - ???
		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>(16, 0.75f, true);
		linkedHashMap.put("Smith", 30);
		linkedHashMap.put("Anderson", 32);
		linkedHashMap.put("Lewis", 29);
		linkedHashMap.put("Cook", 28);
		linkedHashMap.put("Washington", 29);
		
		System.out.println("Display entries in linkedHashMap");
		System.out.println(linkedHashMap+"\n");
		
		System.out.println("find lewis: "+linkedHashMap.get("Lewis"));
	}

}
