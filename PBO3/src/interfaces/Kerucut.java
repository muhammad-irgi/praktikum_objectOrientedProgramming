package interfaces;
import java.util.Scanner;

public class Kerucut implements BangunRuang{
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
	
	public double Volume() {
		return (Math.PI * Math.pow(radius, 2) * tinggi)/3;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Kerucut kerucut = new Kerucut();
		
		double radius,tinggi;
		System.out.print("Masukan jari jari tabung : ");
		radius = input.nextDouble();

		System.out.print("Masukan tinggi tabung : ");
		tinggi = input.nextDouble();
		
		kerucut.setRadius(radius);
		kerucut.setTinggi(tinggi);
		
		// format dua digit di belakang koma
		String formattedString = String.format("Volume Kerucut : %.2f", kerucut.Volume());
		System.out.println(formattedString);
	}

}
