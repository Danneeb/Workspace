package db222pt_assign3;

public class PointMain {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(3,4);


		System.out.println(p1.toString());
		System.out.println(p2.toString());

		if(p1.isEqualTo(p2)) {
			System.out.println("The two points are equal");
		}
	}
}