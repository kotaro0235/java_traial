package unit10;

public class q1019 {
	
	public static void main (String[] args) {
		
		int b = 90;
		
		// A
		double a = 0;
		if (b > 90) { a = 0.5; }
		if (b > 80 && b < 90) { a =  0.2; }
		System.out.println(100 * a);
		
		// B
		a = 0;
		a = (b >= 90) ? 0.5 : 0;
		a = (b > 80) ? 0.2 : 0;
		System.out.println(100 * a);
		
		// C
		a = 0;
		a = (b > 90) ? 0.5 : (b > 80) ? 0.2 : 0;
		System.out.println(100 * a);
		
		// D
		a = 0;
		if (b > 80 && b < 90) {
			a = 0.2;
		} else {
			a = 0;
		}
		if (b >= 90) {
			a = 0.5;
		} else {
			a = 0;
		}
		System.out.println(100 * a);
		
		// E
		a = 0;
		a = (b > 80) ? 0.2 : ( b >= 90) ? 0.5 : 0;
		System.out.println(100 * a);
	}

}
