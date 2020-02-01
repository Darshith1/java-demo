package project;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num of subjects:");
		int sub = sc.nextInt();

		String[] sname = new String[sub];
		int[] credit = new int[sub];
		int[] intmark = new int[sub];
		int[] semmark = new int[sub];
		int[] finmark = new int[sub];

		for (int i = 0; i < sname.length; i++) {
			System.out.println("enter the " + (i + 1) + " subject name ");
			sname[i] = sc.next();
			System.out.println("enter the " + sname[i] + " credits");
			credit[i] = sc.nextInt();
		}

		for (int i = 0; i < credit.length; i++) {
			System.out.println("enter the internals marks of the subject " + sname[i].toUpperCase());
			intmark[i] = sc.nextInt();
			System.out.println("enter the predicted Sem marks of the subject " + sname[i].toUpperCase());
			semmark[i] = sc.nextInt();

		}

		System.out.println("your subject and credits aree");
		// System.out.println("...........................................................................................");
		// System.out.println("SUBJECT \tCREDITS \tINTERNALS MARKS \tSEMESTER MARKS");
		// System.out.println("............................................................................................");
		// for (int i = 0; i < credit.length; i++) {
		// System.out.println(sname[i].toUpperCase() + "\t \t " + credit[i] + "\t\t" +
		// intmark[i] + "\t\t\t" + semmark[i]);
		// }
		float creditsum = 1;
		float total = 0;
		for (int i = 0; i < sname.length; i++) {

			// int[] finmark = new int[sub];

			finmark[i] = (intmark[i] / 2) + (semmark[i] / 2);
			total = finmark[i] * credit[i];
			creditsum = creditsum * credit[i];

		}
		System.out.println(total);
		System.out.println(creditsum);

		float sgpa = total / creditsum;
		System.out.println(
				"_____________________________________________________________________________________________________");
		System.out.println("SUBJECT \tCREDITS \tINT MARKS \tSEM MARKS \tfinal \t grade ");
		System.out.println(
				"____________________________________________________________________________________________________");
		for (int i = 0; i < credit.length; i++) {
			System.out.println(sname[i].toUpperCase() + "\t \t " + credit[i] + "\t\t" + intmark[i] + "\t\t" + semmark[i]
					+ "\t\t" + finmark[i]);

		}
		System.out.println("sgpa = " + sgpa);
	}
}
