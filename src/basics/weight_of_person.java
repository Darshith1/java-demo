package basics;

import java.util.Scanner;

public class weight_of_person {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the person 1 weight");
	    float p1 = sc.nextFloat();
	    System.out.println("enter the person 2 weight");
	    float p2 = sc.nextFloat();
	    System.out.println("enter the person 3 weight");
	    float p3 = sc.nextFloat();
	     
	    float sum = p1+p2+p3;
	    float avg = sum/3 ;
	    System.out.println("the sum of 3 perosn weight is "+sum+"kgs and the avg of 3 weight is "+avg);
	    sc.close();
	      
	    
	    
	
	}

}
