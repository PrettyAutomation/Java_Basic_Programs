package Java_1810;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		//1. Remove Duplicate words
		
		System.out.println("Enter the Line from which duplicate words has to remove");
		@SuppressWarnings("resource")
		String Original = new Scanner(System.in).nextLine();
		String[] words = Original.split(" ");
		
		for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
		{
			if(words[i]!=null)
			{
			
			   for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
			   {
				
			      if(words[i].equals(words[j]))	//Checking for both strings are equal
				   {
					  words[j]=null;			//Delete the duplicate words
				   }
			
			   }
			}
		}
		
		
		for(int k=0;k<words.length;k++)		//Displaying the String without duplicate words	
		{
			if(words[k]!=null)
			{
				System.out.println(words[k]);
			}
			
	     }  
		
		
		
 }

}
