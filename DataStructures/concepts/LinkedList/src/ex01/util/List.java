package ex01.util;

public class List {
	// 
	
	
	private Node head;
	
	public void add(Double value) {
		Node node = new Node();
			node.setValue(value);
			node.setNext(head);
			head = node;
			/*           head
			 * list-->| |null|--_
			 * 
			 * 
			 * value = 5
			 * head = null
			 * node = n1
			 * 
			 * node.setValue | node.setNext | head
			 *    value=5        head=null   node=n1                                       
			 * 
			 * 		   head = n1 = node
			 * list--> |value=5|next head=null|--_
			 *                   		     
			 *
			 * value = 3
			 * head = n1
			 * node = n2
			 * 
			 * node.setValue | node.setNext | head
			 *   value             head       node 
			 *                                                   
			 *          head = n2 = node            node=n1
			 * list-->|value=3|next head=n1|------>|5|null|--_
			 *   
			 *                    
			 * value = 7
			 * head = n2
			 * node = n3                  		                        
			 *
			 *
			 * node.setValue | node.setNext | head
			 *     value             head     node 
			 *                                                   
			 *           head=n3=node         n2=node      n1=node
			 * list--> |7|next head=n2|------>|3|n1|------>|5|null|--_
			 *
			 *
			 */
		
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();// Don't overload the memory with multiples concatennation. Used to optimize the construction of large strings
		
		Node p = new Node();
		
		sb.append("[");
		while(p.getNext() != null) {
			sb.append(p.getValue() + " ");
			p = p.getNext();
		}
		sb.append("]");
		
		return sb.toString();
	}
	
	/*	p = node = n3
	 *  p.getValue = 7
	 *  p.getNext = n2
	 *          
	 *              p
	 *       		n3                   n2            n1
	 *  list--> |7|next head=n2|------>|3|n1|------>|5|null|--_
	 * 
	 * 
	 *  p = node = n2
	 *  p.getValue = 3
	 *  p.getNext = n1
	 *          
	 *             						 p
	 *       		n3                   n2            n1
	 *  list--> |7|next head=n2|------>|3|n1|------>|5|null|--_
	 * 
	 * 
	 * 	p = node = n1
	 *  p.getValue = 5
	 *  p.getNext = null
	 *          
	 *             									   p
	 *       		n3                   n2            n1
	 *  list--> |7|next head=n2|------>|3|n1|------>|5|null|--_
	 * 
	 * 
	 */
}
