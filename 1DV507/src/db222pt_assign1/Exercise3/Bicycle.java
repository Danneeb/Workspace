package db222pt_assign1.Exercise3;

public class Bicycle extends Vehicle {
	protected int price = 40;
	protected int totSum = 0;
	
	
	public void setBicyclePrice(int NoOfBicycles) {
		totSum = NoOfBicycles*40;
		
	}

	public int getBicyclePrice() {
		return totSum;
	}
	
		
	
