package entity;

	/**
	 * Provides an account for the entity.Player class that can handle
	 * getting, checking and adding/subtracting from the account.
	 */

public class Account {

	int Balance, defaultBalance = 20;

	/**
	 * Constructs an account with a balance based on the number of players.
	 * 
	 * @param i The number of players.
	 * @param Balance The starting balance for all players.
	 * @param defaultBalance A number set to 20 that can be changed if necessary
	 */

	public Account(int i) {
		Balance = (defaultBalance - (i - 2) * 2);
		//balanceCheck();
	}

	/**
	 * Returns the balance as a integer, this method will be expanded in the entity.Player class.
	 * 
	 * @param Balance The player's current balance
	 * @return The current balance
	 */

	public int getBalance() {
		return Balance;
	}

	/**
	 *
	 */

	private void balanceCheck() {
		if (this.Balance < 0)
			this.Balance = 0;
	}

	/**
	 * Sets the balance to something else by adding or subtracting
	 * 
	 * @param Balance The amount that needs to be changed from the player's balance.
	 */
	
	public void addBalance(int Balance) {
		this.Balance += Balance;
		//balanceCheck();
	}
	
	/**
	 * Return the balance as a String, with the valuta "M$" at the end
	 * 
	 * @param Balance The player's current balance
	 * @return The balance + "M$" 
	 */

	public String toString() {
		return Integer.toString(Balance) + "M$";
	}
}
