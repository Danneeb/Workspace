package db222pt_assign1.Exercise1;

import java.text.DecimalFormat;

public abstract class Shape {
	//superclass
	//variables
	protected String name;
	
	public Shape(String shapeName) { 
		name = shapeName; 
	}
	//superclass methods used in the two subclasses
	public abstract double getArea();
	public abstract double getPerimeter();

	//Method for printing area and perimeter
	public String toString() {
		DecimalFormat f = new DecimalFormat("##.00");
		String a = f.format( getArea() );
		String p = f.format( getPerimeter() );
		return name+", Area = "+a+", Perimeter = "+p;
	}
}