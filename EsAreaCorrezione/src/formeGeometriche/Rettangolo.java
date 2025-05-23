package formeGeometriche;

public class Rettangolo extends FormeGeometriche {

	private double base;
	private double altezza;
	
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	@Override
	public double calcolaArea() {
		return this.base * this.altezza;
	}

	@Override
	public double calcolaPerimetro() {
		return 2 * (this.base * this.altezza);
	}
	
}
