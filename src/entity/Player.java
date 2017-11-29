/**
 * 
 */
package entity;

/**
 * @author Stonecore
 *
 */
public class Player {
	private Account account;
	private String name;

	public boolean gameOver() {
		if (account.getBalance() < 0)
			return true;
		else
			return false;
	}

	public Player(int i) {
		account = new Account(i);
		name = "";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return account.getBalance();
	}

	public void addBalance(int value) {
		account.addBalance(value);
	}

	public String toString() {
		return "player " + name + " has " + account + " in their bank.";
	}
}
