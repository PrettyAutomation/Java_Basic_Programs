package Java_2018;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 100;
		
		long l = i;
		
		float f = l;
		
		System.out.println(i);   //automatic type conversion 
		System.out.println(f);   
		System.out.println(l);
		
		int j = 257;
		
		byte b;
		
		double d = 323.142;
		b = (byte) j;
		
		System.out.println("j =" + j +"\n" +"b =" + b);
		
		b = (byte) d;
		System.out.println("b =" + b);
		
		byte n=50;
		
		n = (byte) (n*2);
		
		System.out.println(n);
	}

}
