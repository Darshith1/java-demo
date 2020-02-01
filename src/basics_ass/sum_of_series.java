package basics_ass;

import java.util.Scanner;

public class sum_of_series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n num ");
		int n = sc.nextInt();
		int sum=0;
		for (int i = 1; i <= n; i++) {

	
		if (i % 2 == 1) {
			System.out.print(i);
			sum+=i;
		}
	}
		System.out.println();
		System.out.println("sum of num is "+sum);
		sc.close();
	
	}}
