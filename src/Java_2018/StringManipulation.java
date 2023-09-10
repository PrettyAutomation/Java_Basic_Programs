package Java_2018;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str1 = "Hello world i am here to learn";
		String str2 = "hello world i am here to learn";
		System.out.println(str1);
		System.out.println(str2);
		
		// Compare to string
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		// Substring from the indexof
		System.out.println(str1.substring(str1.indexOf('w')));
		
		// Substring begin and end index of and reverse it
		String str3= str1.substring(str1.indexOf('w'), str1.indexOf('t'));
		System.out.println(str3);
		String rev ="";
		for(int j= str3.length()-1; j>=0; j--) // reversing through for loop
		{
			rev = rev + str3.charAt(j);
		}
		
		System.out.println(rev);
		
		StringBuffer sf1 = new StringBuffer(str3);  // reversing through StringBuffer
		System.out.println(sf1.reverse());   
		
		// Trim();
		String str4 = "     hello world   ";
		System.out.println(str4.trim());
		
		// To replace the space in between
		System.out.println(str4.replace(" ", ""));
		
		String s1 = "20-09-2018";
		System.out.println(s1.replace("-", "/"));
		
		// split();
		String str5 = "Hello_world_i_am_here_to_learn";
		String str6[] = str5.split("_");
		
		for(int i=0; i<str6.length; i++){
			
			System.out.print(str6[i] + " ");
			
		 }	
		
		System.out.print("\n");
			
	   // concate
			
			String x = "hello";
			String y = "pretty";
			int a = 100;
			int b = 200;
			System.out.println(x+y+a+b);
			System.out.println(a+b+x+y);
			System.out.println(x+y+(a+b));
    }
		
		
}


