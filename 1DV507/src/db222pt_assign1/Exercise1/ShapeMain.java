package db222pt_assign1.Exercise1;

import java.util.ArrayList;

public class ShapeMain {

	public static void main(String[] args) {
		//Arraylist for saving diffrent shapes.
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		//contructors that adds different shapes
		shapes.add( new Rectangle("R1",2,3) );  
		shapes.add( new Rectangle("R2",3,4) ); 
		shapes.add( new Square("S1",3) );       
		shapes.add( new Square("S2",5) );
		shapes.add( new Circle("C1",1) );       
		shapes.add( new Circle("C2",2) );
		
		//printing array in for-each loop
		for (Shape s :shapes)  // Print all shapes
			System.out.println(s);

	}

	
}
