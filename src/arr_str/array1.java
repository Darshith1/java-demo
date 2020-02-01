package arr_str;

import java.util.Scanner;

public class array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of studennt");
		int n = sc.nextInt();

		int[] agearr = new int[n];
		System.out.println(agearr.length);

		for (int i = 0; i < agearr.length; i++) {
			System.out.println("enter the age of student" + (i + 1));
			agearr[i] = sc.nextInt();
		}

		int sum_of_age = 0;
		for (int i = 0; i < agearr.length; i++) {
			sum_of_age += agearr[i];

		}
		float avg_age = sum_of_age / agearr.length;

		System.out.println("sum of ages are " + sum_of_age);
		System.out.println("avg age is " + avg_age);
		sc.close();
	}

}
