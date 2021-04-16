package assignments.lab2;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		
			
			int caloriesPerCookies=300/(40/10);
			System.out.println("Enter the number of cookies");
			Scanner sc=new Scanner(System.in);
			int numberOfCookies=sc.nextInt();
			int totalCaloriesConsume=numberOfCookies*caloriesPerCookies;
			System.out.println("total calories= " + totalCaloriesConsume);
			
			

		}


	}

