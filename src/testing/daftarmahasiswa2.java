//soal 2
package testing;

public class daftarmahasiswa2 {
	private String nama;
	private String jurusan;
	public int nrp;
	public void setnama(String nm) {
		nama = nm;
	}
	public void setjurusan(String jurus) {
		jurusan = jurus;
	}
	public void setnrp(int nomorrp) {
		nrp = nomorrp;
	}
	public String getnama() {
		System.out.println("nama : "+nama);
		return nama;
	}
	public String getjurusan() {
		System.out.println("jurusan : "+jurusan);
		return jurusan;
	}
	public int getnrp() {
		System.out.println("nrp : "+nrp);
		return nrp;
	}
	public static void main(String[] args) {
		daftarmahasiswa2 ms1 = new daftarmahasiswa2();
		daftarmahasiswa2 ms2 = new daftarmahasiswa2();
		ms1.setnama("cita");
		ms1.setjurusan("tekom");
		ms1.setnrp(7206);
		ms2.setnama("raka");
		ms2.setjurusan("it");
		ms2.setnrp(7306);
		
		ms1.getnama();
		ms1.getjurusan();
		ms1.getnrp();
		ms2.getnama();
		ms2.getjurusan();
		ms2.getnrp();
		
	}
	
}
