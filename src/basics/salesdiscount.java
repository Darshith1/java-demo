package basics;
import java.util.*;
public class salesdiscount {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the bill amount");
		float bill = sc.nextInt();
		sc.nextLine();
		System.out.println("do u have member ship card");
		String memcard = sc.nextLine();
		float discount =0;
		
		if(memcard.equalsIgnoreCase("y")) {
			discount = bill*0.1f;
		}else {
			discount = bill*0.03f;
			
		}
				
		float net_ammount = bill-discount;
		System.out.println("your bill ammount is "+net_ammount);
		sc.close();
	}

}
