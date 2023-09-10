package Java_1810;

public class ConvertmohantoMohan {

	public static void main(String[] args) {
		
		//1. Convert lower case later to uppercase by selecting substring.
		String str1 = "mohan";
		System.out.println(str1.toUpperCase());
		String str2 = str1.substring(0, 1).toUpperCase()+str1.substring(1, str1.length());
		System.out.println(str2);
		
		//2. Use Replaceall
		
		String str3 = str1.replaceAll("mohan", "MOHAN");
		System.out.println(str3);
		
		//3. Use replace to change the one character.
		
		String str4 = str1.replace("o", "O");
		System.out.println(str4);

		//4.Given two strings, concate and print the reverse of it.
		
		String s1 = "pretty";
		String s2 = "Sanwale";
		
		String s3 = s1.concat(s2);
		StringBuffer sb = new StringBuffer(s3);
		System.out.println(sb.reverse());
		
    }

}
