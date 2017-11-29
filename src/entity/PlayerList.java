/**
 * 
 */
package entity;

/**
 * @author Stonecore
 *
 */
public class PlayerList {
	private Player[] players;
	private int activePlayer = 0;

	public PlayerList(int i) {
		players = new Player[i];
		for (int j = 0; j < i; j++) {
			players[j] = new Player(i);
		}
	}

	public void setName(String name, int i) {
		players[i].setName(name);
	}

	public String toString() {
		String out = "";
		for (int i = 0; i < players.length; i++) {
			out += "\n" + players[i];
		}
		return out;
	}

	public void addBalance(int player, int valuta) {
		this.players[player].addBalance(valuta);
	}

	public int getActivePlayer() {
		return activePlayer;
	}

	public void passTurn() {
		this.activePlayer = ++activePlayer % players.length;
	}

	public String getName(int player) {
		return players[player].getName();
	}

	public boolean gameEnd() {
		boolean loosers = false;
		for (int i = 0; i < players.length; i++) {
			if (players[i].gameOver() == true) {
				loosers = true;
			}
		}
		
		return loosers;
	}

	public String toString(int i) {
		return players[i].toString();
	}
}
