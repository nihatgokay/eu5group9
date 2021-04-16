package assignments.lab2;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        
	        System.out.println("Enter the amount of purchase");
	        
	        double amount=sc.nextDouble();
	        
	        double stateTax=2;
	        double countryTax=4;
	        
	        totalsalestax(amount, stateTax, countryTax);
	        
	        sc.close();
	        
	        
	    }

	    public static void totalsalestax(double amount, double stateTax, double countryTax) {
	        
	        double statesalestax = amount*stateTax/100;
	        double countrysalestax = amount*countryTax/100;
	        double totalsalestax=statesalestax+countrysalestax;
	        double totalsales=amount+statesalestax+countrysalestax;
	        
	        System.out.println("amount of the purchase:$ "+ amount+ ", the state sales tax : $ "+ statesalestax + ", county sales tax:$ " + countrysalestax + 
	                ", the total sales tax : $ " + totalsalestax + ", total of the sale : $ " + totalsales);
	        
	    }

}
