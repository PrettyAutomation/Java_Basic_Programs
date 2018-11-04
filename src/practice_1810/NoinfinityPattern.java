package practice_1810;

public class NoinfinityPattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5; i++){
			
		     for(int j=2*(5-i); j>0; j--){
				
				System.out.print(" ");
				
			}
		     
		     for(int k=1; k<=i; k++){
			
			    System.out.print(k +" ");
			
		     }
		     
		     System.out.println(" ");
		}
		
	}
		
	
}
