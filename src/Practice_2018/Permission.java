package Practice_2018;

import java.io.File;

public class Permission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C://Users//PrettySanwale//Documents//PROJECT INFO//SAREA//Automation 1806//test.txt");
		
		boolean exists = file.canExecute();
		
		if(exists== true )
		
		{
			System.out.println("file can be executable: " + file.canExecute());
			System.out.println("file can be readable: "   + file.canRead());
			System.out.println("file can be writable: "   + file.canWrite());
			
			
		}else
		{
			System.out.println("file not found or can not be executed");
		}
		
		
		
	}
	

}
