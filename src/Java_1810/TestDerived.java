package Java_1810;

public class TestDerived extends TestBase{
	
	// This method hides display() in TestBase  
    public static void display() { 
         System.out.println("Static or class method from Derived"); 
    } 
      
    // This method overrides print() in TestBase  
    public void print() { 
         System.out.println("Non-static or Instance method from Derived"); 
   } 

}
