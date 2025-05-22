package area;

public class FormaGeometrica {
	
	protected double lato;
	protected double base;
	protected double altezza;
	protected double a;
	protected double b;
	
	public FormaGeometrica(double lato) {
		this.lato = lato;
	}
	
	public FormaGeometrica(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public FormaGeometrica(double base, double a, double b) {
		this.base = base;
		this.a = a;
		this.b = b;
	}
	
	public double calcolaArea() {
		return 0;
	}
	
	public double calcolaPerimetro() {
		return 0;
	}

}
