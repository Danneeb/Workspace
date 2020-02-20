package db222pt_assign3;
import java.util.ArrayList;


public class Planet {
	//Variabler
	int positionFromSun = 0;
	int noOfMoons = 0;
	double aphelion = 0.0;
	double perihelion = 0.0;
	String name = "";
	String unk = "unknown planet";
	String Moons = "";

	//arrayList till 3.3
	ArrayList <String> arr = new ArrayList<String>();



	// Getters och setters
	public String getName() {
		return name;
	}
	public void setName(String theName) {
		name = theName;
		if(theName == "") {
			name = unk;
		}
	}
	public int getPositionFromSun() {
		return positionFromSun;
	}
	public void setPositionFromSun(int thePositionFromSun) {
		positionFromSun = thePositionFromSun;
		if(thePositionFromSun <1 ||  thePositionFromSun >9) {
			positionFromSun = 0;
		}
	}
	public int getNoOfMoons() {
		return noOfMoons;
	}
	public void setNoOfMoons(int theNoOfMoons) {
		noOfMoons = theNoOfMoons;
		if(theNoOfMoons < 0 || theNoOfMoons >100) {
			noOfMoons = 0;
		}
	}
	public double getAphelion() {
		return aphelion;
	}
	public void setAphelion(double theAphelion) {
		aphelion = theAphelion;
		if(theAphelion <0 || theAphelion >50) {
			aphelion = 0;
		}
	}
	public double getPerhelion() {
		return perihelion;
	}
	public void setPerihelion(double thePerihelion) {
		perihelion = thePerihelion;
		if(thePerihelion < 0 || thePerihelion >30) {
			perihelion = 0;
		}
	}
	//Här är ändringarna för 3.3

	public String getMoons(){
		return Moons;
	}



	public void addMoon(String theMoon) {

		arr.add(0,theMoon);

		Moons = arr.toString();
	}

	// Här slutar ändringarna för 3.3






}