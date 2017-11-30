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
	private int field;

	public boolean gameOver() {
		if (account.getBalance() < 0)
			return true;
		else
			return false;
	}

	public Player(int i) {
		account = new Account(i);
		name = "";
		field = 0;
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
	public void setField(int field) {
		this.field = field;
	}
	public int getField() {
		return field;
	}
	public void addToField(int eyes, int fields) {
		this.field = (field+eyes)%fields;
	}
}
