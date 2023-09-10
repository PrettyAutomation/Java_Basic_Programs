package Java_2018;
import java.lang.Object;

public class CloneObject implements Cloneable {
	
	@Override

	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	String name = "Clone object";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CloneObject obj1 = new CloneObject();
		
		try
		{
			CloneObject obj2 = (CloneObject) obj1.clone();
			
			System.out.println(obj2.name);
			
		}catch(CloneNotSupportedException e)
		
		{
			
			e.printStackTrace();
		}
		
	}

}
