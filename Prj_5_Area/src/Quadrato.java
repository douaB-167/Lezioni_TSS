package area;

public class Quadrato extends FormaGeometrica{

	public Quadrato(double lato) {
		super(lato);
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
