package basics_ass;

import java.util.Scanner;

public class count_the_digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the series of num");
		int num = sc.nextInt();

		int num_c = 0;
		while (num != 0) {
			num_c++;
			num=num/10;
		}
		System.out.println("the num of digits is "+num_c);
		sc.close();
	}

}
