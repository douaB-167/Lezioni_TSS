# Classi astratte in Java
Una classe astratta è una classe che non può essere istanziata direttamente e che può contenere (oppure no) metodi astratti (metodi dichiarati ma non implementati). Le classi astratte servono come "template" per altre classi e sono progettate per essere estese.

## Regole e caratteristiche delle classi astratte
 * Dichiarate con la keyword ```abstract```;
 * Possono contenere metodi astratti (dichiarati con ```abstract``` e senza implementazione);
 * Possono contenere anche metodi concreti (con implementazione);
 * Non possono essere istanziate con l'operatore ```new```;
 * Le sottoclassi devono implementare tutti i metodi astratti o essere dichiarate anch'esse astratte;
 * Possono avere costruttori (utilizzati dalle sottoclassi):
    * Se la classe astratta definisce uno o più costruttori con argomenti (e nessun costruttore di default) allora ogni sottoclasse dovrà esplicitamente richiamare uno dei costruttori della superclasse (utilizza super()). Quindi la sottoclasse deve avere un costruttore
 * Possono avere campi, costanti e metodi statici.

## Quando usare le classi astratte 
 * Quando si vuole condividere codice tra classi strettamente correlate;
 * Quando le classi che ereditano hanno molti metodi o campi in comune;
 * Quando si vuole dichiarare metodi non-statici e non-final che le sottoclassi devono implementare;
 * Quando si ha bisogno di accedere a modificatori diversi da public (protected, private)

## ATTENZIONE
Le classi che ereditano una classe astratta, implementano solo i metodi astratti e non quelli concreti. Nell'esempio qui sotto la classe Cerchio implementa solo calcolaArea() e calcolaPerimetro() e NON mostraInfo() perchè è un metodo concreto all'interno della classe astratta

#### esempio
```java
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
public class Cerchio extends FormaGeometrica {
	
	private double raggio;
	
	public Cerchio(Colore colore, double raggio) {
		super("Cerchio", colore);
		this.raggio = raggio;
	}

	public double getRaggio() {
		return this.raggio;
	}
	
	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
	
	//ATT: questi due metodi qua sotto sono obbligato ad implementare, poichè dichiarati abstract nella superclass
	@Override
	double calcolaArea() {
		return Math.round(Math.PI * Math.pow(this.raggio, 2));
	}

	@Override
	double calcolaPerimetro() {
		return Math.round(2 * Math.PI * this.raggio);
	}

}
public enum Colore {
	ROSSO,
	LILLA,
	ROSA,
	BLU,
	VERDE,
	NERO,
	BIANCO,
	AZZURRO,
	GIALLO
}
```
