package Java_1810;

public  class Derived extends Base implements pretty {

	public static void main(String[] args) {
		
		Derived obj = new Derived();
		obj.print();
		obj.count = 34 ;
		pretty obj1 = new Derived();
		System.out.println(obj1.i);
		System.out.print(obj1.rate);
	    System.out.println(obj1.age);
	    System.out.println("i am in the main function of derived class");
		
		  
	    
	}
	
	    public void print() {

	        System.out.println("i am inside the Print abstract function");
	  		
	  	}

		@Override
		public void reverse() {
			
			
		}

	
	
}
