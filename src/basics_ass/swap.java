package basics_ass;

import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first num1");
		int num1 = sc.nextInt();
		System.out.println("enter the second num2");
		int num2 = sc.nextInt();
		System.out.println("before swap the value of num1="+num1+" and num2="+num2);
		
		int temp = num1;    //swap number from num1 to num2
		num1 = num2 ;
		num2 = temp ;
	
		System.out.println("after swap the value of num1="+num1+" num2="+num2);
		sc.close();
		
	}

}
