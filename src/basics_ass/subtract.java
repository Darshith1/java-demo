package basics_ass;

import java.util.Scanner;

public class subtract {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first num");
		int num1 = sc.nextInt();
		System.out.println("enter the second num");
		int num2 = sc.nextInt();

		int sub = num1 - num2;

		if (sub >= 0) {
			System.out.println("the result is " + sub);
		} else {
			System.out.println("the result is " + (-sub));
		}
		sc.close();
	}

}

// result should always be in +ve