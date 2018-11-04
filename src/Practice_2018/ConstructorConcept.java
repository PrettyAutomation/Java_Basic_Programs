package Practice_2018;

public class ConstructorConcept extends SuperKey_Concept{
	
	String name;
	int age;
	
	public ConstructorConcept(){
		
		System.out.println("inside the child default constructor");
	}
	
    public ConstructorConcept(String name, int age){
    	this.name = name;
    	this.age = age;
		System.out.println("inside the child parameterised constructor the name and age are " + name+" " + age);
	}


    public ConstructorConcept(int i, int j){
    	super(20,30);
		System.out.println("inside the child parameterized constructor");
		System.out.println("value of i in child constructor = " + i);
		System.out.println("value of j in child constructor = " + j);
	}
    
	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10,20);
		ConstructorConcept obj2 = new ConstructorConcept("pretty",25);
		
		
	}

}
