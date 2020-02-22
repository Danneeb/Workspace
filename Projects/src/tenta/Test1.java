package tenta;

public class Test1 {
	public static void main(String[] args) {
		int num = 0;
		int max = 20;
		
		while(num<max) {
			if(num%3==1) {
				System.out.println(num);
			}
				num+=2;
		}
	}
}
