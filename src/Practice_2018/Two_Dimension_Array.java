package Practice_2018;

public class Two_Dimension_Array {

	public static void main(String[] args) {
		
		//1. int datatype 2 dimension array
		
		int a[][] = new int [3][5];
		System.out.println("total no. of row in integer array is " +  a.length); // total no. of rows
		System.out.println("total no. of column in integer array is " + a[0].length); // total no. of columns
		
		a[0][0] = 5; a[0][1] = 10; a[0][2] = 15; 
		a[1][0] = 20; a[1][1] = 25; a[1][2] =30;
		a[2][0] = 35; a[2][1] = 40; a[2][2] = 45;
		
		for (int i=0; i<a.length; i++){
			
			for (int j=0; j<a[0].length;j++){
				
				System.out.print(a[i][j] + " " );
			}
			
			System.out.println();
		}
		
		// 2. String Datatype 2 dimension array
		
		String b[][] = {{"abc", "def"}, {"abc","def"}, {"abc","def"}};
		
		System.out.println("total no. of row in String  array is " +  b.length); // total no. of rows
		System.out.println("total no. of column in String array is " + b[0].length); // total no. of columns
		
         for (int i=0; i<b.length; i++){
			
			for (int j=0; j<b[0].length;j++){
				
				System.out.print(b[i][j] + " " );
			}
			
			System.out.println();
		}

	}

}
