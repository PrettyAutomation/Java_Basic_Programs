package Java_2018;

import java.lang.reflect.Constructor;

public class Reflectionobj {

	private String name;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			Constructor <Reflectionobj> constructor = Reflectionobj.class.getDeclaredConstructor();
			
			Reflectionobj obj = constructor.newInstance();
			obj.setName ("Instance of object");
			
			System.out.println(obj.name);
		}catch (Exception e)
		
		{
			e.printStackTrace();
		}
	}

}
