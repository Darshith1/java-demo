package twofile;

import java.util.Arrays;
import java.util.Scanner;

public class Manager_opration {
	public static void main(String[] args) {
		Mathoperation ob = new Mathoperation();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lb");
		int lb = sc.nextInt();
		System.out.println("enter ub");
		int ub = sc.nextInt();
		
		int count = ob.countprimes(lb, ub);
		int primes[] = ob.getprimerange(lb, ub);
		System.out.println(count);
		System.out.println(Arrays.toString(primes));
		sc.close(); 
		
	}

}
