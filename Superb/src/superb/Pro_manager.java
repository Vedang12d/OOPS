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
class Pro_manager extends Employee{
	void read_Pro_manager() {
		//input data from user for Pro_manager
			input();
			boolean a=false;
			while(a==false) {
			System.out.print("BASIC   PAY  [60000 - 70000] : ");
			basic_pay=sc.nextDouble();
			if(basic_pay>70000 || basic_pay<60000) {
				//validation for basic pay of pro_manager
				System.out.println("SORRY!!!!!! BASIC  PAY FOR TEAMLEAD  MUST BETWEEN  [60000 - 70000] \nTRY AGAIN.....");
				a=false;
			}
			else
				a=true;
			}
			System.out.println("=================================================================================");
	}
		
		static void search(Pro_manager arr,int key) {
			//searching for pro_manager in database
			if (arr.emp_id==key) {
				System.out.println("       EMPLOYEE  FOUND  ");
				//if pro_manager found in database
				arr.display();//dispay database for Pro_manager
				arr.salary_slip();//printing salary slip
			}
			else {
				//if pro_manager is not found in database
				System.out.println("  EMPLOYEEE   WITH  ID  "+ key +"  NOT FOUND IN  TEAMLEAD  ");
			}
		}
	}
