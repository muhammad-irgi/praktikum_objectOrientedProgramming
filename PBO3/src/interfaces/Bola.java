package interfaces;
import java.util.Scanner;

public class Bola implements BangunRuang {
	private double radius;
	
	public void setRadius(double radius) {
		this.radius = radius;
		}
	public double getRadius() {
		return radius;
	}
	@Override
	public double Volume() { 
		return (4 * Math.PI * Math.pow(radius, 3))/3;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Bola bola = new Bola();
		
		double radius;
		System.out.print("Masukan panjang jari jari bola : ");
		radius = input.nextDouble();
		
		bola.setRadius(radius);
		// buat format 2 digit dibelakang koma
		String formattedString = String.format("Volume Bola : %.2f", bola.Volume());
        System.out.println(formattedString);
	}
}
