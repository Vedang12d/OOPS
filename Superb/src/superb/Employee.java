/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superb;

import java.util.*;

/**
 *
 * @author Admin
 */
class Employee {
	Scanner sc= new Scanner(System.in);//Scanner class Object
	String emp_name;//declaration of Employee name 
	String address;//declaration of address
	String mail_id;//declaration of mail id
	Long mobile_no;//declaration of mobile no.
	int emp_id;//declaration of Employee ID
	double basic_pay;//declaration of basic pay
	static int id=10000;
	double net_salary,gross_salary;//declaration of net & gross Salary
	double hra,da,pf,staff_club_fund;//declaration of hra,da,pf,staff_club_fund
	
	 Employee(){//Constructor for Employee
		 id++;
	}
	 
	void input() {
	System.out.print("Enter the name of Employee: ");
	emp_name=sc.nextLine();//input Employee name
	System.out.print("Employee ID:  ");
	emp_id=sc.nextInt();//input Employee Employee ID
	emp_id=id;
	System.out.print("Enter Address:  ");
	address=sc.next();//input Employee address
	System.out.print("Enter Mobile No.:  ");
	mobile_no=sc.nextLong();//input Employee mobile no.
	}
	
	void display(){
		//display database for Employee
      	System.out.println("****************************************************************");
		System.out.println("EMP NAME\tID \tADDRESS\t\tMOBILE");
		System.out.println("****************************************************************");	     
System.out.println(emp_name+"\t\t"+emp_id+"\t"+address+"\t\t"+mobile_no +"\n");	
	}
	
	void salary(){
		da=basic_pay*.97;//calculating da
		hra=basic_pay*.10;//calculating hra
		 pf=basic_pay*.12;//calculating pf
		staff_club_fund=basic_pay*0.001;//calculating staff_club_fund
		gross_salary=basic_pay + hra;//calculating gross salary
		
		int k=0;
		while(k<3) {			//loop for bonus salary
			System.out.println("   DOES DO YO HAVE DONE ANY EXTRA WORK \n\t1. PATENT \n\t2. OTHER BENIFICIAL WORK \n\t3.NO  ");
			System.out.print("Choice::");
			k=sc.nextInt();
			if (k==1) //if input is 1
				gross_salary+=3000;
			else if(k==2)//if input is 2
				gross_salary+=2000;
			else if(k==3)//if input is 3
				break;
			else//if invaid choice
				System.out.println("INVALID CHOICE.");
		}
		
		net_salary=gross_salary-pf-staff_club_fund;
		//calculating net salary
		System.out.println("=================================================================================");
	}
	
	void salary_slip() {
		//printing salary slip of Employee
		System.out.println("****************************************************************");
		System.out.println(" BASIC   PAY 		:	"+basic_pay);
		System.out.println(" HRA 	    	       	:	"+hra);
		System.out.println(" PF   	    		       :	"+pf);
		System.out.println(" GROSS SALARY       	: 	"+gross_salary);
		System.out.println(" NET SALARY 	       	: 	"+ net_salary);
		System.out.println("****************************************************************");
	}
	

}
