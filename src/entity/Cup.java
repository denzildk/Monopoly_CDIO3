/**
 * 
 */
package entity;

/**
 * @author Stonecore
 *
 */
public class Cup {
	private int eyes;

	public void rollCup() {
		eyes = Dice();
	}

	public int getEyes() {
		return eyes;
	}

	private int Dice() {
		return (int) ((Math.random() * 6) + 1);
	}
}
