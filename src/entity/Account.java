package entity;

/**
 * This class handles the players' account and its balance. This includes:
 * Initinating a balance with a value. (Constructor). Returning the balance
 * (int). Setting the balance to 0, if balance < 0. (void). Adding/Subtracting
 * from the balance (void).
 * 
 * Called from the class "Player".
 */

public class Account {

	/**
	 * Establises a balance and makes a default value;
	 */

	int Balance, defaultBalance = 20;

	/**
	 * Constructor The default value is made into the (Account) Balance. and a the
	 * method balanceCheck() is run.
	 * @param i 
	 */

	public Account(int i) {
		Balance = (defaultBalance - (i - 2) * 2);
		//balanceCheck();
	}

	/**
	 * Method that returns the current balance.
	 */

	public int getBalance() {
		return Balance;
	}

	/**
	 * Method that checks if the balance is under 0. If the balance is under 0, the
	 * balance is set to 0, due to the requirements of the game.
	 */

	private void balanceCheck() {
		if (this.Balance < 0)
			this.Balance = 0;
	}

	/**
	 * Method that adds a value to the balance to the current balance Afterwards the
	 * method balanceCheck() is run.
	 */
	public void addBalance(int Balance) {
		this.Balance += Balance;
		//balanceCheck();
	}

	public String toString() {
		return Integer.toString(Balance) + "M$";
	}
}