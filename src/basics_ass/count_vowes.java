package basics_ass;

import java.util.Scanner;

public class count_vowes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the word :");
		String name = sc.next();

		int v_count = 0;
		int c_count = 0;
		for (int i = 0; i < name.length(); i++) {
			
			char ch = name.charAt(i);    // read character orderly 
			
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				v_count++;
				System.out.println("vowles = " + ch);
				break;
			
			default:
				c_count++;
				System.out.println("consonunt = " + ch);
			}
		}
		System.out.println("...................................");
		System.out.println("the vowule coount is " + v_count);
		System.out.println("the consonunt count is " + c_count);
		sc.close();

	}

}
