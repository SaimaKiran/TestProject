
public class Rectangle extends Shape 
{
	double width, length;
	Rectangle ()
	{
		width = 1.0;
		length = 1.0;
	}
	Rectangle (double width, double length)
	{
		this.width = width;
		this.length = length;
	}
	Rectangle (double width, double length , String colour , boolean filled)
	{
		this.width = width;
		this.length = length;
		this.colour= colour;
		this.filled = filled;
	}
	public double getWidth()
	{
		return width;
	}
	public double getLength()
	{
		return length;
	}
	void setWidth(double width)
	{
		this.width = width;
	}
	void setLength(double length)
	{
		this.length = length;
	}
	int area,perimeter;
	public double getArea()
	{
		return width*length;
	}
	public double getPerimeter()
	{
		return length+length+length+length;
	}
	public String toString ()
	{
		return " A Rectangle with width = " + getWidth() + " and length = " + getLength() + " ,which is a subclass of " + super.toString();	
	}
	
}
