

import javax.swing.JOptionPane;

public class Patient 
{
    private String pname;
    private String pcnic;
    private String paddress;
    private int pphoneno;
    private String pgender;
    private int patientage;
    public Patient(String pname,String pcnic,String paddress,int pphoneno,String pgender,int patientage)
    {
    	this.pname=pname;
    	this.pcnic=pcnic;
    	this.paddress=paddress;
    	this.pphoneno=pphoneno;
    	this.pgender=pgender;
    	this.patientage=patientage;
    }
	public String getpname()
	{
		return pname;
	}
	public void setpname(String pn)
	{
		this.pname=pn;
	}
	public String getpcnic()
	{
		return pcnic;
	}
	public void setpcnic(String pc)
	{
		this.pcnic=pc;
	}
	public String getpaddress()
	{
		return paddress;
	}
	public void setpaddress(String padr)
	{
		this.paddress=padr;
	}
	public int getpphoneno()
	{
		return pphoneno;
	}
	public void setpphoneno(int pno)
	{
		this.pphoneno=pno;
	}
	public String getpgender()
	{
		return pgender;
	}
	public void setpgender(String pg)
	{
		this.pgender=pg;
	}
	public int getpatientage()
	{
		return patientage;
	}
	public void setpatientage(int pa)
	{
		this.patientage=pa;
	}
	public void newpatient()
	{ 
		String pcnic=JOptionPane.showInputDialog("Enter Name of patient");
		String pname=JOptionPane.showInputDialog("Enter CNIC of patient");
		String paddress=JOptionPane.showInputDialog("Enter Address of patient");
		String ppno=JOptionPane.showInputDialog("Enter Phone no of patient");
		int pphoneno=Integer.parseInt(ppno);
		String pgender=JOptionPane.showInputDialog("Enter Gender of patient");
		String patientage=JOptionPane.showInputDialog("Enter Age of patient");
	}
	public void patientinfo()
	{
		JOptionPane.showMessageDialog(null,"PATIENT:"+pname+"\t"+pcnic+"\t"+paddress+"\t"+pphoneno+"\t"+pgender+"\t"+patientage,"PATIENT",JOptionPane.WARNING_MESSAGE);
	}
}
