package db222pt_assign3;

public class MarsMain {

	public static void main(String[] args) {
		//Skapar planeten
		Planet mars = new Planet();

		//sätter värden på planeten
		mars.setName("Mars");
		mars.setPositionFromSun(4);
		mars.setNoOfMoons(2);
		mars.setAphelion(1.666);
		mars.setPerihelion(1.382);

		//Printar informationen
		System.out.println(mars.getName()+":\n\t"+"Position: "+mars.getPositionFromSun()+"\n\t"+"Moons: "+mars.getNoOfMoons()+"\n\t"+"Aphelion: "+mars.getAphelion()+"\n\t"+"Perihelion: "+mars.getPerhelion());
	}

}
