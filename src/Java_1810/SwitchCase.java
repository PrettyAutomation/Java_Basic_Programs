package Java_1810;

import java.util.Scanner;

public class SwitchCase {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int n;
		String day = "";
		
		System.out.println("Enter the value of n");
		n = new Scanner(System.in).nextInt();
		
		switch(n){
		
		case 1: 
			
			day = "Monday";
			System.out.println(day);
			break;
			
		case 2: 
			
			day = "Tuesday";
			System.out.println(day);
			break;
		case 3: 
		    
			day = "Wednesday";
			System.out.println(day);
			break;
		case 4: 
			
            day = "Thursday";
			System.out.println(day);
            break;
		case 5: 
			
			day = "Friday";
	        System.out.println(day);
	        break;
	        
	   default:
		   
		   System.out.println("no working day");
	       break; 
		
		}
		
		
		
		

	}

}
