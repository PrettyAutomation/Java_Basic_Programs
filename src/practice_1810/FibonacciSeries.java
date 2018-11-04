package practice_1810;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		// FibonacciSeries: 1 1 2 3 5 8 13 21.....
		
		int n1=0, n2=1, sum;
		
		System.out.println("Enter the no. upto which Fibonacci Series has to print");
		@SuppressWarnings("resource")
		int Number = new Scanner(System.in).nextInt();
		
		for(int i=1; i<=Number; i++){
			
		  System.out.print(n1 + "\n");

              sum = n1 + n2;
              n1 =  n2;
              n2 =  sum;
			
		}
		
		

	}

}
