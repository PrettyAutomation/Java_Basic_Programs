package Java_2018;

public class EleinMatrix {

	public static void main(String[] args) {
		
		int mat[][] = { {2,3,4},
				        {5,6,7,9,10},
				        {10,9,8} };
	
		System.out.println("The no. of rows or size of the array is " + mat.length);
		
		int element = 9;
	
	    for (int i=0; i<mat.length; i++){
	    	
	    	for (int j=0; j<mat[i].length; j++){
	    		
	    		System.out.print(mat[i][j]+ " ");
	    		
	    		}
	    	
	        System.out.print("\n");	     
	    }
		
           for (int i=0; i<mat.length; i++){
	    	
	    	   for (int j=0; j<mat[i].length; j++){
	    		
	    		   if (mat[i][j]== element){
	    				
	    				System.out.println("element found at row " +i+ " and column " + j );
	    			} 
	    		
	    		}
	      
	    }
	    
	    
	}
	

}
