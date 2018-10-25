package unit10;

import java.io.IOException;

public class q1018 {
	public static void main (String... args)
	// A
	throws Exception
	{
		X obj = new X();
	    // B
		// try {
		obj.print();
		// } catch (Exception e) {
		// } catch (IOException e) {}
		
		// E
		//throws new IOException();
	}
	
}


class X {
	public  void print() 
	// C
	throws IOException 
	{
		// D
		//throw IOException("Error");
		//throw new IOException();
		
	}
}
