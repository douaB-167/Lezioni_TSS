package lezione11_Astrazione;

public abstract class FormaGeometrica {
	
	//POSSO AVERE DELLE PROPRIETA
	protected String nome;
	protected Colore colore;
	
	//Posso avere (ma anche no) un costruttore, anche se la classe astratta non è istannziabile. Però questo costruttore "me lo gioco" nella sottoclasse richiamando super()
	//quindi posso avere anche dei metodi non abstract
	public FormaGeometrica(String nome, Colore colore) {
		super();
		this.nome = nome;
		this.colore = colore;
	}
	
	//Posso aver metodi CONCRETI
	public void mostraInfo() {
		System.out.println("Forma: " + this.nome + " Colore: " + this.colore);
	}

	//metodo astratto nella classe astratta --> quindi non ho implementazione
	abstract double calcolaArea();
	abstract double calcolaPerimetro();
}
