package Java_2018;

public class Singleton {
	
	            // The singleton class has only one object
				//if you create other objects it will point to the same object
				//make constructor of the singleton class always will be private
				//write a static method that has return type object of singleton class
				// This concept is also called lazy initialization
		
	
	// static variable single_instance of type Singleton 
    private static Singleton obj = null; 
  
    // variable of type String 
    public String str; 
  
    // private constructor restricted to this class itself 
    private Singleton() 
    { 
        str = "Hello I am a string part of Singleton class"; 
    } 
  
    // static method to create instance of Singleton class 
    public static Singleton getInstance() 
    { 
        if (obj == null) 
            obj = new Singleton(); 
  
        return obj; 
    } 

	public static void main(String[] args) {

		// instantiating Singleton class with variable x 
        Singleton x = getInstance(); 
  
        // instantiating Singleton class with variable y 
        Singleton y = getInstance(); 
  
        // instantiating Singleton class with variable z 
        Singleton z = getInstance(); 
  
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);
        System.out.println("\n");
        
        // changing variable of instance x 
        x.str = (x.str).toUpperCase(); 
  
        System.out.println("String from x is " + x.str); 
        System.out.println("String from y is " + y.str); 
        System.out.println("String from z is " + z.str); 
        System.out.println("\n"); 
  
        // changing variable of instance z 
        z.str  = (z.str).toLowerCase(); 
  
        System.out.println("String from x is " + x.str); 
        System.out.println("String from y is " + y.str); 
        System.out.println("String from z is " + z.str); 
    } 
	

}
