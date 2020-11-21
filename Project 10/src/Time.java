

import javax.swing.JOptionPane;

public class Time 
{
   private int hours;
   private int mins;
   private String ampm;
   public Time(int hours,int mins,String ampm)
   {
	   this.hours=hours;
	   this.mins=mins;
	   this.ampm=ampm;
   }
   public int gethours()
   {
	   return hours;
   }
   public void sethours(int h)
   {
	   this.hours=h;
   }
   public int getmins()
   {
	   return mins;
   }
   public void setmins()
   {
	   this.mins=mins;
   }
   public String getampm()
   {
	   return ampm;
   }
   public void setampm(String ap)
   {
	   this.ampm=ap;
   }
   public void inputtime()
   {
	   String hr=JOptionPane.showInputDialog("Enter hours");
	   String mn=JOptionPane.showInputDialog("Enter mins");
	   String ampm=JOptionPane.showInputDialog("Enter the time is AM or PM");
	   int hours=Integer.parseInt(hr);
	   int mins=Integer.parseInt(mn);
   }
   public void displaytime()
   {
	   JOptionPane.showMessageDialog(null,"Time:"+hours+':'+mins+':'+ampm,"Time",JOptionPane.WARNING_MESSAGE);
   }
}
