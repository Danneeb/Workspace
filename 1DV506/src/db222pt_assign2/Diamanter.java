package db222pt_assign2;
import java.util.Scanner;

public class Diamanter {

	public static void main(String[] args) {


		do{
			Scanner sc = new Scanner(System.in);
			System.out.print("Skriv ett positivt tal: ");
			int rows = sc.nextInt();

			if(rows <0) {
				System.exit(1);
			}

			for(int i = 1; i<=rows; i++ ) {
				for(int x = rows; x>=i; x-- ) {
					System.out.print(" ");
				}
				for(int y = 1; y<=(i*2)-1; y++) {
					System.out.print("*");
				}
				System.out.println();
			}

			for(int i = rows-1; i >=0; i--) {
				for(int x = rows; x>i-1; x--) {
					System.out.print(" ");
				}
				for(int y = 1; y<(i*2); y++) {
					System.out.print("*");
				}
				System.out.println();
			}

		}while(true);





	}

}