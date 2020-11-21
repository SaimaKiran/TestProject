
import javax.swing.JOptionPane;

import generalpurpose.Date;
import generalpurpose.Time;
public class Outdoor extends Patient 
{
	private Date date;
	private Time time;
	private Doctor doctor;
	private int fee;
	public Outdoor(String pname,String pcnic,String paddress,int pphoneno,String pgender,int patientage,int fee)
	{
		super(pname, pcnic, paddress, pphoneno, pgender, patientage);
        this.date=date;
        this.time=time;
        this.doctor=doctor;
        this.fee=fee;
	}
	public Date getdate()
	{
		return date;
	}
	public void setdate(Date d)
	{
		this.date=d;
	}
	public Time gettime()
	{
		return time;
	}
	public void settime(Time dt)
	{
		this.time=dt;
	}
	public Doctor getdoctor()
	{
		return doctor;
	}
	public void setdoctor(Doctor dr)
	{
		this.doctor=dr;
	}
	public int getfee()
	{
		return fee;
	}
	public void setfee(int fe)
	{
		this.fee=fe;
	}
	 public void addoutdoorpatient()
	 {
		 super.newpatient();
		 date.inputdate();
		 time.inputtime();
		 doctor.newdoctor();
		 String f=JOptionPane.showInputDialog("Enter fee of indoorpatient");
	     int fee=Integer.parseInt(f);
	 }
	 public void patientinfo()
	 {
		 super.patientinfo();
		   date.displaydate();
		   time.displaytime();
		   doctor.doctorinfo();
		   JOptionPane.showMessageDialog(null,"Fee:"+fee,"Fee:",JOptionPane.WARNING_MESSAGE);		   
	 }
}
