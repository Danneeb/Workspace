package db222pt_assign1.Exercise1;


public class Rectangle extends Shape {
	//subclass
	//Variables
	protected String name;
	protected double height;
	protected double width;
	protected double perimeter;
	protected double area;
	//method for setting Name height width
	public Rectangle(String shapeName,double height,double width) {
		super(shapeName);
		this.height = height;
		this.width = width;
	}
	//method for getting and calculating perimeter
	public double getPerimeter() {
		this.perimeter = (height*2)+(width*2); 
		return this.perimeter;
	}
	//method for getting area and calculating it
	public double getArea() {
		this.area = height*width;
		return this.area;

	}

}