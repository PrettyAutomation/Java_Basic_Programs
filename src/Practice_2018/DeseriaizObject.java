package Practice_2018;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class DeseriaizObject implements Serializable 
{  
	@SuppressWarnings("unused")
	private String name;
	
	 DeseriaizObject(String name) 
	 {
        this.name = name;
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			DeseriaizObject d = new DeseriaizObject("Instance of object");
			FileOutputStream f = new FileOutputStream("file.txt");
			ObjectOutputStream oos = new ObjectOutputStream(f);
			oos.writeObject(d);
			oos.close();
			f.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
	}
	
}	

