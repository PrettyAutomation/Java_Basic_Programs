package practice_1810;

public class NestedSwitch {

	public static void main(String[] args) {
		
		int year=2;
		
		String Branch = "ECE";
		
		switch(year){
		
		case 1:
			
			System.out.println("All subjects are common");
			
		case 2:
			
			switch(Branch){
			
			case "CSE":
				
				System.out.println("Elective course are: VLSI and Neno Technology");
				break;
				
			case "ECE":
				
				System.out.println("Elective course are mentioned in CSE case");
                break;
			default:
				
				System.out.println("wrong branch selected");
			
			
			}
		
		
		
		}
		
		
		
	}

}
