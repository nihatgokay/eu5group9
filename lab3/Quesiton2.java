package assignments.lab3;

import java.util.Scanner;

public class Quesiton2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write a word");
		String word = sc.nextLine();
		System.out.println("write one moere word");
		String word1 = sc.nextLine();
		makeAbba(word,word1);

	}
		public static void makeAbba(String input,String input2) {
			System.out.println(input.concat(input2)+input2.concat(input));
		}

}
