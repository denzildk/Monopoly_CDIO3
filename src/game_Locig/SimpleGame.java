/**
 * 
 */
package game_Locig;

/**
 * @author Stonecore
 *
 */
public class SimpleGame extends AbstractGame {
	final int[] prices = { 2, -1, -1, 0, -1, -1, 0, -2, -2, 0, -2, -2, 0, -3, -3, 0, -3, -3, 0, -4, -4, 0, -5, -5 };

	public SimpleGame() {
		super();
	}
	public int getPrices(int field) {
		return prices[field];
	}
}
