package boundry;

import java.util.Scanner;

/**
 * Provides 
 *
 */
public class Keyboard {
	Scanner in;
	
	/**
	 * 
	 */
	public Keyboard() {
		in = new Scanner(System.in);
	}
	

	/**
	 * 
	 * @return
	 */
	public int waitForInt() {
		return in.nextInt();
	}
	
	/**
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	public int waitForInt(int i, int j) {
		int out =in.nextInt();
		while(!(out>=i && out<=j)) {
			System.out.print("Please enter a number between "+ i+" and " + j + " ");
			out =in.nextInt();
		}
		return out;
	}
	
	/**
	 * 
	 */
	public void waitForEnter() {
		in.nextLine();
	}
	
	/**
	 * 
	 * @return
	 */
	public String waitForString() {
		return in.next();
	}
}
