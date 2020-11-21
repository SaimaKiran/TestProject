
public class Circle extends Shape 
{
	double radius;
	Circle()
	{
		radius = 1.0;
	}
	Circle ( double radius)
	{
		this.radius = radius;
	}
	Circle ( double radius , String colour , boolean filled)
	{
		this.radius = radius;
		this.colour= colour;
		this.filled = filled;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double xxx)
	{
		this.radius = xxx;
	}
	int area,perimeter;
	public double getArea()
	{
		return 3.14*radius*radius;
	}
	public double getPerimeter()
	{
		return 2*3.14*radius;
	}
	public String toString ()
	{
		return " A Circle with radius " + getRadius() +  "which is a subclass of " + super.toString();	
	}

}
