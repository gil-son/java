package ex02;
import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("user", "Maria");
		map.put("phone", "32659878");
		
		System.out.println(map.keySet().toArray()[1]);
	    System.out.println(map.get("user"));
		
		for( String key : map.keySet()) {
			System.out.println(" Key = "+key+", Value = "+map.get(key));
		}
		
		for(int i = 1; i <= map.size(); i++){
	    	  System.out.println(map.keySet().toArray()[i-1]);
	    	}
	}
}
