package Java_2018;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		// 1. dynamic non-generic array it is also called rawtype array
		
		@SuppressWarnings("rawtypes")
		ArrayList ar = new ArrayList();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add("Tom");
		ar.add(12.33);
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
	 // 2. dynamic generic array
		
		ArrayList <Integer> ar1 = new ArrayList <Integer>();
		
		ar1.add(89);
		ar1.add(56);
		for(int i=0; i<ar1.size(); i++)
		{
		   System.out.println(ar1.get(i));
		}
	System.out.println("******************");	
	
	ArrayList <Integer> ar2 = new ArrayList <Integer>();
	
	ar2.add(55);
	ar2.add(88);
	for(int i=0; i<ar2.size(); i++)
	{
	   System.out.println(ar2.get(i));
	}
	System.out.println("*********************");
	
	//3. adding two generic array values, ensure the type of both array should be same
	
		ar1.addAll(ar2);
		
		System.out.println(ar1.size());
		
		for(int i=0; i<ar1.size(); i++)
		{
		   System.out.println(ar1.get(i));
		}
		
		System.out.println("***************************");
		
		//4. Initializing arraylist of objects
		
		ArrayList<Employee> ar3 = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1, "pretty", 5000);
		Employee e2 = new Employee(2, "renault", 7000);
		Employee e3 = new Employee(3, "java", 8000);
		Employee e4 = new Employee(4, "divya", 9000);
		
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		ar3.add(e4);
		
		System.out.println(ar3.size());
		
		Iterator<Employee> it = ar3.iterator();
		
		while(it.hasNext())
		{
		    Employee emp = it.next();
			System.out.print(emp.empno + " ");
			System.out.print(emp.empname + " ");
			System.out.print(emp.empsalary + " ");
			
			System.out.println("");
		}
		
	}

}
