package Java_2018;

public class StaticAndNonStaticConcept {
	
	int rows = 30;
	static int age = 50;

	public static void main(String[] args) {
		
		// 1. static variable and methods can be access directly
		
		System.out.println(age);
		sum(30);
		
		//2. static variable and methods can be access by using classname
		
		System.out.println(StaticAndNonStaticConcept.age);
		
		StaticAndNonStaticConcept.sum(age);
		
		// create class object to access the non static variable and methods
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		
		int column = obj.rows;
		
		System.out.println(column);
		
		System.out.println(obj.age);
		obj.sum();
		obj.sum(50);   // static method can be called by object reference but it is not good practice system will give warning msg.
		
		
	}
	
	public void sum(){
		int a = 10;
		int b = 20;
		System.out.println("this the sum function");
		
	}
	
	public static void sum (int column){      // same method name with different parameter is called method overloading
		
		column = 40;
	    age = 78;
	    StaticAndNonStaticConcept obj1 = new StaticAndNonStaticConcept();
	    obj1.rows = 50;
	    System.out.println("this is the method overloading function " + "column value is " + column);
		
	}

}
