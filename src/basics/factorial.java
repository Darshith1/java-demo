package basics;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int fact =sc.nextInt();
		
		int res=1;
		for (int i = 2; i <=fact; i++) {
			res*=i;
			
		}
		System.out.println(res);
		sc.close();
		
	}

}
