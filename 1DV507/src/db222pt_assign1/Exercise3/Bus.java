package db222pt_assign1.Exercise3;

public class Bus extends Vehicle {
	protected int price = 200;
	protected int passenger = 15;
	protected int totSum = 0;

	public void setBusPrice(int passengers) {
		totSum = 200 +(passengers * 15);
	}
	public int getbusPrice() {
		return totSum;
	}
}
