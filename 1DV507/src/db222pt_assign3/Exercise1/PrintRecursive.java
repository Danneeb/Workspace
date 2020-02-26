package db222pt_assign3.Exercise1;

public class PrintRecursive {
	public static void main(String[] args) {
		String str = "Hello Everyone!";

		print(str, 0);
		System.out.println(); // Line break
		printReverse(str, 0);
	}
	public static void print(String str, int pos) {
		if(pos<0) {
			
		}else {
			System.out.println(str);
			pos--;
			print(str,pos);
		}
	}
	public static void printReverse(String str,int pos) {
		
		if(str.isEmpty()) {
			
		}else {
			printReverse(str.substring(1)+str.charAt(0), pos );
			
		}
		System.out.println(str);
	}
}
