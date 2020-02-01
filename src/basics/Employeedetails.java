/** to get the employee details */
package basics;

import java.util.Scanner;

public class Employeedetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the employee name:");
		String ename = sc.nextLine();
		System.out.println("eneter the employee id:");
		int eid = sc.nextInt();
		System.out.println("enter employee salary:");
		float esal = sc.nextFloat();
		System.out.println("employee name: "+ename);
		System.out.println("employee id :"+eid);
		System.out.println("employee salary:"+esal);
		
		
	sc.close();	
	}

}
