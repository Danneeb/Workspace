package db222pt_assign3;
import java.util.Arrays;



public class Point {



	int[] arr = new int[4];


	public Point() {}

	public Point(int x, int y) {
		arr[0] = x;
		arr[1] = y;
	}
	public void setPoint(int x, int y) {
		arr[0] = x;
		arr[1] = y;	
	}


	public String toString() {
		return Arrays.toString(arr);

	}


	//F�r inte den h�r att fungera
	public boolean isEqualTo(int p2) {
		int p1 = 0;
		for(int i = 0; i < arr.length-2 ; i++) {
			p1 = arr[i];
		}

		if(p2 == p1) {
			return true;
		}
		else 
			return false;



	}
	//F�r inte den h�r att fungera
	public boolean isEqualTo(Point theP2) {
		int p1 = 0;
		if() 
			for(int i = 0; i < arr.length-2 ; i++) {
				p1 = arr[i];
			}

		return false;
	}


}