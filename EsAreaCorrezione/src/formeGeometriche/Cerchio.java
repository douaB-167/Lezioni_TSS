package formeGeometriche;

public class Cerchio extends FormeGeometriche {
	
	private double raggio;
	
	public Cerchio(double raggio) {
		this.raggio = raggio;
	}
	
	public double getRaggio() {
		return raggio;
	}
	
	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	@Override
	public double calcolaArea() {
		return Math.ceil(Math.PI * Math.pow(raggio, 2));
	}

	@Override
	public double calcolaPerimetro() {
		return Math.round(2 * Math.PI * this.raggio);
	}
	
}
