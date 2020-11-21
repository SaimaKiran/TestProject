
public class Shape 
{
	String colour;
	boolean filled;
	Shape()
	{
		colour = " ";
		filled = false;
	}
	Shape(String colour , boolean filled)
	{
		this.colour= colour;
		this.filled = filled;
	}
	public String getcolour()
	{
		return colour;
	}
	public boolean getfilled()
	{
		return filled;
	}
	public void setcolour(String colour)
	{		this.colour= colour;
	}
	public void setfilled(boolean filled)
	{
		this.filled = filled;
	}

	 public String toString ()
	{
		return " A Shape with color of" + getcolour() + " is " +  getfilled() + " filled.";	
	}
}
