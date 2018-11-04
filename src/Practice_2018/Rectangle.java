package Practice_2018;

public class Rectangle extends Shape{
	
	double length;
	double width;
	
	public Rectangle (String colour, double length, double width){
		
		super (colour);
		System.out.println("calling rectangle constructer");
		this.length = length;
		this.width = width;
		
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * width ;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle colour is" + super.colour + "and area is" + area();
	}

}
