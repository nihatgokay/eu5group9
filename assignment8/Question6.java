package assignments.assignment8;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write a number");
		int num1 = sc.nextInt();
		sc.close();
		next3(num1);

	}

	public static void next3(int a) {
		System.out.println("next 3 are " + (a+1) +" "+ (a+2) +" "+ (a+3));
		
	}

}
