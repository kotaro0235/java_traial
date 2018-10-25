package unit10;

public class q1013 {

	public static void main(String[] args) {
		String[][] array = new String[2][2];
		array[0][0] = "a";
		array[0][1] = "b";
		array[1][0] = "c";
		array[1][1] = "d";
		//Insert Code here
		// Result : abcd
		// A
		System.out.println("===A:RESULT===");
		for (int i = 1; i  < 2; i++) {
			for (int j = 1; j < 2; j++) {
				System.out.println(array[i][j]);
			}
		}
		
		// B
		System.out.println("===B:RESULT===");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < i; ++j) {
				System.out.println(array[i][j]);
			}
		}
		
		// C
		// compile error
//		for (String s: array) {
//			for (String b: array) {
//				System.out.println(b);
//			}
//		}
		
		// D
		System.out.println("===D:RESULT===");
		for (int i = 0; i < 2; ) {
			for (int j = 0; j < 2; ) {
				System.out.println(array[i][j]);
				j++;
			}
			i++;
		}
	}
}
