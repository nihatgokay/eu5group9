package assignments.lab3;

public class Question4 {

	public static void main(String[] args) {
		System.out.println(firstTwo("Hello"));
		System.out.println(firstTwo("abcdefg"));
		System.out.println(firstTwo("ab"));
		System.out.println(firstTwo("H"));
		System.out.print(firstTwo(""));

	}

	public static String firstTwo(String word) {
		if(word.length()>1) {
		word=word.substring(0,2);
		return word;
		}else if(word.isEmpty()){
			return "";
		}else {
			return word;
		}
	}

}
