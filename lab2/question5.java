package assignments.lab2;


import java.util.Scanner;


public class question5 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        
	        System.out.println("Enter the charge for the meal");
	        
	        double charge=sc.nextDouble();
	        
	        chargeAccount(charge);
	        
	        
	        

	    }

	    public static void chargeAccount(double charge) {
	        
	        double tax=charge*6.75/100;
	        double tip=(charge+tax)*0.2;
	        double totalbill=charge+tax+tip;
	        
	        System.out.println("meal charge: $" + charge + ", tax amount: $" + tax + ", tip amount: $"+ tip + ", total bill $: " + totalbill);
	        
	        
	    }



}
