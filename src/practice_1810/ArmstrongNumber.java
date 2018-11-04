package practice_1810;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	
		// 1.About Armstrong no. is the sum of cube of its digits. 153 = (1*1*1)+(5*5*5)+(3*3*3)
		
		int n1=0, n2;
		
		System.out.println("Enter the no. for which Armstrong need to test");
		@SuppressWarnings("resource")
		int n = new Scanner(System.in).nextInt() ;
		
		while(n>0){                 // logic: for example n=153, n2 =3, n1 = 27; (n2 =5, n1 = 27+125 =152); (n2=1, n1= 152+1=153)
			
			n2 = n%10;
			n1 = n1+(n2*n2*n2);
			n  = n/10;
		
		}

		if(n ==n1){
			
			System.out.println("The given no.is an Armstrong");
			
		}else {
			
			System.out.println("The given no.is not an Armstrong");	
		}
		
	
	}

}
