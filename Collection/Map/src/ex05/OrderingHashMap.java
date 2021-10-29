package ex05;

import java.util.HashMap;
import java.util.Map;

public class OrderingHashMap {

	public static void main(String[] args) {
		
	Map<Integer, String> mapNames = new HashMap<Integer, String>();
	
		mapNames.put(1, "John");
	    mapNames.put(2, "Luci");
	    mapNames.put(3, "Alves");
	    mapNames.put(4, "Xxx");
	    mapNames.put(5, "Xxx");
	    
	    ComparatorInts ci = new ComparatorInts(mapNames);
	   
	    System.out.println(ci.compare(4,5));
	    
	}
}
