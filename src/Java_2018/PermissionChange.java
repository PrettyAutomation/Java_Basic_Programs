package Java_2018;

import java.io.File;

public class PermissionChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C://Users//PrettySanwale//Documents//PROJECT INFO//SAREA//Automation 1806//test.txt");
		
		boolean exists = file.exists();
		
		if (exists == true)
		{
			
			file.setExecutable(true);
			file.setReadable(false);
			file.setWritable(true);
			System.out.println("permissions are changed");
			
			System.out.println("executable: " + file.canExecute());
			System.out.println("Readable: " + file.canRead());
			System.out.println("Writable: " + file.canWrite());
			
		}else
		{
			System.out.println("File not found");
			
		}
		
	}

}
