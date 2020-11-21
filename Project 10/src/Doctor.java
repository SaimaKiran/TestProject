

import javax.swing.JOptionPane;

public class Doctor
{
   private String dname;
   private String dcnic;
   private int dphoneno;
   private String dgender;
   private String ddepartment;
   private String dspecialization;
   public Doctor(String dname,String dcnic,int dphoneno,String dgender,String ddepartment,String dspecializatio)
   {
	   this.dname=dname;
	   this.dcnic=dcnic;
	   this.dphoneno=dphoneno;
	   this.dgender=dgender;
	   this.ddepartment=ddepartment;
	   this.dspecialization=dspecialization;
   }
   public String getdname()
   {
	   return dname;
   }
   public void setdname(String drn)
   {
	   this.dname=drn;
   }
   public String dcnic()
   {
	   return dcnic;
   }
   public void setdcnic(String drcnic)
   {
	   this.dcnic=drcnic;
   }
   public int dphoneno()
   {
	   return dphoneno;
   }
   public void setdphoneno(int drpno)
   {
	   this.dphoneno=drpno;
   }
   public String dgender()
   {
	   return dgender;
   }
   public void setdgender(String drg)
   {
	   this.dgender=drg;
   }
   public String ddepartment()
   {
	   return ddepartment;
   }
   public void setddpartment(String ddp)
   {
	   this.ddepartment=ddp;
   }
   public String dspecialization()
   {
	   return dspecialization;
   }
   public void setdspecialization(String ds)
   {
	   this.dspecialization=ds;
   }
   public void newdoctor()
   {
	   String dname=JOptionPane.showInputDialog("Enter Name of doctor");
	   String dcnic=JOptionPane.showInputDialog("Enter CNIC of doctor");
	   String dpn=JOptionPane.showInputDialog("Enter Phoneno of doctor");
	   int dphoneno=Integer.parseInt(dpn);
	   String dgender=JOptionPane.showInputDialog("Enter Gender of doctor");
	   String ddepartment=JOptionPane.showInputDialog("Enter Department of doctor");
	   String dspecialization=JOptionPane.showInputDialog("Enter Doctor's specialization");
   }
   public void doctorinfo()
   {
	   JOptionPane.showMessageDialog(null,"DOCTOR:"+dname+"\t"+dcnic+"\t"+dphoneno+"\t"+dgender+"\t"+ddepartment+"\t"+dspecialization,"DOCTOR",JOptionPane.WARNING_MESSAGE);
   }
   
}
