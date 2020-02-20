package db222pt_assign1.Exercise3;

public class Lorry extends Vehicle{
	protected int price = 300;
	protected int passenger = 20;
	protected int totSum = 0;
	
	public void setLorryPrice(int lorry,int passenger) {
		totSum = (this.price * lorry) + (this.passenger * passenger);
	}
	public int GetLorryPrice() {
		return totSum;
	}
}
