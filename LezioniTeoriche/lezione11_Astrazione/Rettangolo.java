package lezione11_Astrazione;

public class Rettangolo extends FormaGeometrica {

	private double larghezza; 
	private double lunghezza; 
	
	//ATT: sono obbligato a dichiarare il costruttore poichè nella superclasse ho dichiarato un costruttore non di dedault...Regole generale...
	public Rettangolo(Colore colore, double larghezza, double lunghezza) {
		super("Rettangolo", colore);
		this.larghezza = larghezza;
		this.lunghezza = lunghezza;
	}

	@Override
	double calcolaArea() {
		return this.larghezza * this.lunghezza;
	}

	@Override
	double calcolaPerimetro() {
		return 2 * (this.larghezza + this.lunghezza);
	}
	
	
	
	

}
