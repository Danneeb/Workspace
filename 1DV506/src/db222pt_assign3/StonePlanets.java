package db222pt_assign3;

public class StonePlanets {
	public static void main(String[] args) {
		//Array för planeter.
		String[] arr = {"Planet Mercury has aphelion 0.47 AU, perihelion 0.31 AU and"
				+ "","Planet Venus has aphelion 0.72 AU, perihelion 0.72 AU and"
						+ "","Planet Earth has aphelion 1.0 AU, perihelion 0.99 AU and"
								+ "","Planet Mars has aphelion 1.666 AU, perihelion 1.382 AU and"};

		//Array för moons.
		String[] moons = new String[4];
		moons[0] = "0 moons.";
		moons[1] = "0 moons";
		moons[2] = "1 moons. \n\tThe moon";
		moons[3] = "2 moons.\n\tPhobos\n\tDeimos";


		//iteration för att hämta data ur arrayerna.
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			System.out.println(moons[i]);
		}




	}

}
