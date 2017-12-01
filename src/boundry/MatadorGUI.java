package boundry;

import java.awt.Color;

import gui_fields.GUI_Car;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;
import gui_fields.GUI_Player;
import gui_fields.GUI_Refuge;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;
import gui_main.GUI;

public class MatadorGUI {
	private GUI gui;
	GUI_Field[] fields;
	private GUI_Player[] player;
	private GUI_Car[] car;
	final Color[] colorList = { Color.YELLOW, Color.BLUE, Color.GREEN, Color.RED };

	/**
	 * 
	 */
	MatadorGUI() {
		fields = new GUI_Field[24];
		fields[0] = new GUI_Start("Start", "take: 2", "take 2, when passing start", Color.RED, Color.BLACK);
		fields[1] = new GUI_Street("Burger joint", "Prise: 1", "Burger", "Rent:  1", new Color(75, 155, 225),
				Color.BLACK);
		fields[2] = new GUI_Street("Pizza house", "Prise: 1", "Pizza", "Rent:  1", new Color(75, 155, 225),
				Color.BLACK);
		fields[3] = new GUI_Chance("?", "Chance Card", "take a chance card", new Color(204, 204, 204), Color.BLACK);
		fields[4] = new GUI_Street("Candy store", "Prise: 1", "Candy store", "Rent:  1", new Color(255, 135, 120),
				Color.BLACK);
		fields[5] = new GUI_Street("Icecream shop", "Prise: 1", "Icecream", "Rent:  1", new Color(255, 135, 120),
				Color.BLACK);
		fields[6] = new GUI_Jail("default", "Jail", "Jail", "Just visiting Jail", new Color(125, 125, 125),
				Color.BLACK);
		fields[7] = new GUI_Street("Musium", "Pris: 2", "Musium", "Rent: 2", new Color(102, 204, 0), Color.BLACK);
		fields[8] = new GUI_Street("Library", "Pris: 2", "Library", "Rent: 2", new Color(102, 204, 0), Color.BLACK);
		fields[9] = new GUI_Chance("?", "Chance Card", "take a chance card", new Color(204, 204, 204), Color.BLACK);
		fields[10] = new GUI_Street("Skater Park", "Pris: 2", "Skater Park", "Rent: 2", new Color(153, 153, 153),
				Color.BLACK);
		fields[11] = new GUI_Street("Swimming Pool", "Pris: 2", "Swimming Pool", "Rent: 2", new Color(153, 153, 153),
				Color.BLACK);
		fields[12] = new GUI_Refuge("default", "Parking", "Parking", "Take a break", Color.WHITE, Color.BLACK);
		fields[13] = new GUI_Street("Arcade", "Pris: 3", "Arcade", "Rent: 3", Color.RED, Color.BLACK);
		fields[14] = new GUI_Street("Cinema", "Pris: 3", "Cinema", "Rent: 3", Color.RED, Color.BLACK);
		fields[15] = new GUI_Chance("?", "Chance Card", "take a chance card", new Color(204, 204, 204), Color.BLACK);
		fields[16] = new GUI_Street("Toy Store", "Pris: 3", "Toy Store", "Rent: 3", Color.YELLOW, Color.BLACK);
		fields[17] = new GUI_Street("Pet Store", "Pris: 3", "Pet Store", "Rent: 3", Color.YELLOW, Color.BLACK);
		fields[18] = new GUI_Jail("default", "Go to Jail", "Go to Jail", "Go to Jail Without passing the Start",
				new Color(125, 125, 125), Color.BLACK);
		fields[19] = new GUI_Street("Balling Ally", "Pris: 4", "Balling Ally", "Rent: 4", new Color(255, 255, 50),
				Color.BLACK);
		fields[20] = new GUI_Street("Zoo", "Pris: 4", "Zoo", "Rent: 4", new Color(255, 255, 50), Color.BLACK);
		fields[21] = new GUI_Chance("?", "Chance Card", "take a chance card", new Color(204, 204, 204), Color.BLACK);
		fields[22] = new GUI_Street("Park Place", "Pris: 5", "Park Place", "Rent: 5", new Color(150, 60, 150),
				Color.WHITE);
		fields[23] = new GUI_Street("Port Walk", "Pris: 5", "Port Walk", "Rent: 5", new Color(150, 60, 150),
				Color.WHITE);
		gui = new GUI(fields);
		car = new GUI_Car[4];
		player = new GUI_Player[4];
		// car = new GUI_Car[2];
		// car[0] = new GUI_Car();
		// car[1] = new GUI_Car();
		// car[0].setPrimaryColor(Color.YELLOW);
		// car[1].setPrimaryColor(Color.BLUE);
		// player = new GUI_Player[2];
		// player[0] = new GUI_Player("abc", 20, car[0]);
		// player[1] = new GUI_Player("def", 20, car[1]);
	}

	/**
	 * 
	 * @param name
	 * @param balance
	 */
	public void creatPlayers(String[] name, int[] balance) {
		for (int i = 0; i < name.length; i++) {
			car[i] = new GUI_Car();
			car[i].setPrimaryColor(colorList[i]);
			player[i] = new GUI_Player(name[i], balance[i], car[i]);
			gui.addPlayer(player[i]);
			fields[0].setCar(player[i], true);
		}
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
	 * @return
	 */
	public int waitForInt(String msg) {
		return gui.getUserInteger(msg, 2, 4);

	}

	/**
	 * 
	 * @param msg
	 * @return
	 */
	public String waitForString(String msg) {
		return gui.getUserString(msg);

	}

	/**
	 * 
	 * @param fields
	 */
	public void initBoard(GUI_Field[] fields) {
		gui.getFields();
	}

	/**
	 * 
	 * @param i
	 */
	public void setDie(int i) {
		gui.setDie(i);
	}

	/**
	 * 
	 * @param oldField
	 *            Indexnumber for the old field in the fields[].
	 * @param playerFields
	 */
	public void moveCar(int oldField, int[] playerFields) {
		fields[oldField].removeAllCars();
		for (int i = 0; i < playerFields.length; i++) {
			fields[playerFields[i]].setCar(player[i], true);
		}
	}

	public void setBalances(int[] balances) {
		for (int i = 0; i < balances.length; i++) {
			player[i].setBalance(balances[i]);
		}
	}

}
