package assignments.lab3;

public class Question7 {

	public static void main(String[] args) {
		System.out.println(comboString("Hello","hi"));
		System.out.println(comboString("hi","Hello"));
		System.out.println(comboString("aaa","b"));
		

	}

	public static String comboString(String str, String str2) {
		String word;
		if(str.length()<str2.length()) {
		word=str.concat(str2.concat(str));
		}else{
		word=str2.concat(str.concat(str2));
		}
		return word;
	}

}
