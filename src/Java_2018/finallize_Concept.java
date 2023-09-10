package Java_2018;

public class finallize_Concept {

	/*  public void start(){
		  
		  System.out.println("i am inside the finalize child class ");
		 
	  } */
	
	// just before the garbage collector finalize method called for the cleanup purpose
	
    public void finalize(){
		
		System.out.println("finalize method");
	} 
	
	public static void main (String[] args){
	   
		finallize_Concept F1 = new finallize_Concept();
	    finallize_Concept F2 = new finallize_Concept();
	    
	    F1= null;
	    F2= null;
	    
	    System.gc();
	}
	
    
	
}
