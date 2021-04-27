package assignments.assignment8;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		cube();

	}

	public static void cube() {
		Scanner sc = new Scanner(System.in);
		System.out.println("write the edge number");
		double n1 = sc.nextDouble();
		System.out.println(n1*n1*n1);
		sc.close();
		
	}

}
