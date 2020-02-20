package db222pt_assign2;

import java.util.Random;
import java.util.Arrays;



public class Lotto {

	public static void main(String[] args) {
		Random rng = new Random();
		int[] arr = new int[7];
		int[] tmpArr = new int[arr.length];
		int lotto;

		System.out.print("Veckans lottorad: \n");
		//loop f�r att placera ett random nummer mellan 1-35 i array
		for(int i = 0; i < arr.length ; i++) {
			lotto = rng.nextInt(35)+1;
			arr[i] = lotto;
		}
		
		Arrays.sort(arr);
		//tv� stycken for loops f�r att kunna loopa i array.
		for(int i = 0; i < arr.length;i++) {
			/*andra for loopen b�rjar med i+1 f�r att j�mf�ra med -
			 * arrayens position efter i.
			 */

			for(int j = i +1; j<arr.length;j++) {
				do{
					Arrays.sort(arr);
					if(arr[i] == arr[j]){
						arr[j] = rng.nextInt(35)+1;
						Arrays.sort(arr);
						System.out.print(" * ");
					}

					//do-While loop, som upprepas s�l�nge det finns samma nummer i arrayen.
					Arrays.sort(arr);
				}while(arr[i] == arr[j]);
			}
		}
		//Arrays.sort(arr);
		String output = Arrays.toString(arr);
		System.out.println("\nKorrekt: "+output);


		
	
	}
}