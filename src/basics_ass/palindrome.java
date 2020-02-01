package basics_ass;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	for(;;) {
	System.out.println("enter the num");
	int num = sc.nextInt();
	
 	int temp = num;
	int rev=0;
	
	while(num!=0) {
		rev = rev*10;
		rev = rev + num%10;
		num = num/10;

	}
	if(temp==rev) {
		System.out.println("the num "+temp+" is a palindrome");
	}else {
		System.out.println("the num "+temp+" is not a palindrome");
	}
	sc.close();
	}
	

}}
