package assignments.lab2;


import java.util.Scanner;

public class question1 {

	
	
		public static void main(String[] args) {


	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter your first number:");
	        int num1 = sc.nextInt();
	        int smallestnumber;
	        int largestnumber;

	        int select = 0;

	        System.out.println("Enter your next number");

	        int num2 = sc.nextInt();

	        if (num1 > num2) {
	            largestnumber = num1;
	            smallestnumber = num2;
	        } else {
	            smallestnumber = num1;
	            largestnumber = num2;
	        }

	        do {
	            System.out.println("Do you want to another number: 0- No, 1-Yes");

	            select = sc.nextInt();
	            if (select==0) {
	                break;
	            }
	            System.out.println("Enter your next number");

	            int num3 = sc.nextInt();

	            if (num3 > largestnumber) {

	                largestnumber = num3;

	            } else if (num3 < smallestnumber) {

	                smallestnumber = num3;

	            }

	        } while (select == 1);

	        System.out.println("Smallest Number is: " + smallestnumber);
	        System.out.println("Largest Number is: " + largestnumber);
	   sc.close();
		}
	}

	


