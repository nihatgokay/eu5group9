package assignments.assignment8;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		plus();

	}

	public static void plus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("write two numbers");
		int n1 = sc.nextInt();
		int n2 =sc.nextInt();
		int sum = n1+n2;
		System.out.println(sum);
		sc.close();
	}

}

