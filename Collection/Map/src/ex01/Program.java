package ex01;
import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("user", "Maria");
		map.put("phone", "32659878");
		
		System.out.println("The number phone of " + map.get("user") + " is " + map.get("phone"));
		
	}

}
