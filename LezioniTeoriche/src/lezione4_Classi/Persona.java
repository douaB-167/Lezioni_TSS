package lezione4_Classi;

public class Persona {
/**
 * 	OOP
 *  - Ereditarietà
 *  - Polimorfismo
 *  - Incapsulamento
 *  - Astrazione
 */
/** 
 * java è class based
 * la classe è il modello, il blueprint per la creazione di oggetti
 * Class è un progetto ma NON un prototipo quello è JavaScript
 * Le stringhe sono oggetti
 * oggetti simili perchè la specifica ma dello stesso tipo
 * la classe definisce un tipo di dato complesso, che non significa difficile
 * l'instanza della classe è l'oggetto 
 * istanza: rappresentazione reale di qualcosa
 */
	//STATO della classe. Caratteristiche
	public String nome;
	public String cognome;
	public int eta;
	public double altezza;
	public int matricola;
	
	//Metodo costruttore
	//Deve avere lo stesso identico nome della classe
	public Persona(String name, String surname, int age, double height, String id) { 	//placeholder, come si chiama il parametro che mi passi
		this.nome = name + " " + id; //id parametro di un metodo per costruire qualcossa
		this.cognome = surname;
		this.eta = age;
		this.altezza = height;
		this.matricola = matricolatore();
		
		
	}
	
	public int matricolatore() {
		int matricola = (int) Math.ceil(Math.random() * 100);
		return matricola;
	}
	
	
}
