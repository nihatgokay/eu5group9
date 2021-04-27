package assignments.assignment8;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write the buy price");
		int n1 = sc.nextInt();
		System.out.println("write the sell price");
		int n2 =sc.nextInt();
		System.out.println(c_profits(buyPrice(n1),sellPrice(n2)));
		sc.close();

	}

	private static String c_profits(int buyPrice, int sellPrice) {
		if (buyPrice<sellPrice) {
			return "profit";
		}else if (buyPrice>sellPrice) {
			return "loss";
		}else
		return "no loss";
	}

	private static int  sellPrice(int i) {
		
		return i;
	}

	private static int buyPrice(int i) {
		
		return i;

	}

}
