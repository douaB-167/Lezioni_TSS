package area;

public class Triangolo extends FormaGeometrica {
	
	public Triangolo(double base, double altezza) {
		super(base, altezza);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcolaArea() {
		return Math.round((this.base * this.altezza) / 2);
	}

	@Override
	public double calcolaPerimetro() {
		return Math.round(Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altezza, 2;)));
	}

}
