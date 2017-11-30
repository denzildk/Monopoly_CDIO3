/**
 * 
 */
package game_Locig;

/**
 * @author Stonecore
 *
 */
public abstract class AbstractGame {
	private String[] fields = { "Collect M2\nas you pass", "Burger Joint\nResto du Burger", "Pizza House\nPizzaria",
			"Chance", "Candy Store\n", "Ice Cream Parlor\nCremerie", "Just Visiting", "Museaum", "2M2", "Chance", "3M2",
			"4M2", "Free Parking", "1M3", "2M3", "Chance", "3M3", "4M3", "Go to Jaill", "1M4", "2M4", "Chance", "1M5",
			"2M5"

	};
	private String[] rent = { "", "M1", "M1", "", "M1", "M1", "", "M2", "M2", "", "M2", "M2", "", "M3", "M3", "", "M3",
			"M3", "", "M4", "M4", "", "M5", "M5" };

	public AbstractGame() {

	}
	public String[] getRent() {
		return rent;
	}
	public String[] getField() {
		return fields;
	}
	public int getFieldLength() {
		return fields.length;
	}
}
