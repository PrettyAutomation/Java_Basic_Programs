package Practice_2018;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class test {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) { 
		Student s1 = new Student();
		 
        // Getting hold of Class object created
        // by JVM.
        Class c1 = s1.getClass();
 
       System.out.println(c1);
       
        // Printing type of object using c1.
        System.out.println(c1.getName());
 
        // getting all methods in an array
        Method m[] = c1.getDeclaredMethods();
        for (Method method : m)
            System.out.println(method.getName());
 
        // getting all fields in an array
        Field f[] = c1.getDeclaredFields();
        for (Field field : f)
            System.out.println(field.getName());
	      }
	      
  }
