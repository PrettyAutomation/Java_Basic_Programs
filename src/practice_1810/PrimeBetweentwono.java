package practice_1810;

import java.util.Scanner;

public class PrimeBetweentwono {

	public static void main(String[] args) {
		
		System.out.println("Enter the first no.");
		
		@SuppressWarnings("resource")
		int n1 = new Scanner(System.in).nextInt();
		
        System.out.println("Enter the second no.");
		
		@SuppressWarnings("resource")
		int n2 = new Scanner(System.in).nextInt();
		
		

        while (n1 < n2) {
            boolean flag = false;

            for(int i = 2; i <= n1/2; i++) {
                // condition for nonprime number
                if(n1 % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
           
                System.out.print(n1 + " ");

            n1++;
        }
    }

	
}
