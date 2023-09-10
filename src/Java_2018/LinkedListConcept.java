package Java_2018;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
	    
		//1. Non-generic Linked list
		
		LinkedList list = new LinkedList ();
		
		list.add("tom");
		list.add(23);
		list.add("23/09/2018");
		list.add(12.44);
		
		System.out.print(list + " ");
		
		System.out.println("\n"+"***************************");
		
		
		//2. Gneric Linked list
		
		LinkedList <String> list1 = new LinkedList<String>();
		
		list1.add("test");
		list1.add("rose");
		list1.add("lili");
		list1.add("c34");
		
		for (int i=0; i<list1.size();i++){
			
			System.out.print(list1.get(i) + " ");
			
		}
		
		System.out.println("\n"+"***************************");
		
	 // 3.addfirst
		
		list1.addFirst("manglore");
		
	//4. addlast	
		
		list1.addLast("Karnataka");
		
	//5. using advance for loop
		
		for(String str: list1){
			
			System.out.print(str + " ");
		}
		
		System.out.println("\n"+"***************************");
		
      
		// 6. removelast
		
		list1.removeLast();
		
		//7. using Iterator
		
		Iterator <String> it = list1.iterator();
		while(it.hasNext()){
			
			System.out.print(it.next() + " ");
		}
		
		System.out.println("\n"+"***************************");
		
		//8. remove using index
		
		list1.remove(2);
		
		//9. using while loop
		
		int num =0;
		
		while(list1.size()>num){
			
			System.out.print(list1.get(num)+ " ");
			
			num++;
			
		}
		
		
	}

}
