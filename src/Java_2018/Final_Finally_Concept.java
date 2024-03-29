package Java_2018;

//3. to prevent the inheritance a final class can not be implemented

public final class Final_Finally_Concept {

	 	
	public static void main(String[] args) {
	   
		//1. to make variable constant the value can not be change
		final int i = 20;
	    System.out.println(i);
	    
	    division();
	    
    }
	
	 //2. To prevent the Method overriding
	
	public final void start(){
		
		System.out.println("i am inside the final method");
	}
	
	// Finally, keyword always followed with try and catch block
	
	// it is generally used to close the db connection
	// to close or quit the browser in case of selenium program
	
	public static void division(){
		try
		{
		  System.out.println("i am in try block");
		  int k =  10/0;
		} catch(NullPointerException e){
			
			System.out.println("i am inside the catch block");
			
		} finally {
			
			System.out.println("Execute the finally block instead of any exception occurrence");
			
		}
		
	}


}
