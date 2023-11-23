package pertemuan5;
import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		Cat mycat = new Cat();
		Scanner input = new Scanner(System.in);
		String nama, warna;
		int berat;
		
		System.out.print("Masukan nama kucing : ");
		nama = input.nextLine();
		System.out.print("Masukan warna kucing : ");
		warna = input.nextLine();
		System.out.print("Masukan berat kucing : ");
		berat = input.nextInt();
		
		mycat.identitas(nama, warna, berat);
		mycat.eat();
		
		System.out.print("info kucing \n" 
				+ "nama : " + mycat.ambilNama() + "\n"
				+ "warna : " + mycat.ambilWarna() + "\n"
				+ "berat : "+ mycat.ambilBerat() + " Kg\n"
				+ "ada di teras"
				);

	}

}
