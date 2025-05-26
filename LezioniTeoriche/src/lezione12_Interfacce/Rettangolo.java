package lezione12_Interfacce;

public class Rettangolo implements FormaCalcolabile {

	private double lunghezza;
	private double larghezza;
	
	public Rettangolo(double lunghezza, double larghezza) {
		this.lunghezza = lunghezza;
		this.larghezza = larghezza;
	}

	@Override
	public double calcolaArea() {
		return this.larghezza * this.lunghezza;
	}

	@Override
	public double calcolaPerimetro() {
		// TODO Auto-generated method stub
		return 2 * (this.larghezza + this.lunghezza);
	}
	
	

}
