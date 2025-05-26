package lezione12_Interfacce;

public class Cerchio implements FormaCalcolabile {
	
	private double raggio;

	public Cerchio(double raggio) {
		this.raggio = raggio;
	}
	
	@Override
	public double calcolaArea() {
		return Math.round(Math.PI * Math.pow(this.raggio, 2));
	}

	@Override
	public double calcolaPerimetro() {
		return Math.round(2 * Math.PI * this.raggio);
	}

}
