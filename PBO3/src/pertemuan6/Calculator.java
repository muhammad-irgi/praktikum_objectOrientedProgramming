package pertemuan6;
import java.util.Scanner;

public class Calculator {
	public int angka1, angka2, hasil;
	static Scanner input = new Scanner(System.in);
	public void penjumlahan() {
		System.out.print("Masukan angka 1 : ");
		angka1 = input.nextInt();
		System.out.print("Masukan angka 2 : ");
		angka2 = input.nextInt();
		
		hasil = angka1 + angka2;
		System.out.print("hasil : "+hasil);
	}
	public void pengurangan() {
		System.out.print("Masukan angka 1 : ");
		angka1 = input.nextInt();
		System.out.print("Masukan angka 2 : ");
		angka2 = input.nextInt();
		
		hasil = angka1 - angka2;
		System.out.print("hasil : "+hasil);
	}
	public void perkalian() {
		System.out.print("Masukan angka 1 : ");
		angka1 = input.nextInt();
		System.out.print("Masukan angka 2 : ");
		angka2 = input.nextInt();
		
		hasil = angka1 * angka2;
		System.out.print("hasil : "+hasil);
	}
	public void pembagian() {
		System.out.print("Masukan angka 1 : ");
		angka1 = input.nextInt();
		System.out.print("Masukan angka 2 : ");
		angka2 = input.nextInt();
		
		hasil = angka1 / angka2;
		System.out.print("hasil : "+hasil);
	}
	
	
}
