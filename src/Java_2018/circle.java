package Java_2018;

class circle extends Shape{

	double radius;
	
	public circle (String colour, double radius)
	{
		super (colour);
		System.out.println("calling circle constructor");
		this.radius = radius;
		
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "circle colur is" + super.colour + "and area is" + area();
	}
	
}
