package ex03;

import java.util.ArrayList;

public class Sales {
	
	private ArrayList<Ordered> orderedList = new ArrayList<Ordered>();
	
	
	public void addRegisterToList( Ordered o) {
		orderedList.add(o); // The ArrayList Accepts primitive types, but within a single object type
		
	}
	
	
	public void showList() {
		for(Ordered list : orderedList) {
			System.out.println(list.getId());
			System.out.println(list.getName());
			System.out.println(list.getPrice());
		}
	}
}
