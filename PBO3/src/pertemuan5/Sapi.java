package pertemuan5;

class Cow extends Hewan {
		int berat, usia;
		String nama, kelamin;
		public void identitas(String namaSapi, String kelaminSapi, int berat, int usia) {
			Cow.name = namaSapi;
			kelamin = kelaminSapi;
			this.berat = berat;
			this.usia = usia;
		}
		public void eat() {
			System.out.print(Cow.name + " makan rumput");
		}
		public String getkelamin() {
			return kelamin;
		}
		
}
