
public class Square extends Rectangle 
{
	double side;
	Square ()
	{
		side=1.0;
	}
	Square (double side)
	{
		this.side = side;
	}
	Square (double side , String colour , boolean filled)
	{
		this.colour= colour;
		this.filled = filled;
		this.side = side;
	}
	double getSide()
	{
		return side;
	}
	public void setSide(double side)
	{
		this.side = side;
	}
	void setWidth(double width)
	{
		this.width = width;
	}
	void setLength(double length)
	{
		this.length = length;
	}
	public double getArea()
	{
		return area;
	}
	public double getPerimeter()
	{
		return perimeter;
	}
	public String toString ()
	{
		return " A Square with side = " + getSide() + " ,which is a subclass of " + super.toString();	
	}

}
