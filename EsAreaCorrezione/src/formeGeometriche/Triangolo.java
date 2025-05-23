package formeGeometriche;

public class Triangolo extends FormeGeometriche {
	
	public double base;
	public double altezza;
	
	public Triangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	public double calcolaArea() {
		return Math.round((this.base * this.altezza) / 2);
	}

	@Override
	public double calcolaPerimetro() {
		return Math.round(Math.sqrt(Math.pow(base, 2) + Math.pow(altezza, 2)));
	}

}
