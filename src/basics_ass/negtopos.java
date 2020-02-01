package basics_ass;

// print number from negative to postive 

import java.util.Scanner;

public class negtopos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {   //for infinite run of prgrm
			
		System.out.println("enter the number");
		int num = sc.nextInt();
		if(num>=1) {
			System.out.println("the result is "+num);
		}else {
			System.out.println("the reslt is "+(-num));

		
		}
		sc.close();
		}
		
	}
	}

