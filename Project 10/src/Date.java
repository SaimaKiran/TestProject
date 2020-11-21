
import javax.swing.JOptionPane;
public class Date 
{
   private int day;
   private int month;
   private int year;
   public Date(int day,int month,int year)
   {
	   this.day=day;
	  this.month=month;
	  this.year=year;
   }
   public int getday()
   {
	   return day;
   }
   public void setdat(int d)
   {
	   this.day=d;
   }
   public int getmonth()
   {
	   return month;
   }
   public void setmonth(int m)
   {
	   this.month=m;
   }
   public int getyear()
   {
	   return year;
   }
   public void setyear(int y)
   {
	   this.year=y;
   }
   public void inputdate()
   {
	   String d1=JOptionPane.showInputDialog("Enter day");
	   String m1=JOptionPane.showInputDialog("Enter month");
	   String y1=JOptionPane.showInputDialog("Enter year");
	   int day=Integer.parseInt(d1);
	   int month=Integer.parseInt(m1);
	   int year=Integer.parseInt(y1);
   }
   public void displaydate()
   {
	   JOptionPane.showMessageDialog(null,"Date:"+day+'/'+month+'/'+year,"Date",JOptionPane.WARNING_MESSAGE);
   }
}
