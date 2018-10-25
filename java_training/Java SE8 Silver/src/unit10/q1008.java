package unit10;

public class q1008 {
	
	public static void main(String[] args) {
		String phone = "03-1234-5678";
		String x = "**-****-";
		// insert code here
		// A
		StringBuilder sb = new StringBuilder(phone);
		sb.subSequence(8, 12);
		System.out.println(x + sb);
		
		// B
		System.out.println(x + phone.substring(8, 12));
		
		// C
		StringBuilder sb2 = new StringBuilder(x);
		sb2.append(phone, 8, 12);
		System.out.println(sb2);
		
		// D
		StringBuilder sbd = new StringBuilder(phone);
		StringBuilder s = sbd.insert(0, x);
		System.out.println(s);
		
	}

}
