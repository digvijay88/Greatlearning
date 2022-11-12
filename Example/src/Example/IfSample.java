/**
 * Demonstrate the if.
 */
package Example;

/**
 * @author Digvijay Thakur
 *
 */
public class IfSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		x = 10;
		y = 20;
		if(x < y) System.out.println("x is less than y");
		x = x * 2;
		if(x == y) System.out.println("x now equal to y");
		x = x * 2;
		if(x > y) System.out.println("x now greater than y");
		// this won't display anything
		if(x == y) System.out.println("you won't see this");

	}

}
