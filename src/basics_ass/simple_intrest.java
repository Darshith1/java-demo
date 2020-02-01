package basics_ass;

import java.util.Scanner;

public class simple_intrest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principle ammoount");
		int p = sc.nextInt();
		System.out.println("eneter the rate of intrest");
		float r = sc.nextFloat();
		System.out.println("enter the time period");
		int t = sc.nextInt();
		 float simple_intrest = ((p*t*r)/100);
		 System.out.println("the simple intrest is:"+simple_intrest);
		 sc.close();
	}

}
