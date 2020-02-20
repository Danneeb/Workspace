package db222pt_assign3;

import java.util.Random;

public class GameManager {

	public static void main(String[] args) {



		//H�r skapas motspelaren
		Enemy badguy = new Enemy();
		int hpEnemy = 30;
		badguy.setEnemyHitPoints(hpEnemy);
		badguy.setEnemyAttack(0);
		badguy.setEnemyDefence(0);
		badguy.SetEnemyName("batman");

		//H�r skapas v�ran hj�lte
		int hpPlayer = 50;
		Player hero = new Player();
		Random rng = new Random();
		hero.setPlayerName("Spiderman");
		hero.setPlayerHitpoints(hpPlayer);
		hero.setPlayerAttack(0);
		hero.setPlayerDefence(0);

		//Olika vapen med random f�r att best�mma skada.
		int knife = rng.nextInt(6)+1;
		int spoon = rng.nextInt(12)+1;
		int cheeseGrader = rng.nextInt(18)+1;
		int shovel = rng.nextInt(24)+1;
		int baseballBat = rng.nextInt(30)+1;
		int chainSaw = rng.nextInt(36)+1;




		//b�rjar printa rundas start.
		System.out.println(hero.getPlayerName()+" Har valt cheeseGrader och har "+hero.getPlayerHitPoints()+" hitpoints");
		System.out.println(badguy.GetEnemyName()+" har bara sin n�var att sl�ss med. "+"Han har "+badguy.getEnemyHitPoints()+" Hitpoints\n");
		System.out.println("**********************************************");


		//Random som best�mmer skadan varje spelare g�r
		while(badguy.getEnemyHitPoints()> 0 && hero.getPlayerHitPoints() >0) {
			int attackHero = rng.nextInt(18)+1;
			int attackBadguy = rng.nextInt(20)+1;




			//Hj�lten
			if(hero.getPlayerHitPoints()>=1) {
				int round = attackHero - badguy.getEnemyDefence();

				if(round >= 1) {
					System.out.println(hero.getPlayerName()+" attackera och tr�ffar.");
					hpEnemy = hpEnemy - cheeseGrader;
					badguy.setEnemyHitPoints(hpEnemy);

				}
				if(round <=0) {
					System.out.println(hero.getPlayerName()+" f�rs�ker attackera men missar.");

				}
				System.out.println();

			}

			//Skurken
			if(badguy.getEnemyHitPoints()>=1) {
				int round = attackBadguy - hero.getPlayerDefence();

				if(round >= 1) {
					System.out.println(badguy.GetEnemyName()+" attackera och tr�ffar.");
					hpPlayer = hpPlayer - attackBadguy;
					hero.setPlayerHitpoints(hpPlayer);


				}
				if(round <=0) {
					System.out.println(badguy.GetEnemyName()+" f�rs�ker attackera men missar.");

				}

				System.out.println();

			}

			//Prints vid olika outcome for deras strid
			if(hero.getPlayerHitPoints()<=0) {
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n"
						+ ""+hero.getPlayerName()+" F�rlorade\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.exit(0);
			}
			if(badguy.getEnemyHitPoints()<=0) {
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n"
						+ ""+badguy.GetEnemyName()+" F�rlorade\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.exit(0);
			}
			System.out.println("Summering:\n\t"+hero.getPlayerName()+" HP kvar : "+hero.getPlayerHitPoints()+"\n\t"+badguy.GetEnemyName()+" HP kvar : "+badguy.getEnemyHitPoints());


			System.out.println("----------------------------------------");



		}




	}

}