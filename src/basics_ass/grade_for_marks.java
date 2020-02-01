package basics_ass;

import java.util.Scanner;

public class grade_for_marks {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("enter the marks scored in first sub");
	int s1 = sc.nextInt();
	System.out.println("enter the marks scored in 2 sub");
	int s2 = sc.nextInt();
	System.out.println("enter the marks scored in 3 sub");
	int s3 = sc.nextInt();
	
    int avg =((s1+s2+s3)/3);
	System.out.println("total marks "+(s1+s2+s3));
	System.out.println("avg of marks "+avg);
	
	if(avg<35) {
		System.out.println("grade 'c'");
		
	}else if(avg>=35 && avg<=60) {
		
		System.out.println("grade B");
	}else {
		
		System.out.println("grade A");
		
	}
	sc.close();
}
}