package formeGeometriche;

public class Quadrato extends FormeGeometriche {
	
	private double lato;
	
	public Quadrato(double lato) {
		this.lato = lato;
	}

	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}

	@Override
	public double calcolaArea() {
		return Math.pow(lato, 2);
	}

	@Override
	public double calcolaPerimetro() {
		return lato * 4;
	}
	
	

}
