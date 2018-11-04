package Practice_2018;

public class ReverseString {

	public static void main(String[] args) {
	
		// without using reverse function
		// String is immutable so reverse function can not be used directly
		
		String S = "Pretty Beware Sanwale";
		String rev = "";
		int len = S.length(); 
		System.out.println("the no. of char in the string = " + len);
		
		for(int i=len-1; i>=0; i--){
			
			rev = rev + S.charAt(i);
		}
		
		System.out.println(rev);
		
		
		// Using StringBuffer because it is mutable reverse function can be used directly
		
		StringBuffer sf = new StringBuffer(S);
		System.out.println(sf.reverse());
		System.out.println(sf.replace(0, 5, "remert"));
		System.out.println(sf.substring(0, 3));
		
	
	}

}
