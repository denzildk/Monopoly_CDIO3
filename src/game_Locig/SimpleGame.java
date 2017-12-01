package game_Locig;

/**
 * Provides the methods for all prices for all fields,
 * which only include returning a price from a specific field.
 *
 * @See AbstractGame
 */
public class SimpleGame extends AbstractGame {
	final int[] prices = { 2, -1, -1, 0, -1, -1, 0, -2, -2, 0, -2, -2, 0, -3, -3, 0, -3, -3, 0, -4, -4, 0, -5, -5 };

	/**
	 * Constructs a Gameboard with the method from the Abstract_Locig class.
	 */
	public SimpleGame() {
		super();
	}
	
	/**
	 * Returns the price of a single field from the int[] prices, where all prices are stored.
	 * 
	 * @param field The index number of a field.
	 * @return The The price of the field.
	 */
	public int getPrices(int field) {
		return prices[field];
	}
}