package basics_ass;

import java.util.Scanner;

public class Num_adding {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num ");
		int num = sc.nextInt();
		int rev = 0;
		int sum = 0;

		while (num != 0) {
			rev = num % 10;
			sum += rev;
			num /= 10;
		}
		System.out.println("the summ of num is "+sum);
		sc.close();

	}
}