package boundry;

import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;

public class MatadorGUI {
	private GUI gui;
	private GUI_Field[] fields;
	MatadorGUI() {
		gui = new GUI();
	};

	public void showMessage(String string) {
		gui.showMessage(string);
	}
	public void setFields(String[] fields, String[] rent) {
		for(int i=0; i>fields.length;i++) {
			this.fields[i] = new GUI_Street();
			this.fields[i].setDescription(fields[i]);
			this.fields[i].setSubText(rent[i]);
		}
	}

	public int waitForInt(String msg) {
		return gui.getUserInteger(msg, 2, 4);

	}

	public String waitForString(String msg) {
		return gui.getUserString(msg);

	}

	public void initBoard(GUI_Field[] fields) {
		gui.getFields();
	}

	public void setDie(int i) {
		gui.setDie(i);
	}

	public void movePlayer(int activePlayer, int eyes) {
fields[activePlayer].removeAllCars();		
	}

}
