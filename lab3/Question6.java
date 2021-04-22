package assignments.lab3;

public class Question6 {

	public static void main(String[] args) {
		System.out.println(withOutEnd("hello"));
		System.out.println(withOutEnd("java"));
		System.out.println(withOutEnd("coding"));

	}

	public static String withOutEnd(String word) {
		return word.substring(1, word.length()-1);
	}

}
