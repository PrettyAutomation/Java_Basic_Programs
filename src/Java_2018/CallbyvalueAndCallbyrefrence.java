package Java_2018;

public class CallbyvalueAndCallbyrefrence {
	
	int p = 50;
	int q = 60;
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		CallbyvalueAndCallbyrefrence obj = new CallbyvalueAndCallbyrefrence();
		
		// 1. call by value --- the copy of x and y is provided to a and b so no change in the original values
		
		obj.sum(x, y); 
		
		// 2. call by reference -- 
		
		obj.swap(obj); 
		
		System.out.println(obj.p);
		System.out.println(obj.q);

	}
     
	public void sum (int a, int b){
		
	    int c = a+b;
		System.out.println(c);
	}
	
	public void swap (CallbyvalueAndCallbyrefrence t){
		
		int temp = t.p;
		t.p = t.q;
		t.q = temp;
		
	}
	
}
