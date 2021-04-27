package assignments.assignment8;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write a number");
		int a=sc.nextInt();
		System.out.println(fib(a));
		sc.close();

	}

	public static int fib(int index) {

        int num1 = 0;
        int num2 = 0;

        int sum=0;
        for (int i = 0; i < index; i++) {
            sum = num1 + num2;
            if (sum == 0) {
                num1++;
                num2++;
            }
            num1 = num2;
            num2 = sum;

           
        }
        return sum;

    }

}