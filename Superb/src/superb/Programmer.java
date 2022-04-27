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
class Programmer extends Employee{
//inheriting Employee class in Programmer class
		void read_programmer() {
			//input data from user for Programmer
			super.input();
			boolean a=false;
			while(a==false) {
			System.out.print("BASIC PAY[30000-40000]: ");
			basic_pay=sc.nextDouble();
			if(basic_pay>40000 || basic_pay<30000) {
				//validation for basic_pay of Programmer
				System.out.println("SORRY!!!!!! BASIC  PAY FOR PROGRAMMER  MUST BETWEEN  [30000 - 40000]  \nTRY AGAIN.....");
				a=false;
			}
			else
				a=true;
		}

			System.out.println("=================================================================================");
		}
		
		static void search(Programmer arr[],int key,int n) {
			//search for programmer in database
			for(int i=0;i<n;i++) {
				if (arr[i].emp_id==key) {
					System.out.println("       EMPLOYEE  FOUND  ");
					//if Programmer found in database
					arr[i].display();//dispay database for programmer
					arr[i].salary_slip();//printing salary slip
				}
				else {
					System.out.println("  EMPLOYEEE   WITH  ID  "+ key +"  NOT FOUND IN  PROGRAMMERS  ");
				}		
			}
		}
	}

