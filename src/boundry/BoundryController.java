/**
 * 
 */
package boundry;

/**
 * @author Stonecore
 *
 */
public class BoundryController {
	private MatadorGUI gui;

	public BoundryController() {
		gui = new MatadorGUI();
	}

	public void showMessage(String string) {
		gui.showMessage(string);
	}

	public void showMessage(String msg, int i) {
		gui.showMessage(String.format(msg, i));
	}

	public int waitForInt(String msg) {
		return gui.waitForInt(msg);

	}

	public String waitForString(String msg, int i) {
		return gui.waitForString(String.format(msg, i));
	}

	public void setDie(int eyes) {
		gui.setDie(eyes);
	}

	public void movePlayer(int activePlayer, int eyes) {
		gui.movePlayer(activePlayer, eyes);
	}

	public void creatPlayers(String[] names, int[] balances) {
		gui.creatPlayers(names, balances);
		
	}
}
