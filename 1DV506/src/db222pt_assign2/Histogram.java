package db222pt_assign2;
import java.util.Random;



public class Histogram {

	public static void main(String[] args) {
		Random rng = new Random();
		int s1 = 0;//B�rjar med att g�ra variabler f�r att n� dem i hela programmet
		int s2 = 0;
		int s3 = 0;// ex s3, kommer att anv�ndas f�r slag 3
		int s4 = 0;
		int s5 = 0;
		int s6 = 0;

		for(int i = 0; i < 500; i++) { //H�r b�rjar jag med en r�knare f�r f� 500 slag 
			int slag = rng.nextInt(6)+1;// H�r best�ms vilken siffra p� t�rningen som kommer att v�ljas


			if(slag == 1) { 

				s1++;
			}
			if(slag == 2) {
				s2++;
			}
			if(slag == 3) {
				s3++;
			}
			if(slag == 4) {
				s4++;
			}
			if(slag == 5) {
				s5++;
			}
			if(slag == 6) {
				s6++;
			}





		}


		System.out.print("Ettor "+"("+s1+")"+":");
		for(int i = s1; i>0; i--) {
			System.out.print("*");
		}

		System.out.print("\nTv�or "+"("+s2+")"+":");
		for(int i = s2; i>0; i--) {
			System.out.print("*");
		}

		System.out.print("\nTreor "+"("+s3+")"+":");
		for(int i = s3; i>0; i--) {
			System.out.print("*");
		}
		System.out.print("\nFyror "+"("+s4+")"+":");
		for(int i = s4; i>0; i--) {
			System.out.print("*");
		}
		System.out.print("\nFemmor "+"("+s5+")"+":");
		for(int i = s5; i>0; i--) {
			System.out.print("*");
		}
		System.out.print("\nSexor "+"("+s6+")"+":");
		for(int i = s6; i>0; i--) {
			System.out.print("*");
		}

	}

}