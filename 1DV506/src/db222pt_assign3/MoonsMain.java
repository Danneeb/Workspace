package db222pt_assign3;

public class MoonsMain {

	public static void main(String[] args) {
		// Skapar ny m�ne.
		Planet moon = new Planet();

		//s�tter v�rden.
		moon.setName("Mars:");
		moon.addMoon("Phobos");
		moon.addMoon("Deimos");


		//Printar ut informationen.
		System.out.println("Moons of "+moon.getName()+"\n"+moon.getMoons());

	}

}
