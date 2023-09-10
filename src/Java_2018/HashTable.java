package Java_2018;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Hashtable is synchronized hashmap, it is thread-safe discouraged to use as cause performance issues
 * Hashtable does not allow null key or value throws nullPointerException
 * Hashtable alternative is concurrentHashmap
 * Hashmap is non synchronized, it allows one null key and multiple null values
 * Not thread safe but faster in performance
 * */

public class HashTable {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//1.Hashtable with non-generic data type of key and value pair
		@SuppressWarnings("rawtypes")
		Hashtable h = new Hashtable();
		
		h.put(1, 30);
		h.put(2, 60);
		h.put("class", "11th");
		h.put("name", "password");
		h.put(67, "fail");
		
		System.out.println("The size of the hashtable is " + h.size());
		
		Hashtable emp;
		
		emp = (Hashtable)h.clone();
		
		System.out.print(emp + " ");
		
		
		// 2.Hashtable with generic data type of key and value pair
		Hashtable <Integer, Integer> h1 = new  Hashtable <Integer, Integer> ();
		
		h1.put(1, 10);
		h1.put(2, 20);
		h1.put(3,30);
		h1.put(4,40);
		
       Hashtable emp1;
		
		emp1 = (Hashtable)h1.clone();
		
		System.out.print(emp1 + " ");
		
  //3. To display only values by using enumeration 
		
		Hashtable h2 = new Hashtable();
     
		h2.put(3, "Geeks"); 
        h2.put(2, "forGeeks"); 
        h2.put(1, "isBest"); 
           
    // create enumeration  
    Enumeration e = h2.elements(); 
      
   System.out.println("display values:"); 
      
        while (e.hasMoreElements()) 
        { 
          System.out.println(e.nextElement());
       
        } 
	System.out.println("***************************");	
	
	
    }

}
