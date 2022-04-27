package superb;
import java.util.*;



//************************ CLASS PROGRAMMER ************************//



//************************ CLASS TEAMLEAD ************************//


//************************ CLASS aSST_PRO_MANAGER ************************//


//************************ CLASS PRO_MANAGER ************************//


//************************ CLASS MAIN ************************//

public class Superb {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Programmer p[]=new Programmer[3];			 
			//array of obj for Programmer
			Teamlead t[]=new Teamlead[3];                
			//array of obj for Teamlead
			Asst_pro_manager a[]=new Asst_pro_manager[2];
			//array of obj for Asst_pro_manager
			Pro_manager m=new Pro_manager();			 
			//array of obj for Pro_manager
			aa:
			do {
				//menu driven program
				System.out.println("=================================================================================");
				System.out.println(" MAIN  MENU  \n\n1.PROGRAMMER \n2.TEAM LEAD \n3.ASSISTANT PROJECT MANAGER \n4.PROJECT MANAGER \n5.EMPLOYEE SEARCH \n6.EXIT");
				System.out.print("Choice::");
				int k=sc.nextInt();//input choice from user
				System.out.println("=================================================================================");
				int op;
				int assign1=0,assign2=0,assign3=0,assign4=0;		
				//variable to check memory is allocated or not for each class 
				switch(k) {
				
				case 1://if input from user is 1
					do {
						System.out.print("\tPROGRAMMER  MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM PROGRAMMER \n\tChoice::");
						op=sc.nextInt();
						//input choice from user
						System.out.println("=================================================================================");
						if(op==1)//if input from user is 1
						{
							assign1=6;
							for (int i=0;i<3;i++) {
								p[i]=new Programmer();
								//creating object of Programmer
								p[i].read_programmer();
								//taking input for Programmer
								p[i].salary();
								//printing salary of Programmer
							}
						}
						else if(op==2  && assign1==6)
						{
							for (int i=0;i<3;i++) {
								p[i].display();
							//display database for programmer
								p[i].salary_slip();
							//printing salary slip of Programmer
							}
						}
						else if(op==2 && assign1!=6)
							System.out.println("  MEMORY  NOT  ALLOCATED  TO  PROGRAMMERS  DETAIL  YET...  ");
						
						System.out.println("===================================================================================================");
					}while(op!=3);
					break;
				
				case 2://if input from user is 2
					do {
						System.out.print("\tTEAMLEAD  MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM TEAMLEAD SECTION  \n\tChoice::");
						op=sc.nextInt();
						System.out.println("===================================================================================================");
						if(op==1)
						{
							assign2=4;
							for (int i=0;i<3;i++) {
								t[i]=new Teamlead();
								//creating object of teamlead
								t[i].read_teamlead();
								//taking input for teamlead
								t[i].salary();
								//printing salary of teamlead
							}
						}
						else if(op==2 && assign2==4)
						{
							for (int i=0;i<3;i++) {
								t[i].display();
								//display database for teamlead
								t[i].salary_slip();
							//printing salary slip of teamlead
						}
					}
						else if(op==2 && assign1!=6) 
							System.out.println("  MEMORY  NOT  ALLOCATED  TO  TEAMLEADS  DETAIL  YET...  ");
						System.out.println("===================================================================================================");
					}while(op!=3);
					break;
					
				case 3://if input from user is 3
					do {
						System.out.print("\tASSISTANT MANAGER MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM  ASSISTANT MANAGER \n\tChoice::");
						op=sc.nextInt();
						System.out.println("===================================================================================================");
						if(op==1)
						{
							assign3=2;
							for (int i=0;i<2;i++) {
								a[i]=new Asst_pro_manager();
							//creating object of Assistant_Manager
								a[i].read_Asst_pro_manager();
							//taking input for Assistant_Manager
								a[i].salary();
							//printing salary of Assistant_Manager
							}
						}
						else if(op==2 && assign3==2)
						{
							for (int i=0;i<2;i++) {
								a[i].display();
						//display database for Assistant_Manager
								a[i].salary_slip();
						//printing salary slip of Assistant_Manager
						}
					}
						else if(op==2 && assign1!=6) 										System.out.println("  MEMORY  NOT  ALLOCATED  TO  PROGRAMMERS  DETAIL  YET...  ");
						System.out.println("===================================================================================================");
					}while(op!=3);
					break;
					
				case 4://if input from user is 4
					do {
						System.out.print("\tPROJECT MANAGER MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM  PROJECT  MANAGER  SECTION \n\tChoice::");
						op=sc.nextInt();
						System.out.println("===================================================================================================");
						if(op==1)
						{
								assign4=1;
								m.read_Pro_manager();
							//taking input for Project_Manager
								m.salary();
							//printing salary of Project_Manager
						}
						else if(op==2 && assign4==1)
						{
								m.display();
							//display database for Project_Manager
								m.salary_slip();
						//printing salary slip of Project_Manager
						}
						else if(op==2 && assign1!=6) System.out.println("  MEMORY  NOT  ALLOCATED  TO  PROGRAMMERS  DETAIL  YET...  ");
						System.out.println("===================================================================================================");
					}while(op!=3);
					break;
					
				case 5://if input from user is 5
					String des;
					int key;
					System.out.print("ENTER  THE  DISIGNATION  OF  EMPLOYEE  YOU  WANT  TO  SEARCH : ");
					des=sc.next();
					//taking input from user
					System.out.print("Enter Emplyee ID:");
					key=sc.nextInt();
					//taking Emplyee ID from user
					if(des.toLowerCase().equals("programmer"))
					{
						//searching for programmer in database
						Programmer.search(p,key,6);
					}
					else if(des.toLowerCase().equals("teamlead"))
					{
						//searching for teamlead in database
						Teamlead.search(t, key, 4);
					}
					else if(des.toLowerCase().equals("assistant"))
					{
						//searching for assistant in database
						Asst_pro_manager.search(a, key, 2);
					}
					else if(des.toLowerCase().equals("manager"))
					{
						//searching for manager in database
						Pro_manager.search(m, key);
					
					}
					else {
						//if invalid input
						System.out.println("INVALID INPUT");
					}
					System.out.println("===================================================================================================");
					break;
					
				case 6://if input from user is 6
					System.out.print("Would you like to Exit\n\t1.YES\n\t2.No\n\tChoice::");
					int temp=sc.nextInt();
					if(temp==1)//checking for breaking loop
						break aa;//breaking menu bar
					
				default://default 
					System.out.println("   INVALID   ");
				}
				
			}while(true);
			sc.close();//closing scanner class object
		}
}