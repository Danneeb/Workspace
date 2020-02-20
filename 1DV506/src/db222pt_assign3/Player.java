package db222pt_assign3;

import java.util.Random;

public class Player {

	//variabler
	private String name = "";
	private int hitPoints = 0;
	private int playerAttack = 0;
	private int defence = 0;


	//getters och setters
	public void setPlayerName(String theName) {
		name = theName;
	}
	public String getPlayerName() {
		return name;
	}
	public void setPlayerHitpoints(int theHitPoints) {
		hitPoints = theHitPoints;
	}
	public int getPlayerHitPoints() {
		return hitPoints;
	}


	public void setPlayerAttack(int attack) {
		Random rng = new Random();
		attack = rng.nextInt(3)+2;
		playerAttack = attack;
	}

	public int getPlayerAttack() {
		return playerAttack;
	}

	public void setPlayerDefence(int theDefence) {
		Random rng = new Random();
		defence = rng.nextInt(20)+1;

	}
	public int getPlayerDefence() {
		return defence;
	}


}
