package pertemuan2;
import java.util.Scanner;

public class PengkondisianSwitch {
	public static void main(String args[]) {
//		inialisasi
		int angka1, angka2, hasil;
		String perhitungan;
		Scanner input = new Scanner(System.in);
//		input user
		System.out.println("Masukan Angka 1 : ");
		angka1 = input.nextInt();
		System.out.println("Masukan Angka 2 : ");
		angka2 = input.nextInt();
		System.out.print("list perhitungan :"
				+ "\n + : pertambahan"
				+ "\n - : pengurangan"
				+ "\n * : perkalian"
				+ "\n / : pembagian"
				+ "\n Masukan Simbol Perhitungan : ");
		perhitungan = input.next();
//		kondisi Switch
		switch (perhitungan) {
		case "+":
			hasil = angka1 + angka2;
			System.out.print("Hasilnya Adalah : "+hasil);
			break;
		case "-":
			hasil = angka1 - angka2;
			System.out.print("Hasilnya Adalah : "+hasil);
			break;
		case "*":
			hasil = angka1 * angka2;
			System.out.print("Hasilnya Adalah : "+hasil);
			break;
		case "/":
			hasil = angka1 / angka2;
			System.out.print("Hasilnya Adalah : "+hasil);
			break;
		default:
			System.out.print("Simbol yang dimasukan tidak sesuai");
		}
		
	}
}
