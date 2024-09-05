package interfaces;
import java.util.Scanner;

public class Tabung implements BangunRuang {
	private double radius;
	private double tinggi;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}
	public double getTinggi() {
		return tinggi;
	}
	@Override
	public double Volume() {
		return Math.PI * Math.pow(radius, 2) * tinggi;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Tabung tabung = new Tabung();
		
		double radius, tinggi;
		System.out.print("Masukan jari jari tabung : ");
		radius = input.nextDouble();

		System.out.print("Masukan tinggi tabung : ");
		tinggi = input.nextDouble();
		
		tabung.setRadius(radius);
		tabung.setTinggi(tinggi);
		
		// format dua digit di belakang koma
		String formattedString = String.format("Volume Tabung : %.2f", tabung.Volume());
        System.out.println(formattedString);

	}
	
}
