package area;

public class Triangolo extends FormaGeometrica {
	
	public Triangolo(double base, double altezza) {
		super(base, altezza);
		// TODO Auto-generated constructor stub
	}
	
	public Triangolo(double base, double a, double b) {
		super(base, a, b);
	}

	@Override
	public double calcolaArea() {
		return (this.base * this.altezza) / 2;
	}

	@Override
	public double calcolaPerimetro() {
		return this.base + this.a + this.b;
	}

}
