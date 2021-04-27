package assignments.assignment8;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write a number");
		int a=sc.nextInt();
		System.out.println(isEven(a));
		sc.close();

	}

	public static boolean isEven(int num) {
		if (num%2==0) {
			return true;
		}else {
			return false;
		}

	}

}
