package db222pt_assign1.Exercise3;

public class Vehicle extends FerryDefine{
	protected int size = 0;
	protected int passenger = 0;
	
	protected int[] carSpace = new int[40];
	
	public void setPassenger(int passengers) {
		this.passenger = passengers;
	}
	public int getPassenger() {
		return this.passenger;
	}
	
	public void setSize(int size) {
		this.size = size;
		
		
	}
	public int getSize() {
		return this.size;
	}
	
	
}