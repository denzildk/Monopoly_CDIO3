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

	public String[] getNames(int i) {
		String[] out = new String[i];
		for(int j=0; j<i;j++) {
			out[j] = players[j].getName();
			
		}
			
		return out;
	}

	public int[] getBalances(int i) {
		int[] out = new int[i];
		for(int j=0; j<i;j++) {
			out[j] = players[j].getBalance();
			
		}
			
		return out;
	}
	public int getBalance(int i) {
		return players[i].getBalance();
	}
	public void setField(int player, int field) {
		players[player].setField(field);
	}
	public int getField(int player) {
		return players[player].getField();
	}
	public void addToField(int player,int eyes, int fields) {
		players[player].addToField(eyes, fields);;
	}

	public int[] getFields() {
		int[] out = new int[players.length];
		for(int i=0;i<out.length;i++)
			out[i] = players[i].getField();
		return out;
	}
}
