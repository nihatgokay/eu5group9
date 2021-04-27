package assignments.assignment8;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a four digit number");
		int num=scan.nextInt();
		if (num>=1000&&num<=9999) {
		boolean result =isPalindrom(num);
		System.out.println(result);
		scan.close();
		}else {
			System.out.println("invalid number");
		System.out.println("enter a four digit number number");
		 num=scan.nextInt();
		}
	}

	public static boolean isPalindrom(int num) {
		int thousands=num/1000;
		int houndredsOf=num%1000/100;
		int tens=num%1000%100/10;
		int theones=num%1000%100%10;
	
			if (thousands==theones&&tens==houndredsOf) {
				return true;
			}else {
				return false;
			}
			
		
		
		
		

	}

}