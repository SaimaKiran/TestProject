
import javax.swing.JOptionPane;

import generalpurpose.Date;
public class Indoorpatient extends Patient
{
    private int wardno;
    private int roomno;
    private int bedno;
    private Doctor doctor;
    private Date date;
    private int fee;
    public Indoorpatient(String pname,String pcnic,String paddress,int pphoneno,String pgender,int patientage,int wardno,int roomno,int bedno,int fee)
    {
    	super(pname, pcnic, paddress, pphoneno, pgender, patientage);
    	this.wardno=wardno;
    	this.roomno=roomno;
    	this.bedno=bedno;
      	this.doctor=doctor;
    	this.date=date;
    	this.fee=fee;
     }
   public int getwardno()
   {
	   return wardno;
   }
   public void setwardno(int wno)
   {
	   this.wardno=wno;
   }
   public int getroomno()
   {
	   return roomno;
   }
   public void setroomno(int rno)
   {
	   this.roomno=rno;
   }
   public int getbedno()
   {
	   return bedno;
   }
   public void setbedno(int bno)
   {
	   this.bedno=bno;
   }
   public Doctor getdoctor()
   {
	   return doctor;
   }
   public void setdoctor(Doctor dr)
   {
	   this.doctor=dr;
   }
   public Date getdate()
   {
	   return date;
   }
   public void setdate(Date dt)
   {
	   this.date=dt;
   }
   public int getfee()
   {
	   return fee;
   }
   public void getfee(int fe)
   {
       this.fee=fe;
   }
   public void addindoorpatient()
   {
	   super.newpatient();
	   String wno=JOptionPane.showInputDialog("Enter wardno of patient");
	   int wardno=Integer.parseInt(wno);
	   String rno=JOptionPane.showInputDialog("Enter roomno of patient");
	   int roomno=Integer.parseInt(rno);
	   String bno=JOptionPane.showInputDialog("Enter bedno of patient");
	   int bedno=Integer.parseInt(bno);
	  // this.doctor=new Doctor();
	   doctor.newdoctor();
	//   this.date=new Date();
	   date.inputdate();
	   String feee=JOptionPane.showInputDialog("Enter fee of indoorpatient");
	   int fee=Integer.parseInt(feee);
   }
   public void patientinfo()
   {
	   super.patientinfo();
	   JOptionPane.showMessageDialog(null,"INDORPATIENTINFO:"+wardno+"\t"+roomno+"\t"+bedno+"\t","INDOORPATIENTINFO",JOptionPane.WARNING_MESSAGE);
	   doctor.doctorinfo();
	   date.displaydate();
	   JOptionPane.showMessageDialog(null,"Fee:"+fee,"Fee:",JOptionPane.WARNING_MESSAGE);
   }
}