package Practice_2018;

public abstract class Shape {

	
	String colour;
	
	abstract double area();
	
	public abstract String toString();
	
	Shape(String colour)
	{
		this.colour = colour; 
		
	}
	
}
