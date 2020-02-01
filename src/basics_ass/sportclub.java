package basics_ass;

import java.util.Scanner;

public class sportclub {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
	    System.out.println("enter the name");	
	    String name = sc.next();
	    System.out.println("enter mobile number");
	    
	    @SuppressWarnings("unused") //command to suppress warnings
	    
		long num = sc.nextLong();
	    System.out.println("enter the age");
	    int age = sc.nextInt();
	    
	    if(age>=18) {
	    System.out.println(" congratulatio "+name+" for your successfull registration");
	    
	    break;// used to stop prgrm after registration
	    
	    }else {
	    	System.out.println(" sorry you need to be 18+ to get membership");
	    }
	    
	}
		sc.close();
	}
	}


