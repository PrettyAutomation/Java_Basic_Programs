package Java_2018;

public class Object {
	
	String name = "Instance creation";

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Class cls = Class.forName("Object");
			
			Object obj = (Object) cls.newInstance();
			
			System.out.println(obj.name);
			
		} 
		
		catch(ClassNotFoundException e) 
		{
			
			e.printStackTrace();
			
		}
		
		catch(InstantiationException e)
		{
			
			e.printStackTrace();
		}
		catch(IllegalAccessException e){
			
			e.printStackTrace();
		}
		
		

	}

}
