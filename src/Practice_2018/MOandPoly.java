package Practice_2018;

public class MOandPoly {

	public static void main(String[] args) {
		
	  //1. static polymorphism -- compile time polymorphism java system will decide which method should be access
		
		BMW b = new BMW();
		b.start();          
		b.stop();
		b.theftsefty();
		
		System.out.println("******************************");
		
	 // 2. Dynamic polymorphism -- run time polymorphism where child class object can be referred by parent class refrenced variable
     // 3. It is also called top casting 
		
		Car c1 = new BMW();
		c1.start();         // The child class object so child class method will be access
		c1.stop();	
		
		System.out.println("************************");
		
		// 4. parent calss object referred by child class referenced variable also called down cast
		
		/* BMW B = (BMW) new Car();  // statement will pass at compile time but at run-time system will give error cast is not allowed 
		B.start();
		B.stop();
		B.theftsefty();  */
		
		System.out.println("****************************");
		
		Car c2 = new Car();
		c2.start();
		c2.stop();
		
	}

}
