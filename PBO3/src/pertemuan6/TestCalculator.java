package pertemuan6;
import java.util.Scanner;

public class TestCalculator {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Scanner input_string = new Scanner(System.in);
		Calculator calculator = new Calculator();
		int ang1, ang2, ulang; 
		char hitung;
		
		System.out.print("Masukan perulangan : ");
		ulang = input.nextInt();
		for(int n = 0; n < ulang;n++) {
			System.out.print("list perhitungan :"
					+ "\n + : pertambahan"
					+ "\n - : pengurangan"
					+ "\n * : perkalian"
					+ "\n / : pembagian"
					+ "\n masukan Angka perhitungan : ");
			hitung = input.next().charAt(0);
			if(hitung == '+') {
				calculator.penjumlahan();
			}else if(hitung == '-') {
				calculator.pengurangan();
			}else if(hitung == '*') {
				calculator.perkalian();
			}else if(hitung == '/') {
				calculator.pembagian();
			}else {
				System.out.print("Error");
			}
		}
	}
}
