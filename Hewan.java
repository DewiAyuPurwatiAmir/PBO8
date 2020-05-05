public class Hewan{
	String sapi;
	String burung;
	void info (String sapi){
		this.sapi=sapi;
	}
	String burung(String burung){
		this.sapi=burung;
	return burung;
	}
	
	public static void main(String[] args){
		Hewan obj = new Hewan();
		System.out.println("Nama sapi : "+(obj.sapi="melahirkan"));
		System.out.println("Nama burung : "+(obj.burung="bertelur"));
	}
}