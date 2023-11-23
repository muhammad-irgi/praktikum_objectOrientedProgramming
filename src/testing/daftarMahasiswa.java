//Soal 1
package testing;

public class daftarMahasiswa {
	public String nama;
	public String jurusan;
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
	public void info() {
		System.out.println("nama : "+nama);
		System.out.println("jurusan : "+jurusan);
		System.out.println("nrp : "+nrp);
	}
	public static void main(String[] args) {
		daftarMahasiswa ms1 = new daftarMahasiswa();
		daftarMahasiswa ms2 = new daftarMahasiswa();
		ms1.setnama("cita");
		ms1.setjurusan("telkom");
		ms1.setnrp(7206);
		ms2.setnama("raka");
		ms2.setjurusan("it");
		ms2.setnrp(7306);
		System.out.println("nama :"+ms1.nama+"\njurusan :"+ms1.jurusan
				+"\nnrp :"+ms1.nrp);
		System.out.println("nama :"+ms2.nama+"\njurusan :"+ms2.jurusan
				+"\nnrp :"+ms2.nrp);
		System.out.println("<<=======================>>");
		ms1.info();
		ms2.info();
		
	}
}
