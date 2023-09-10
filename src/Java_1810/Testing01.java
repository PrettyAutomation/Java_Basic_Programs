package Java_1810;

public class Testing01 {

	public static void main(String[] args) {
		
		 TestBase obj1 = new TestDerived(); 
         
	       // As per overriding rules this should call to class Derive's static  
	       // overridden method. Since static method can not be overridden, it  
	       // calls Base's display()  
	       obj1.display();   
	         
	       // Here overriding works and Derive's print() is called  
	       obj1.print();      
	    

	}

}
