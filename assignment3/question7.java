/**
 * 
 */
package assignments.assignment3;

/**
 * @author nihatgokay
 *
 */
public class question7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int price=55;
		int quarter=(100-price)/25;
		int dimes=(100-price)%25/10;
		int nickles=(100-price)%25%10/5;
		System.out.println("Price in cents: " + price);
		System.out.println("Your change is " + quarter + " quarters, " + dimes + " dimes,and " + nickles + " nickles");
	}

}
