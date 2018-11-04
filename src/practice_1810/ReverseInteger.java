package practice_1810;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		
		System.out.println("Enter the no. to print the reverse of it");
		
		@SuppressWarnings("resource")
		int number = new Scanner(System.in).nextInt();
		
		int reverse = 0;
		
		while(number>0){
			
			int digit = number%10;
			reverse = (reverse*10)+ digit;
			number = number/10;
		}
		
		System.out.println(reverse);
		
	}

}
