package practice_1810;

public abstract class Base {

	int count;
	int j = 0;
	static int age1 = 25;
	final int rate1 = 5;
	
	Base(){
		
		System.out.println("Base abstract class constructor");
	}
	
	abstract void print();
	
	public void fill(){
		
		System.out.println("i am inside the non abstract method fill");
	}
	
}
