package area;

public class Rettangolo extends FormaGeometrica{

	public Rettangolo(double base, double altezza) {
		super(base, altezza);
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
