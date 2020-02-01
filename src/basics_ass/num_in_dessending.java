package basics_ass;

import java.util.Scanner;

public class num_in_dessending {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int num = sc.nextInt();
		
		System.out.println("the num in desending order is");
		for (int i = num; i >= 0; i--) {
			System.out.print(i);

		}
		sc.close();
	}

}
