package db222pt_assign3;

public class MoonsMain {

	public static void main(String[] args) {
		// Skapar ny måne.
		Planet moon = new Planet();

		//sätter värden.
		moon.setName("Mars:");
		moon.addMoon("Phobos");
		moon.addMoon("Deimos");


		//Printar ut informationen.
		System.out.println("Moons of "+moon.getName()+"\n"+moon.getMoons());

	}

}
