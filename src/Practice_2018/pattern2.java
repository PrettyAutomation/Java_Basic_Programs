package Practice_2018;

public class pattern2 {

	public static void main(String[] args) {
		
		int k=1;
		
		for (int i=1; i<5; i++){
			
			for (int j=1; j<=k; j++)
			{
				
				System.out.print("*");
				
			}
			
			k = k+2;
			
			System.out.println();
		}

	}

}
