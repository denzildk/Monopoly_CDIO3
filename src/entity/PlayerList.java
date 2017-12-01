package entity;

/**
 * Provides an array of players for the controller.Controller class that can handle the action of
 * creating players with a name and an account, checking whenever the game is over, 
 * printing the player's balance as a String and using methods from the entity.Account class.
 * 
 * This class should only be imported from the controller.Controller class.
 */

public class PlayerList {
	private Player[] players;
	private int activePlayer = 0;
	
	/**
	 * Constructs a playerlist with i players from the entity.Player class.
	 * 
	 * @param i The total number of player.
	 * @param j The current player that is being constructed.
	 * @param players A single player.
	 * @param players[] An array of player ranging from 0 to i-1.
	 */

	public PlayerList(int i) {
		players = new Player[i];
		for (int j = 0; j < i; j++) {
			players[j] = new Player(i);
		}
	}
	
	/**
	 * Sets the name of the player.
	 * @see Player#setName(String name)
	 * 
	 * @param name The name of the player.
	 * @param i The place in the players[] that will be set.
	 */

	public void setName(String name, int i) {
		players[i].setName(name);
	}
	
	/**
	 * Returns all the names of the player 
	 * 
	 * @param name The player's name
	 * @param account The player's current balance
	 * 
	 * @return All the playernames
	 */

	public String toString() {
		String out = "";
		for (int i = 0; i < players.length; i++) {
			out += "\n" + players[i];
		}
		return out;
	}
	
	/**
	 * Adds a value to a given player's account.
	 * @see Player#addBalance()
	 * 
	 * @param player The player that needs a change in their balance.
	 * @param valuta A value that will be added to the balance.
	 */

	public void addBalance(int player, int valuta) {
		this.players[player].addBalance(valuta);
	}
	
	/**
	 * Returns the indexnumber of the player[] position of the active player
	 * 
	 * @param activePlayer The player who have have yet to enter a command to roll the die,
	 * or have just rolled the die before passing the die to the next player.
	 * 
	 * @return The indexnumber of the current active player.
	 */

	public int getActivePlayer() {
		return activePlayer;
	}
	
	/**
	 * Sets the activePlayer to the next player in the players[]
	 * 
	 * @param activePlayer The player who have have yet to enter a command to roll the die,
	 * or have just rolled the die before passing the die to the next player.
	 */

	public void passTurn() {
		this.activePlayer = ++activePlayer % players.length;
	}
	
	/**
	 * Returns a player's name from the players[] based on the integer input.
	 * 
	 * @param player The indexnummer in the players[]
	 * @return The player's name
	 */

	public String getName(int player) {
		return players[player].getName();
	}
	
	/**
	 * Returns a boolean based on the state of the game.
	 * As long as any player have not reached under 0 in their balance,
	 * the returned boolean will be false, otherwise it will be true.
	 * 
	 * @see Player#gameOver
	 * @return <code>true</code> if any player have under 0 in their balance; <code>false</code> otherwise.
	 * 
	 */

	public boolean gameEnd() {
		boolean loosers = false;
		for (int i = 0; i < players.length; i++) {
			if (players[i].gameOver() == true) {
				loosers = true;
			}
		}
		
		return loosers;
	}
	
	/**
	 * Returns a String with the playername and their balance from the players[] with the indexnumber i.
	 * 
	 * @i The indexnumber for the player in the players[], whose name is needed.
	 * @return "player " + name + " has " + account + " in their bank."
	 */

	public String toString(int i) {
		return players[i].toString();
	}
	
	/**
	 * Returns a String of all the player's name from the players[].
	 * 
	 * @see Player#getName
	 * @i The total number of players.
	 * @return The player's name.
	 */

	public String[] getNames(int i) {
		String[] out = new String[i];
		for(int j=0; j<i;j++) {
			out[j] = players[j].getName();
			
		}
			
		return out;
	}
	
	/**
	 * Returns an int[] with all the players balances.
	 * 
	 * @i The total number of players.
	 * @return An array of all balances.
	 */

	public int[] getBalances() {
		int[] out = new int[players.length];
		for(int j=0; j<players.length;j++) {
			out[j] = players[j].getBalance();
		}
		return out;
	}
	
	/**
	* Returns the balance of the player in the player[] with the indexnumber i.
	*
	* @i The indexnumber for the player in the players[].
	* @return The player in index i's balance
	*/
	
	public int getBalance(int i) {
		return players[i].getBalance();
	}
	
	/**
	* Sets the player in the player[] with the indexnumber player,
	* fields placement to the field with the given fieldnumber.
	*
	* @player The indexnumber for the player in the players[].
	* @param field The fieldnumber. The field "Start is number 0".
	*/
	
	public void setField(int player, int field) {
		players[player].setField(field);
	}
	
	/**
	* Returns the field placement of the player in the player[] with the indexnumber player.
	*
	* @player The indexnumber for the player in the players[].
	* @return The fieldnumber for the player.
	*/
	
	public int getField(int player) {
		return players[player].getField();
	}
	
	/**
	* Sets the players field location to the field number of
	* the player's old field location plus the faceup-value of the die.
	*
	* @param eyes The faceup-value on the die.
	* @param field The fieldnumber. The field "Start is number 0".
	*/
	
	public void addToField(int player,int eyes, int fields) {
		players[player].addToField(eyes, fields);;
	}
	
	/**
	* Returns the field placement as integers of all players in the player[].
	*
	* @return The fieldnumber for the player.
	*/

	public int[] getFields() {
		int[] out = new int[players.length];
		for(int i=0;i<out.length;i++)
			out[i] = players[i].getField();
		return out;
	}
}
