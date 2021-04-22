package assignments.lab3;

public class Question10 {

	public static void main(String[] args) {
		System.out.println(frontAgain("edited"));
		System.out.println(frontAgain("edit"));
		System.out.println(frontAgain("ed"));

	}

	public static boolean frontAgain(String str) {
		/*
		 if ( str.substring(0,2) == str.substring(str.length()-2) {
		 		return true;
		 }else {
		 		return false;
		 }
		 */
		String first2 = str.substring(0,2);
		String last2 = str.substring(str.length()-2);
		return first2.equals(last2);
		}
	}

