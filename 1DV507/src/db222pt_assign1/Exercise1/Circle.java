package db222pt_assign1.Exercise1;

public class Circle extends Shape {
	//Subclass
	//Variables
	protected double perimeter;
	protected String name;
	protected double radius;
	protected double area;
	
	//Method for setting name and radius
	public Circle(String shapeName, double radius) {
		super(shapeName);
		this.radius = radius;
	}

	//method for getting Perimeter and calculating it
	public double getPerimeter() {
		perimeter = 2*Math.PI*radius;
		return perimeter;
	}
	//getting area and calculating area
	public double getArea() {
		area = Math.PI*(Math.pow(radius, 2));
		return area;
	}

}