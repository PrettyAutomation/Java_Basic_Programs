package Java_1810;

import java.util.Scanner;

public class CheckPrimeNo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter a no.");
		
		int n = new Scanner(System.in).nextInt();
		int count = 0;
		for (int i=2; i<n; i++){
			
			if(n%i==0){
				
		       count = 1;
				
			}else{
				
				i++;
			}
		
		}
		
		if(count>0){
			
			System.out.println("no. is not prime");
			
		}else{
			
			System.out.println("no. is prime");
		}
		
	}

}
