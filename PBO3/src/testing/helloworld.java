package testing;

public class helloworld {
	public int x;
	public int y;
	public String nama;
	public void setx(int i) {
		x = i;
	}
	public void sety(int j) {
		y = j;
	}
	public void setnama(String nm) {
		nama = nm;
	}
	public int plus() {
		return x+y;
	}
	public String printnama() {
		System.out.print(nama);
		return nama;
	}
	public static void main(String[] args) {
		helloworld se1 = new helloworld();
		helloworld nama1 = new helloworld();
		helloworld nama2 = new helloworld();
		se1.setx(20);
		se1.sety(30);
		nama1.setnama("bayu");
		nama2.setnama("cecep");
		System.out.println("hasil : "+se1.plus());
		nama1.printnama();
		nama2.printnama();
		double quis, uts, uas, result;
		quis = 100;
		uts = 100;
		uas = 100;
		result = (20/100 * quis) + (30/100 * uts) + (50/100 * uas);
		System.out.print("hasil : "+result);
		
	}

}
