package game_Locig;

/**
 * Provides the logic of the game, which include collecting rent, reading fieldvalues and return the number of fields.
 * 
 * This class should only extends into game_Locig.SimpleGame and only be imported from the controller.Controller class.
 */
public abstract class AbstractGame {
	private String[] fields = { "Collect M2\nas you pass", "Burger Joint\nResto du Burger", "Pizza House\nPizzaria",
			"Chance", "Candy Store\n", "Ice Cream Parlor\nCremerie", "Just Visiting", "Museum", "2M2", "Chance", "3M2",
			"4M2", "Free Parking", "1M3", "2M3", "Chance", "3M3", "4M3", "Go to Jaill", "1M4", "2M4", "Chance", "1M5",
			"2M5"
	};
	private String[] rent = { "", "M1", "M1", "", "M1", "M1", "", "M2", "M2", "", "M2", "M2", "", "M3", "M3", "", "M3",
			"M3", "", "M4", "M4", "", "M5", "M5" };

	public AbstractGame() {

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
	 * Return the length of the entire String[] fields, which have the names for all fields.
	 * 
	 * @return Length of String[] fields.
	 */
	public int getFieldLength() {
		return fields.length;
	}
	public abstract int getPrices(int field);
}
