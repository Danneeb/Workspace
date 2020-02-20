package db222pt_assign1.Exercise3;

import java.util.ArrayList;

public class FerryDefine implements Ferry {
	protected int[] passengers = new int[200];
	
	protected int totPass = 0;
	

	public int countPassengers() {
		
		return this.totPass;
		
	}

	
	public int countVehicleSpace() {
		
		return 0;
	}

	
	public int countMoney() {
		int pass = countPassengers() * 25;
		return pass;
	}

	
	public Vehicle[] getAllVehicles() {
		
		return null;
	}

	
	public void embark(Vehicle v)throws IndexOutOfBoundsException {
		
		
	}

	
	public void embark(Passenger p) throws IndexOutOfBoundsException {
		
		
	}

	public void disembark() {
		
		
	}

	
	public boolean hasSpaceFor(Vehicle v) {
		
		return false;
	}

	
	public boolean hasRoomFor(Passenger p) {
		
		return false;
	}
	
}