package boundry;

/**
 * @author Stonecore
 *
 */
public class BoundryController {
	private MatadorGUI gui;
	
	/**
	 * Constructs a new GUI (Grafic User Interface) and imports all its methods.
	 */

	public BoundryController() {
		gui = new MatadorGUI();
	}
	
	/**
	 * 
	 * @param string
	 */
	public void showMessage(String string) {
		gui.showMessage(string);
	}

	/**
	 * 
	 * @param msg
	 * @param i
	 */
	public void showMessage(String msg, int i) {
		gui.showMessage(String.format(msg, i));
	}
	
	/**
	 * 
	 * @param msg
	 * @return
	 */

	public int waitForInt(String msg) {
		return gui.waitForInt(msg);

	}
	
	/**
	 * 
	 * @param msg
	 * @param i
	 * @return
	 */

	public String waitForString(String msg, int i) {
		return gui.waitForString(String.format(msg, i));
	}
	
	/**
	 * Sets the visual of the die in the gui to the faceup-value of the die.
	 * @param eyes The faceup-value of the die.
	 */

	public void setDie(int eyes) {
		gui.setDie(eyes);
	}
	
	/**
	 * 
	 * @param currentPlayer
	 * @param eyes
	 * @param playerFields
	 */

	public void moveCar(int currentPlayer, int eyes, int[] playerFields) {
		int oldField = (((playerFields[currentPlayer]-eyes)+24)%24);
		gui.moveCar(oldField, playerFields);
	}
	
	/**
	 * 
	 * @param names A
	 * @param balances
	 */

	public void creatPlayers(String[] names, int[] balances) {
		gui.creatPlayers(names, balances);

	}

	public void setBalances(int[] balances) {
gui.setBalances(balances);		
	}
}
