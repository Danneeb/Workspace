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

		//H�r �r spelarens slag
		if(val.equals("J")) {
			System.out.println(s1);
			if(s1 < 7) {
				System.out.print("Vill du sl� igen? J / N ");
				String val2 = sc.next();
				if(val2.equals("J")) {//H�r kollar den efter 'j' f�r den det s� forts�tter programmet
					System.out.println("Dina slag: " +s1+" och "+s2+" = " +(s1+s2));

				}

			}
		}else if(val.equals("N")) {
			System.out.print("Game over");
		}else {
			System.out.print("F�rs�k igen med stort J eller stort N ");
		}

		// H�r b�rjar datorns slag och printar ut resultat
		if(tot < 10) {
			System.out.println("datorn sl�r: "+d1);
		}if(d1 <= 4) {
			System.out.println("datorn sl�r igen och f�r "+d2+" \nDatorn har totalt "+dtot);
		}if(dtot > tot) {
			System.out.println("Du f�rlorade");
		}if(dtot < tot) {
			System.out.println("Du vann!! GRATTIS ");
		}if(dtot < tot) {
			System.out.println("Du vann!! GRATTIS");
		}if(d1 > tot) {
			System.out.println("Du f�rlorade ");
		}if((d1+d2) == tot) {
			System.out.println("ni fick samma po�ng, f�rs�k igen");
		}if(s1 > dtot) {
			System.out.println("Du vann!! GRATTIS ");
		}if(tot > dtot) {
			System.out.println("Du vann!! GRATIIS ");
		}if(tot > 9) {
			System.out.println("spelet �r �ver, du f�rlorade");
		}
		sc.close();

	}

}
