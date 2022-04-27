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
class Asst_pro_manager extends Employee{
//inheriting Employee class in Asst_pro_manager class
		void read_Asst_pro_manager() {
			//input data from user for Asst_pro_manager
			input();
			boolean a=false;
			while(a==false) {
			System.out.print("BASIC   PAY  [50000 - 60000] : ");
			basic_pay=sc.nextDouble();
			if(basic_pay>60000 || basic_pay<50000) {
				//validation for basic pay of Asst_pro_manager
				System.out.println("SORRY!!!!!! BASIC  PAY FOR TEAMLEAD  MUST BETWEEN  [50000 - 60000] \nTRY AGAIN.....");
				a=false;
			}
			else
				a=true;
		}
			System.out.println("=================================================================================");
	}
		
		static void search(Asst_pro_manager arr[],int key,int n) {
			//searching for Asst_pro_manager in database
			for(int i=0;i<n;i++) {
				if (arr[i].emp_id==key) {
					System.out.println("       EMPLOYEE  FOUND  ");
					//if Asst_pro_manager found in database
					arr[i].display();//dispay database for Asst_pro_manager
					arr[i].salary_slip();//printing salary slip	
				}
				else {
					//if Asst_pro_manager is not found in database
					System.out.println("  EMPLOYEEE   WITH  ID  "+ key +"  NOT FOUND IN  TEAMLEAD  ");
				}		
			}
		}
	}
