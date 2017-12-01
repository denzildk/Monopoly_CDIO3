package game_Locig;

/**
 * Provides the logic of the game, which include collecting rent, reading
 * fieldvalues and return the number of fields.
 * 
 * This class should only extends into game_Locig.SimpleGame and only be
 * imported from the controller.Controller class.
 */
public abstract class AbstractGame {
	private String[] fields = { "Collect M2\nas you pass", "Burger Joint\nResto du Burger", "Pizza House\nPizzaria",
			"Chance", "Candy Store\n", "Ice Cream Parlor\nCremerie", "Just Visiting", "Museum", "2M2", "Chance", "3M2",
			"4M2", "Free Parking", "1M3", "2M3", "Chance", "3M3", "4M3", "Go to Jaill", "1M4", "2M4", "Chance", "1M5",
			"2M5" };
	private String[] rent = { "", "M1", "M1", "", "M1", "M1", "", "M2", "M2", "", "M2", "M2", "", "M3", "M3", "", "M3",
			"M3", "", "M4", "M4", "", "M5", "M5" };
	private boolean[] bought = new boolean[24];
	private int[] fieldOwner = new int[24];

	public AbstractGame() {
		for (int i = 0; i < bought.length; i++) {
			bought[i] = false;
		}
		for (int i = 0; i < fieldOwner.length; i++) {
			fieldOwner[i] = 0;
		}
	}

	/**
	 * Returns the entire String[] rent, which have all the prices for the fields.
	 * 
	 * @return The String[] rent
	 */
	public String[] getRent() {
		return rent;
	}

	/**
	 * Return the entire String[] fields, which have all the names for the fields.
	 * 
	 * @return The String[] fields
	 */
	public String[] getField() {
		return fields;
	}

	/**
	 * Return the length of the entire String[] fields, which have the names for all
	 * fields.
	 * 
	 * @return Length of String[] fields.
	 */
	public int getFieldLength() {
		return fields.length;
	}

	public abstract int getPrices(int field);

	public void checkRules(int activePlayer, int field) {
		if (bought[field] == false) {
			bought[field] = true;
			fieldOwner[field] = activePlayer;

		}
	}

	public int getOwner(int field) {
		return fieldOwner[field];
	}

	public abstract int getPrice(int field);

	public int getWinner(int[] balances) {
		int winner = 0;
		for (int i = 1; i < balances.length; i++) {
			if (balances[i] > balances[i - 1]) {
				winner = i;
			}
		}
		return winner + 1;
	}
}
