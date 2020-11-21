
import java.util.Scanner;
import javax.swing.JOptionPane;
import generalpurpose.Date;
import generalpurpose.Time;
public class democlass
{ 
	
public static void main(String[] args)
	{
		 Scanner input=new Scanner(System.in);
	     System.out.println("Enter a doctor:");
         int x=input.nextInt();
         Doctor d[]=new Doctor[x];
         for(int i=0;i<x;i++)
         {
        	 d[i]=new Doctor("Laiba","89212-83793-0",12345,"female","Cd","xyz");
        	 d[i].newdoctor();
         }
         System.out.println("Enter a patient:");
         int y=input.nextInt();
         Patient p[]=new Patient[y];
         int flag;
         int doc;
         for(int j=0;j<y;j++)
         {
        	 System.out.println("1. Enter an  INDOORPATIENT:");
        	 System.out.println("Enter an OUTDOORPATIENT:");
        	 System.out.println("Enter your choice:");
             int option=input.nextInt();
             if(option==1)
             {
            	Indoorpatient pi[]=new Indoorpatient[j];
            	pi[j]=new Indoorpatient("Muqadas","89031-839381-9","rawalpindi",56678,"female",18,001,11,41,2000);
            	 flag=0;
            	 doc=0;
            	 pi[j].addindoorpatient();
            	 while(flag==0)
            	 {
            		 String drname=JOptionPane.showInputDialog("Enter the name of doctor for this patient");
            		 for(int l=0;l<x;l++)
            		 {
            			 if(d[l].getdname().equalsIgnoreCase(drname))
            			 {
            				 flag=1;
            				 doc=1;
            				 break;
            			 }
            		 }
            	     if(flag==0)
 				     {
 						System.out.println("this doctor is not found in the hospital");
 						
 					 }
 				 }
 				
             }
             else if(option==2)
             {
            	 Outdoor po[]=new Outdoor[j];
               	 po[j]=new Outdoor("Maryam","0874-80141-0","islamabad",435646,"female",20,500);
               	 flag=0;
               	 doc=0;
               	 po[j].addoutdoorpatient();
               	 while(flag==0)
               	 {
               		String drname=JOptionPane.showInputDialog("Enter the name of doctor for this patient");
           		    for(int l=0;l<x;l++)
           		    {
           			   if(d[l].getdname().equalsIgnoreCase(drname))
           			   {
           				   flag=1;
           				   doc=1;
           				   break;
           			   }
           		    }
           		    if(flag==0)
           		    {
           		    	System.out.println("this doctor is not found in this hospital");
           		    }
               	 }
             }
             else
             {
            	 System.out.println("Please enter valid option");
             }
      	}
        char choice='y';
 	    int ch;
 		do
 		{
 			System.out.println("1: see the list of all docters: ");
 			System.out.println("2: search the doctor by name or department: ");
 			System.out.println("3: see the list of all indoor patients: ");
 			System.out.println("4: see the list of all appointments on certain day: ");
 			System.out.println("5: see the list of appointment of certain doctor: ");
 			System.out.println("6: change the date or time of appointment of certain patient: ");
 			System.out.println("7: entre ur choice: ");
 			ch=input.nextInt();
 			if(ch==1)
 			{
 				for(int i=0;i<y;i++)
 				{
 					d[i].doctorinfo();
  				}
 			}
 			else if(choice==2)
 			{
 				System.out.println("1:search by docter name: ");
 				System.out.println("2: search by docter department: ");
 				System.out.println("3: entre ur choice: ");
 				int ih=input.nextInt();
 				if(ih==1)
 				{
 					flag=0;
 					String docname=JOptionPane.showInputDialog("entre doctor name for this patient");
 				for(int i=0;i<y;i++) {
 					if(docname.equalsIgnoreCase(d[i].getdname()))
 					{
 						d[i].doctorinfo();
 	 					flag=1;
 					}
 				}
 				if(flag==0)
 				{
 					System.out.println("docter name not fount");
 				}
 				}
 				else if(ih==2)
 				{
 					flag=0;
 					String ddepart=JOptionPane.showInputDialog("enter name of department for the doctor to search");
 					for(int w=0;w<y;w++)
 					{
 						if(ddepart.equalsIgnoreCase(d[w].ddepartment()))
 						{
 							d[w].doctorinfo();
  							flag=1;
 						}
 							
 					}
 					if(flag==0)
 					{
 						System.out.println("Name of department not found");
 					}
 		        }
 			    else
 			    {
 					System.out.println("enter valid choice");
 			    }
 		      }
 			  else if (ch==3)	
 			  {
 				flag=0;
 				
 				for(int n=0;n<x;n++)
 				{
 					p[n].patientinfo();
  					flag=1;
 							
 				}
 				if(flag==0)
 				{
 					System.out.println("no indoor patient in hospital");
 				}
 		     }
 			 else if (ch==4)	
 			 {
                flag=0;
 			    String apday=JOptionPane.showInputDialog("enter day to list appointment");
 			    int apd=Integer.parseInt(apday);
 				for(int n=0;n<x;n++)
 				{
 					if(p[n] instanceof OutdoorPatient)
 					{
 						if(apd==p[n].displaydate())
 						{
 						 p[n].patientinfo();
 						 flag=1;
 					}
 						
 				}
 				if(flag==0)
 				{
 					System.out.println("no appointment on this day");
 				}
 				
 		      }
 			 }
 				else if (ch==5)	
 				{
 	               flag=0;
 				String dn=JOptionPane.showInputDialog("enter doctor name to list all appointments");
 				
 					for(int n=0;n<x;n++)
 					{
 						if(p[n] instanceof OutdoorPatient)
 						{
 							if(dn.equalsIgnoreCase(p[n].getdname()))
 							{
 							JOptionPane.showMessageDialog(null,"appointment"+p[n].patientinfo(),"appointment",JOptionPane.WARNING_MESSAGE);
 							flag=1;
 						}
 							
 					}
 					}
 					if(flag==0)
 					{
 						System.out.println("no  doctor appointment on this day");
 					}
 					
 				}
 				else if(ch==6)
 				{
 					System.out.println("1: to search appointment by date");
 					System.out.println("2: to search appointment by time");
 					System.out.println("enter choice");
 					int appch=input.nextInt();
 					if(appch==1)
 					
 						{
 				               flag=0;
 							String patn=JOptionPane.showInputDialog("enter patient name to change date of  appointment");
 							
 								for(int n=0;n<x;n++)
 								{
 									if(p[n] instanceof OutdoorPatient)
 									{
 										if(patn.equalsIgnoreCase(p[n].getpname()))
 										{
 											p[n].inputdate();
 										
 										flag=1;
 										JOptionPane.showMessageDialog(null,"patient"+p[n].displaydate(),"with update date",JOptionPane.WARNING_MESSAGE);
 									}
 										
 								}
 								}
 								if(flag==0)
 								{
 									System.out.println("no outdoor patient with this name");
 								}
 								
 							}
 					if(appch==2)
 						
 					{
 			               flag=0;
 						String patn=JOptionPane.showInputDialog("enter patient name to change time of  appointment");
 						
 							for(int n=0;n<x;n++)
 							{
 								if(p[n] instanceof OutdoorPatient)
 								{
 									if(patn.equalsIgnoreCase(p[n].getpname()))
 									{
 										p[n].inputtime();
 									
 									flag=1;
 									JOptionPane.showMessageDialog(null,"patient"+p[n].displaytime(),"with update time",JOptionPane.WARNING_MESSAGE);
 								}
 									
 							}
 							}
 							if(flag==0)
 							{
 								System.out.println("no outdoor patient with this name");
 							}
 					}
 					else
 					{
 						System.out.println("enter valid choice");
 					}
 				}
 				else
 				{
 					System.out.println("enter valid choice");	
 				}
 		
  		System.out.println("enter whether to continue or not(y/n");	
 		choice=input.next().charAt(0);
 	}while(choice=='y');
 } 


}
