/**
 * 
 */
package controller;

import boundry.BoundryController;
import boundry.Keyboard;
import entity.Cup;
import entity.PlayerList;
import game_Locig.AbstractGame;
import game_Locig.SimpleGame;
import localisation.Out;

/**
 * @author Stonecore
 *
 */

/**
 * 
 */
public class Controller {
	private Keyboard keyboard;
	private Out out;
	private PlayerList players;
	private AbstractGame game;
	private Cup cup;
	private BoundryController boundry;

	public Controller() {
		keyboard = new Keyboard();
		out = new Out();
		cup = new Cup();
		boundry = new BoundryController();
	}

	public void gamecontroler() {
		boundry.showMessage("controller launched");
		playerInit();
		// System.out.println(players);
		game = new SimpleGame();

		runGame(players);
		keyboard.waitForEnter();
	}

	private void runGame(PlayerList players) {
		do {
			boundry.showMessage(String.format(out.getString("playerTurn"), players.getName(players.getActivePlayer())));
			cup.rollCup();
			boundry.setDie(cup.getEyes());
			players.addToField(players.getActivePlayer(), cup.getEyes(), game.getFieldLength());
			boundry.moveCar(players.getActivePlayer(), cup.getEyes(), players.getFields());
			players.addBalance(players.getActivePlayer(), game.getPrices(players.getField(players.getActivePlayer())));
			System.out.println(players.getBalance(players.getActivePlayer()));
			players.passTurn();
		} while (players.gameEnd() == false);
	}

	private void playerInit() {
		int i = boundry.waitForInt(out.getString("initNrOfPlayers"));
		players = new PlayerList(i);
		for (int j = 0; j < i; j++) {
			players.setName(boundry.waitForString(out.getString("nameReg"), j + 1), j);
		}
		boundry.creatPlayers(players.getNames(i), players.getBalances(i));

	}

}
