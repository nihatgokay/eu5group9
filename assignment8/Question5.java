package assignments.assignment8;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write a number");
		int num1 = sc.nextInt();
		sc.close();
		System.out.println("sign(" + num1 + ") => " + sign(num1));

	}

	public static int sign(int a) {
		if(a>0) {
			return 1;
		}else if(a<0){
			return -1;
		}else {
			return 0;
		}
		
	}

}
