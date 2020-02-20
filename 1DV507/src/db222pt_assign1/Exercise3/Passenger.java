package db222pt_assign1.Exercise3;

import java.util.ArrayList;

public class Passenger {
	protected int price = 25;
	protected int totSum = 0;
	
	ArrayList<Integer> pass = new ArrayList<Integer>();
	
	public void setPassengers(int n) {
		for(int i = 0; i<pass.size(); i++) {
			pass.add(n);
		}
	}
	
	public void setPassengerPrice(int n) {
		totSum = price * n;
	}
	public int getPassengerPrice() {
		return totSum;
	}

}