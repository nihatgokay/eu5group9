package assignments.assignment8;

public class Question16 {

	public static void main(String[] args) {
		System.out.println(simpleRoomBook(false,2,1,2018));
	    System.out.println(simpleRoomBook(true,2,1,2018));
	    System.out.println(simpleRoomBook(true,7,2,2018));
	    
		}

		private static boolean simpleRoomBook(boolean b, int i, int j, int k) {
			return b&&(i!=7||!(j>=1&&j<=8)&&k==2018);

	}

}
