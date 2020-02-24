package db222pt_assign3.Exercise1;

public class PrintRecursive {
	public static void main(String[] args) {
		String str = "Hello Everyone!";

		print(str, 0);
		System.out.println(); // Line break
		//printReverse(str, 0);
	}
	public static String print(String str, int pos) {
		return print(str,0);
	}
	//public static String printReverse(String str,int pos) {
		//return (printReverse(str,str.length()-1));
	//}
}
