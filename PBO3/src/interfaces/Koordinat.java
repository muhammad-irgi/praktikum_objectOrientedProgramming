package interfaces;

public class Koordinat implements GarisLurus {
	private int x1;
	private int y1;
	private int x2;
	private int y2;

	   
	public Koordinat(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
	    this.y1 = y1;
	    this.x2 = x2;
	    this.y2 = y2;
	    }
	
	public int getX1() {
		return x1;
		}
	
	public int getY1() {
		return y1;
		}

	public int getX2() {
		return x2;
		}
	    
	public int getY2() {
		return y2;
		}
	
	public int hitungGradien() {       
		int gradien = (y2 - y1) / (x2 - x1);
		return gradien;
	    }
	}

class TestKoordinat {
    public static void main(String[] args) {
    	Koordinat koordinat1 = new Koordinat(2, 10, 5, 7);
       	Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);
       	
    	
    	System.out.printf("Garis yang melalui titik (%d, %d) ", koordinat1.getX1(), koordinat1.getY1());
    	System.out.printf("dan (%d, %d) \n", koordinat1.getX2(), koordinat1.getY2());
    	System.out.print("Memiliki gradien sebesar : " + koordinat1.hitungGradien());
    	
    	System.out.print("\n <<=================================>> \n");
    	
    	System.out.printf("Garis yang melalui titik (%d, %d) ", koordinat2.getX1(), koordinat2.getY1());
    	System.out.printf("dan (%d, %d) \n", koordinat2.getX2(), koordinat2.getY2());
    	System.out.print("Memiliki gradien sebesar : " + koordinat2.hitungGradien());

    	
    }
}
