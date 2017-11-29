/**
 * 
 */
package boundry;

import java.util.Scanner;

/**
 * @author Stonecore
 *
 */
public class Keyboard {
	Scanner in;

	public Keyboard() {
		in = new Scanner(System.in);
	}

	public int waitForInt() {
		return in.nextInt();
	}
	public int waitForInt(int i, int j) {
		int out =in.nextInt();
		while(!(out>=i && out<=j)) {
			System.out.print("Please enter a number between "+ i+" and " + j + " ");
			out =in.nextInt();
		}
		
		return out;
		
	}
	public void waitForEnter() {
		in.nextLine();
	}

	public String waitForString() {
		return in.next();
	}
}
