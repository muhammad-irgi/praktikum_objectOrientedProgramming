package pertemuan5;

public abstract class Hewan {
	protected static String name;
// add function abstract to provide function in child class later
	protected abstract void eat(); 
}

class Cat extends Hewan {
	String warna;
	int berat;
	public void identitas(String namaKucing, String warnaKucing, int beratKucing) {
		Cat.name = namaKucing;
		warna = warnaKucing;
		berat = beratKucing;
	}
	public void eat() {
		System.out.println(Cat.name+" makan Wishkas");
	}
	String ambilNama() {
		return Cat.name;
	}
	String ambilWarna() {
		return warna;
	}
	int ambilBerat() {
		return berat;
	}
}
