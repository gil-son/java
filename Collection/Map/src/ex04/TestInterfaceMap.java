package ex04;

import java.util.HashMap;
import java.util.Map;

public class TestInterfaceMap {

  public static void main(String[] args) {

    Map<Integer, String> mapNames = new HashMap<Integer, String>();
    
    mapNames.put(1, "John");
    mapNames.put(2, "Luci");
    mapNames.put(3, "Alves");

    System.out.println(mapNames);
    
    System.out.println(mapNames.keySet().toArray()[0]);
    System.out.println(mapNames.get(1));

    for( Integer key : mapNames.keySet()) {
		System.out.println(" Key = "+key+", Value = "+mapNames.get(key));
	}
    
    for(int i = 1; i <= mapNames.size(); i++){
    	  System.out.println(i + " - " + mapNames.get(i));
    	} 
  }
}
