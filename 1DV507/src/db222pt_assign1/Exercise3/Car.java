package db222pt_assign1.Exercise3;

public class Car extends Vehicle {
	protected int price = 100;
	protected int passenger = 20;
	protected int totSum = 0;
	
	public void setCarPrice(int cars, int passengers) {
		totSum = (this.price*cars)+(this.passenger*passengers);
	}
	public int getCarPrice() {
		return totSum;
	}


}
