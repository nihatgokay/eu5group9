/**
 * 
 */
package assignments.assignment3;

/**
 * @author nihatgokay
 *
 */
public class question5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int inputSeconds,hours,minutes,seconds;
		inputSeconds=3695;
		hours=inputSeconds/3600;
		minutes=(inputSeconds%3600)/60;
		seconds=(inputSeconds%3600)%60;
		System.out.println(inputSeconds + " seconds= " + hours + " hours " + minutes + " minutes " + seconds + " seconds");

	}

}
