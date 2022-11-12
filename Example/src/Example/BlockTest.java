/**
 * Demonstrate a block of code.
 */
package Example;

/**
 * @author Digvijay Thakur
 *
 */
public class BlockTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		y = 20;
		// the target of this loop is a block
		for(x = 0; x<10; x++) {
		System.out.println("This is x: " + x);
		System.out.println("This is y: " + y);
		y = y - 2;
		}
		

	}

}
