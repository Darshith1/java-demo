package basics;

import java.util.Scanner;

public class hotel {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("order yorrr itemm.......");
		System.out.println("1.idli\n2.dose\n3.vade\n4.poori");
		int item = sc.nextInt();
		switch(item) {
		case 1: System.out.println("item you order is idli\ncost is 30");
		break;
		case 2: System.out.println("item  you order is dose \n cost is 20");
		break;
		case 3: System.out.println("item you order is vade\n cost is 10");
		break;
		case 4: System.out.println("item you order is poori\n cost is 45");
		}
		sc.close(); 
		
	}

}
