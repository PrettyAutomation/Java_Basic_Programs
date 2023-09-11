package Java_2018;

public class ReverseString {

	public static void main(String[] args) {
	
		// without using reverse function
		// String is immutable so reverse function can not be used directly check below example
		// for immutability illustration

		String str1 = "hello";
		String str2 = str1; // str2 references the same string as str1

		str1 = str1 + " world"; // This creates a new string "hello world" and assigns it to str1

		System.out.println(str1); // Output: "hello world"
		System.out.println(str2); // Output: "hello" (str2 still refers to the original "hello" string)

		
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
