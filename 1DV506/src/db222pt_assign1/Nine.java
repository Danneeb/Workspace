package db222pt_assign1;
import java.util.Scanner;
import java.util.Random;


public class Nine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rng = new Random();
		System.out.print("Redo att spela? J / N ");
		String val = sc.next();

		int s1 = rng.nextInt(6)+1;
		int s2 = rng.nextInt(6)+1;
		int d1 = rng.nextInt(6)+1;
		int d2 = rng.nextInt(6)+1;
		int dtot = d1+d2;
		int tot = s1+s2;

		//Här är spelarens slag
		if(val.equals("J")) {
			System.out.println(s1);
			if(s1 < 7) {
				System.out.print("Vill du slå igen? J / N ");
				String val2 = sc.next();
				if(val2.equals("J")) {//Här kollar den efter 'j' får den det så fortsätter programmet
					System.out.println("Dina slag: " +s1+" och "+s2+" = " +(s1+s2));

				}

			}
		}else if(val.equals("N")) {
			System.out.print("Game over");
		}else {
			System.out.print("Försök igen med stort J eller stort N ");
		}

		// Här börjar datorns slag och printar ut resultat
		if(tot < 10) {
			System.out.println("datorn slår: "+d1);
		}if(d1 <= 4) {
			System.out.println("datorn slår igen och får "+d2+" \nDatorn har totalt "+dtot);
		}if(dtot > tot) {
			System.out.println("Du förlorade");
		}if(dtot < tot) {
			System.out.println("Du vann!! GRATTIS ");
		}if(dtot < tot) {
			System.out.println("Du vann!! GRATTIS");
		}if(d1 > tot) {
			System.out.println("Du förlorade ");
		}if((d1+d2) == tot) {
			System.out.println("ni fick samma poäng, försök igen");
		}if(s1 > dtot) {
			System.out.println("Du vann!! GRATTIS ");
		}if(tot > dtot) {
			System.out.println("Du vann!! GRATIIS ");
		}if(tot > 9) {
			System.out.println("spelet är över, du förlorade");
		}
		sc.close();

	}

}
