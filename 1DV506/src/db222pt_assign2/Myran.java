package db222pt_assign2;
import java.util.Random;



public class Myran {


	public static void main(String[] args) {
		System.out.println("Myror\n=====");
		Random rng = new Random();

		int [][] board = new int[8][8];

		int raknareSteg = 0;
		int ten = 9;
		int x = 0;
		int y = 0;
		double totSteg = 0.0;
		int minX = 0;
		int maxX = 8;
		int minY = 0;
		int maxY = 8;

		while(ten>=0) {
			raknareSteg = 0;
			ten--;

			int inteVarit = 63;

			for(int i = 0; i<8; i++) {
				for(int j = 0; j<8; j++) {
					board[i][j] = 0;
				}
			}
			//Placerar myran på board
			int antPosX = rng.nextInt(8);
			int	antPosY = rng.nextInt(8);
			board[antPosX][antPosY] = 1;


			while(inteVarit > 0) {

				int antWalk = rng.nextInt(4)+1;
				//System.out.println(inteVarit);
				//gång uppåt
				if(antWalk == 1) {
					x++;

					if(x>=maxX) {
						x--;
						raknareSteg--;
					}
					if(board[x][y] == 0) {
						board[x][y] = 1;
						inteVarit--;
						raknareSteg++;
						totSteg++;
					}
					else if(board[x][y]== 1) {
						raknareSteg++;
						totSteg++;
					}

				}
				//gång neråt
				if(antWalk == 2) {
					x--;

					if(x<minX) {
						x++;
						raknareSteg--;
					}
					if(board[x][y] == 0) {
						board[x][y] = 1;
						inteVarit--;
						raknareSteg++;
						totSteg++;
					}
					else if(board[x][y] == 1) {
						raknareSteg++;
						totSteg++;

					}
				}
				//gång höger
				if(antWalk == 3) {
					y++;

					if(y>=maxY) {
						y--;
						raknareSteg--;
					}
					if(board[x][y] == 0) {
						board[x][y] = 1;
						inteVarit--;
						raknareSteg++;
						totSteg++;
					}
					else if(board[x][y] == 1) {
						raknareSteg++;
						totSteg++;

					}

				}
				//gång vänster
				if(antWalk == 4) {
					y--;
					if(y<minY) {
						y++;
						raknareSteg--;
					}
					if(board[x][y] == 0) {
						board[x][y] = 1;
						inteVarit--;
						raknareSteg++;
						totSteg++;
					}

					else if(board[x][y] == 1) {
						raknareSteg++;
						totSteg++;
					}
				}
			}
			System.out.println("Antan steg i simuleringen: "+raknareSteg);
		}

		System.out.println("Antan Steg i medel: "+totSteg/10);

	}

}