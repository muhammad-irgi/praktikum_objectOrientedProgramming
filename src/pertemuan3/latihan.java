package pertemuan3;
import java.util.Scanner;

public class latihan {
	public static void main(String args[]) {
		int angka1, angka2, hasil, perhitungan, perulangan;
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukan perulangan : ");
		perulangan = input.nextInt();
		
		for(int n = 0;n <= perulangan;n++) {
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
//			kondisi IF
			if (perhitungan == 1) {
				hasil = angka1 + angka2;
				System.out.println("hasilnya adalah : "+hasil);
			} else if (perhitungan == 2) {
				hasil = angka1 - angka2;
				System.out.println("hasilnya adalah : "+hasil);
			} else if (perhitungan == 3){
				hasil = angka1 * angka2;
				System.out.println("hasilnya adalah : "+hasil);
			} else if(perhitungan == 4) {
				hasil = angka1 / angka2;
				System.out.println("hasilnya adalah : "+hasil);
			} else {
				System.out.println("error input");
			}
		}
	}
}
