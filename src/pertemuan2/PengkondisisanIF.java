package pertemuan2;
import java.util.Scanner;

public class PengkondisisanIF {
	public static void main(String args[]) {
////		inialisasi
//		int angka1;
//		Scanner input = new Scanner(System.in);
////		input user
//		System.out.println("Masukan Angka : ");
//		angka = input.nextInt();
////		kondisi IF
//		if (angka < 5) {
//			System.out.println("Angka yang dimasukan kurang dari 5");
//		} else {
//			System.out.println("Angka yang dimasukan lebih dari 5");	
//		}
		
		
//		inialisasi
		int angka1, angka2, hasil, perhitungan;
		Scanner input = new Scanner(System.in);
//		input user
		System.out.println("Masukan Angka 1 : ");
		angka1 = input.nextInt();
		System.out.println("Masukan Angka 2 : ");
		angka2 = input.nextInt();
		System.out.print("list perhitungan :"
				+ "\n 1 : pertambahan"
				+ "\n 2 : pengurangan"
				+ "\n 3 : perkalian"
				+ "\n 4 : pembagian"
				+ "\n masukan Angka perhitungan : ");
		perhitungan = input.nextInt();
//		kondisi IF
		if (perhitungan == 1) {
			hasil = angka1 + angka2;
			System.out.print("hasilnya adalah : "+hasil);
		} else if (perhitungan == 2) {
			hasil = angka1 - angka2;
			System.out.print("hasilnya adalah : "+hasil);
		} else if (perhitungan == 3){
			hasil = angka1 * angka2;
			System.out.print("hasilnya adalah : "+hasil);
		} else if(perhitungan == 4) {
			hasil = angka1 / angka2;
			System.out.print("hasilnya adalah : "+hasil);
		} else {
			System.out.print("error input");
		}
	}

}
