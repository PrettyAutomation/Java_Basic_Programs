package practice_1810;

import java.util.Scanner;

public class FirstLastReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		
		@SuppressWarnings("resource")
		String Original = new Scanner(System.in).nextLine();
		String reverse="";
		String[] words = Original.split(" ");
		
		for(int i=0; i<words.length; i++){
			
			if(i==0||i==(words.length-1)){
				
				String a= words[i];
				
				for(int j=a.length()-1; j>=0;j--){
					
					reverse = reverse + a.charAt(j);
				}
				System.out.print(reverse);
				
				reverse=" ";
				
			}else{
			
			System.out.print(" " + words[i]);
			
		}
		
	}
		
}

}
