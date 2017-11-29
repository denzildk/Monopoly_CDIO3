import java.awt.Color;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class Main {

	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.setDice(3, 4);
		gui.showMessage("wololo");
		gui.displayChanceCard();
		GUI_Car car = new GUI_Car();
		car.setPrimaryColor(Color.YELLOW);
		gui.addPlayer(new GUI_Player("Rambo",1000,car));
	}
}
