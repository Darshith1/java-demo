package basics;

import java.util.*;

public class sumofnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //sum of 2 number
		
		System.out.println("enter the num_1 vallue: ");																				
	    int num_1 = sc.nextInt();
	    
	    System.out.println("eneter the num_2 value");
	    int num_2 = sc.nextInt();
	    
	    int sum = num_1 + num_2;
	    
	    System.out.println("the sum of "+ num_1 +" and "+ num_2 +" is "+ sum);
	    sc.close();
	
	}

}
