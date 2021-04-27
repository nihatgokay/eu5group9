package assignments.assignment8;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write two numbers");
		int n1 = sc.nextInt();
		int n2 =sc.nextInt();
		System.out.println(max(n1,n2));
		sc.close();

	}

	public static int max(int x, int max) {
		if (x>max) {
			return max;
		}else {
			return x;
		}
		
		
	
	}

}
