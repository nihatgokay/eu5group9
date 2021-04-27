package assignments.assignment8;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write how much you used water");
		int a=sc.nextInt();
		System.out.println("bill is : " + waterTax(a));
		sc.close();

	}

	public static double waterTax(double unit) {
		if (unit<=50) {
			return unit*0.60;
		}
		if (unit>50&&unit<=100) {
			return unit*0.90;
		}else
			if (unit>100&&unit<=150) {
				return unit*0.90+50;
			}else
		return unit*0.90+100 ;

	}

}
