package assignments.lab2;

import java.util.Iterator;
import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		System.out.println("Enter a positive nonzero number that  sum of all the integers from 1 up to the number entered. ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int sum=0;
		if (number>=1) {
			for (int i = 1; i <= number; i++) {
				sum+=i;
			}
			System.out.println("Sum of all the integers from 1 up to the "+ number +" = " + sum);
			
		}else {
			System.out.println("invalid number");
		}
		
	}

	}
