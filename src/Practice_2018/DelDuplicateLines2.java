package Practice_2018;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

public class DelDuplicateLines2 {
     
	 
		public static void main(String[] args)throws IOException {
			// TODO Auto-generated method stub
			// PrintWriter object for output.txt
	        PrintWriter pw = new PrintWriter("C://Users//PrettySanwale//Documents//PROJECT INFO//SAREA//Automation 1806//output.txt");
	         
	        // BufferedReader object for input.txt
	        BufferedReader br = new BufferedReader(new FileReader("C://Users//PrettySanwale//Documents//PROJECT INFO//SAREA//Automation 1806//test.txt"));
	         
	        String line = br.readLine();
	        
	        //set store of unique values
	        HashSet<String> hs = new HashSet<String>();
	         
	        // loop for each line of input.txt
	        while(line!= null)
	        {
	            
	             //write only if no present in hashset
	                 
	                if(hs.add(line))
	                	pw.println(line);
	             
	                line = br.readLine();
	        }
	             
	            pw.flush();
	           
	        // closing resources
	        br.close();
	        pw.close();
	         
	        System.out.println("File operation performed successfully");
		}

	}


