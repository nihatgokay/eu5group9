package assignments.lab3;

public class Question5 {

	public static void main(String[] args) {
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));

	}

	public static String firstHalf(String word) {
		word=word.substring(0,word.length()/2);
		return word;
	}

}
