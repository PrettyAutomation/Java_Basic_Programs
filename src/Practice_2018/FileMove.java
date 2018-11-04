package Practice_2018;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMove {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Path Temp = Files.move(Paths.get("C://Users//PrettySanwale//Documents//PROJECT INFO//SAREA//test.txt"), Paths.get("C://Users//PrettySanwale//Documents//PROJECT INFO//SAREA//Automation 1806//test.txt"));

		if (Temp != null)
		{
			System.out.println("File is moved successfully");
			
		}else 
		   {
			  System.out.println("file move failed");
		   }
		
		
	}

}
