package TestProjects;

public class CheckXandY {
	public static boolean compXY(String str) {
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i)=='x' && str.charAt(i)=='y') {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		String str = "qwasxxy";
		
		System.out.println(compXY(str));

	}

}
