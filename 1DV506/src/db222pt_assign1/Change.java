package db222pt_assign1;
import java.util.Scanner;

//Hann inte att göra mer med den här uppgiften. så blev tyvärr aldrig klar
public class Change {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("payment: ");
		int payment = sc.nextInt();
		System.out.print("price: ");
		double price = sc.nextDouble();
		System.out.print(price);




		System.out.print(payment + price);

		sc.close();
	}

}
