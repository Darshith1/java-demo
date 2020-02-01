package basics;

import java.util.Scanner;

public class game{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the ammount of purchase:");
		float ammount = sc.nextFloat();
		float discount = 0;
		
		if(ammount>=1000) {
			
			discount = ammount*0.1f;
		}
		float netammount = ammount-discount;
		System.out.println("ammount :"+ammount);
		System.out.println("discount :"+discount);
		System.out.println("final ammount :"+netammount);
		sc.close();
		
	}

}
