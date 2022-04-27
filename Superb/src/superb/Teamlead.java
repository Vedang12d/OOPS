/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superb;

/**
 *
 * @author Admin
 */
class Teamlead extends Employee{
//inheriting Employee class in Teamlead class
		void read_teamlead() {
			//input data from user for Teamlead
			input();
			boolean a=false;
			while(a==false) {
			System.out.print("BASIC   PAY  [40000 - 50000] : ");
			basic_pay=sc.nextDouble();
			if(basic_pay>50000 || basic_pay<40000) {
				//validation for basic pay of Teamlead
				System.out.println("SORRY!!!!!! BASIC  PAY FOR TEAMLEAD  MUST BETWEEN  [40000 - 50000] \nTRY AGAIN.....");
				a=false;
			}
			else
				a=true;
		}
			System.out.println("=================================================================================");
	}
		
		static void search(Teamlead arr[],int key,int n) {
			//searching for teamlead in database
			for(int i=0;i<n;i++) {
				if (arr[i].emp_id==key) {
					System.out.println("       EMPLOYEE  FOUND  ");
					//if teamlead found in database
					arr[i].display();//dispay database for Teamlead
					arr[i].salary_slip();//printing salary slip
				}
				else {
					//if teamlead is not found in database
					System.out.println("  EMPLOYEEE   WITH  ID  "+ key +"  NOT FOUND IN  TEAMLEAD  ");
				}
			}
		}
	}

