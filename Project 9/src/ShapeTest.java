
public class ShapeTest 
{
	public static void main(String[] args) 
	{
	Shape s = new Shape( );
	Circle c = new Circle();
	Rectangle r = new Rectangle();
	Square sqr = new Square();
	
	s.setfilled(true);
	s.setcolour(" BLUE ");
	System.out.println(s.toString());
	
	System.out.println("    ***Shape Circle****   ");
	c.setRadius(6.04);
	c.setfilled(true);
	c.setcolour(" BLUE ");
	System.out.println(c.toString());
	System.out.println(" Area of circle is = " + c.getArea());
	System.out.println(" Perimeter of circle is = " + c.getPerimeter());    
	
	System.out.println("    ***Shape Rectangle****   ");
	r.setWidth(9.05);
	r.setLength(10.23);
	r.setfilled(true);
	r.setcolour(" BLUE ");
	System.out.println(r.toString());
	System.out.println(" Area of Rectanlge is = " + r.getArea());
	System.out.println(" Perimeter of Ractangle is = " + r.getPerimeter());    
	
	System.out.println("    ***Shape Square****   ");
	sqr.setfilled(true);
	sqr.setcolour(" BLUE ");
	sqr.setSide(7.30);
	System.out.println(sqr.toString())
	;
	}
}
