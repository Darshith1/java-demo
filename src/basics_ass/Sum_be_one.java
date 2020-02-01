package basics_ass;

import java.util.Scanner;

public class Sum_be_one {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num ");
		int num = sc.nextInt();
		int sum = 0;
		
		while(num>0 || sum>9)
		{
			if(num==0) {
				num=sum;
				sum=0;
			}
			sum=sum+num%10;
			num/=10;
		}
		System.out.println(sum);
		sc.close();


	}

}
