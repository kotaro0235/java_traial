package main.gameninfo.field;

public class Fields {

	Totem[] totems;
	
	public int totemCnt = 8;
	
	public Fields() {
		totems = new Totem[totemCnt];
	}
	
	public Totem getTotem(int index) {
		return totems[index];
	}
	public void setTotem(Totem totem, int index) {
		totems[index] = totem;
	}
	
}
