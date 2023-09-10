package Java_1810;

import java.util.Scanner;

public class StringPalindrom {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String Original ="";
		String Reverse ="";
		System.out.println("Enter the String for which palindrom need to test");
		Original = new Scanner(System.in).nextLine();
		
	    for(int i= Original.length()-1; i>=0;i--){
	    	
	    	Reverse = Reverse + Original.charAt(i);
	    	
	    }
	    
	    if(Reverse.equals(Original)){
	    	
	    	System.out.println("Given String is palindrom");
	    }else{
	    	
	    	System.out.println("Given String is not palindrom");
	    }
		
		
	}

}
