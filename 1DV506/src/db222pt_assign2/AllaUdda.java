package db222pt_assign2;
import java.util.Random;
import java.util.Arrays;



public class AllaUdda {

	public static void main(String[] args) {
		Random rng = new Random();
		int i = 0;
		int y = 0;
		int u = 0;


		int[] d = new int[10];

		for(i = 0 ; i<d.length ; i++) {
			int slag =  rng.nextInt(100)+1;
			d[i] = slag;

		}

		String arr = Arrays.toString(d);
		System.out.println("Hela arrayen "+arr);

		System.out.print("Udda tal i arrayen ");
		for(y = 0; y<d.length; y++) {
			if(d[y]%2==1) {

				System.out.print(d[y]+" ");

			}

		}


	}

}