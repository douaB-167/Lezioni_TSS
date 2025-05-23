package lezione11_Astrazione;

public class Cerchio extends FormaGeometrica {
	
	private double raggio;
	
	public Cerchio(Colore colore, double raggio) {
		super("Cerchio", colore);
		this.raggio = raggio;
	}

	public double getRaggio() {
		return this.raggio;
	}
	
	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
	
	//ATT: questi due metodi qua sotto sono obbligato ad implementare, poichè dichiarati abstract nella superclass
	@Override
	double calcolaArea() {
		return Math.round(Math.PI * Math.pow(this.raggio, 2));
	}

	@Override
	double calcolaPerimetro() {
		return Math.round(2 * Math.PI * this.raggio);
	}

}
