package assignments.lab2;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of men");
		int numberOfMen=sc.nextInt();
		
		System.out.println("Enter the number of women");
		int numberOfWomen=sc.nextInt();
		int sum=numberOfMen+numberOfWomen;
		double percentOfMen=100.0*numberOfMen/sum;
		double percentOfWomen=100*numberOfWomen/sum;
		System.out.println("percent Of Male: "+percentOfMen);
		System.out.println("percent Of Female: " + percentOfWomen);

	}


	}

