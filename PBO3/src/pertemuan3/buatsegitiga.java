package pertemuan3;
import java.util.Scanner;

public class buatsegitiga {
	public static int inputData() {
		Scanner input = new Scanner(System.in);
		int data;
		System.out.print("masukan angka : ");
		data = input.nextInt();
		return data;
	}
	
	public static void buatsegitiga(int ulang) {
		for(int i =1; i<=ulang; i++) {
			for(int j = ulang - i; j >= 0; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	};
	
	public static void main(String args[]) {
		int ulang = inputData();
		buatsegitiga(ulang);
		System.out.print("tinggi segitiga adalah "+ulang);
	}

}
