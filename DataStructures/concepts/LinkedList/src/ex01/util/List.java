package ex01.util;

public class List {
	
	private Node head;
	
	public void add(Double value) {
		Node node = new Node();
			node.setValue(value);
			node.setNext(head);
			head = node;
		
		/* 
		 * list-->| |null|--_
		 * 
		 * 
		 * value = 5
		 * head = null
		 * node = n1
		 * 
		 * node | node.setValue | node.setNext | head
		 *            value          head        node                                       
		 * 
		 * 		             			   head = n1
		 * list--> | |next head|------->|5|null|--_
		 *                   		     
		 *
		 * value = 3
		 * head = n1
		 * node = n2
		 * 
		 * node | node.setValue | node.setNext | head
		 *            value             head     node 
		 *                                                   
		 *                    		    n2           n1
		 * list--> | |next head|------>|3|n1|------>|5|null|--_
		 *   
		 *                    
		 * value = 7
		 * head = n2
		 * node = n3                  		                        
		 *
		 *
		 * node | node.setValue | node.setNext | head
		 *            value             head     node 
		 *                                                   
		 *                    		  n3          n2            n1
		 * list-->| |next head|----> |7|n2|------>|3|n1|------>|5|null|--_
		 *
		 *
		 */
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}
}
