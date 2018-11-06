package unit10;

public class q1020_2 {
	int a;
	static int b;
	public q1020_2(int ns) {
		if (b < ns) {
			b = ns;
			this.a = ns;
		}
	}
	void doPrint() {
		System.out.println("a = " + a + " b = " + b);
	}
}
