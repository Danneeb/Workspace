package assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class NewTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1;

		int[] arr = new int[10];


		for(int i = 0; i<arr.length; i++) {
			x = x*2;
			arr[i] = x;
		}
		String output = Arrays.toString(arr);
		System.out.println(output);
	}
}	
