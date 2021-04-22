package assignments.lab3;

public class Question3 {

	public static void main(String[] args) {
		extraEnd("Hello");
		extraEnd("ab");
		extraEnd("Hi");
	

	}

	public static void extraEnd(String word) {
		if(word.length()>=2) {
			for(int i=0;i<=2;i++) {
			word=word.substring(word.length()-2);
			System.out.print(word);
			}System.out.println();
			}else {
			System.out.println("not eligible");
		}		

	}

}
