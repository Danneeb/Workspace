package db222pt_assign3;

public class MoonMain {

	public static void main(String[] args) {
		//Skapar en ny m�ne
		Moon moon = new Moon();

		//S�tter v�rden
		moon.setName("Ganymede which");
		moon.setDiameter(5262);

		System.out.println("Largest moon in the solar system is "+moon.getName()+"\nis "+moon.getDiameter()+" km in diameter.");
	}

}
