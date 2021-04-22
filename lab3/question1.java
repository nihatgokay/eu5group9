package assignments.lab3;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("write your name");
		String name = sc.nextLine();
		System.out.println(helloname(name));
	}
	
		public static String helloname(String input) {
		return "Hello ".concat(input).concat("!");
		}
}
