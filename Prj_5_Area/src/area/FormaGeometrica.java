package area;

public class FormaGeometrica {
	
	protected double lato;
	protected double base;
	protected double altezza;
	
	public FormaGeometrica(double lato) {
		this.lato = lato;
	}
	
	public FormaGeometrica(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public double calcolaArea() {
		return 0;
	}
	
	public double calcolaPerimetro() {
		return 0;
	}

}
