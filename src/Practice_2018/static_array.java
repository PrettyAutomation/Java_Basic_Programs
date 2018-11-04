package Practice_2018;

public class static_array {

	public static void main(String[] args) {
	
		//1. ALL DATATYPE OF Integer
		
		int a[] = new int[5];
		
		a[0] =12; 
		a[1] =14; 
		a[2] = 16; 
		a[3] = 18; 
		a[4] = 20;
		
		for(int i=0; i<a.length;i++){
			
			System.out.println(a[i]);
		}
		
	    int j[] = {2,4,89456,78,100,23,56};
	    
        for(int i=0; i<j.length;i++){
			
			System.out.println(j[i]);
		}
	
		String s[] = new String[5];
		
		s[0] = "madhu";
		s[1] ="pretty";
		s[2] ="kusum";
		s[3] = "sheru";
		s[4] = "resham";
		
       for(int i=0; i<s.length;i++){
			
			System.out.println(s[i]);
		}
		
		String str [] = {"london", "Newyork", "stimulus", "faintest","ought"};
		
       for(int i=0; i<str.length;i++){
			
			System.out.println(str[i]);
		}
		
		//2. To overcome the disadvantage of storing same datatype values we use Object array
		
      /* Object ob[] = new Object[5];
		
		ob[0]= "tom";
		ob[1] = 3;
		ob[2] = 1.667;
		ob[3] = 'A';
		ob[4] = "1/1/33";
		
		System.out.println(ob[3]);  */
		
		
		
		

	}

}
