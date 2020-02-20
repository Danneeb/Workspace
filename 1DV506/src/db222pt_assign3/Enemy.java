package db222pt_assign3;

import java.util.Random;

public class Enemy {
	//Variabler
	private String name = "";
	private int hitPoints = 0;
	private int enemyAttack = 0;
	private int theHitPoints = 0;
	private int defence = 0;

	public Enemy() {}



	//getters och setters
	public void SetEnemyName(String theName) {
		name = theName;
	}
	public String GetEnemyName() {
		return name;
	}


	public void setEnemyHitPoints(int theHitPoints) {

		hitPoints = theHitPoints;
	}
	public int getEnemyHitPoints() {
		return hitPoints;
	}

	public void setEnemyAttack(int attack) {
		Random rng = new Random();
		attack = rng.nextInt(14)+1;
		enemyAttack = attack;
	}
	public int getEnemyAttack() {
		return enemyAttack;
	}
	public void setEnemyDefence(int thedefence) {
		Random rng = new Random();
		thedefence = rng.nextInt(20)+1;
		defence = thedefence;

	}
	public int getEnemyDefence() {
		return defence;
	}


}
