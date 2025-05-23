package area;

public class Cerchio extends FormaGeometrica {

	public Cerchio(double raggio) {
		super(raggio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcolaArea() {
		return Math.round(Math.PI*Math.pow(this.lato, 2));
	}

	@Override
	public double calcolaPerimetro() {
		return Math.round(2 * Math.PI * this.lato);
	}
	
}
