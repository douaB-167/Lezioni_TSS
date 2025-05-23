package lezione04_Classi;

public class Tester {
	
	public static void main(String[] args) {
		
		//Creo un'stanza della classe Persona invocando il metodo costruttore della classe Persona
		Persona pers1 = new Persona("Pier", "Bolli", 25, 1.80, "001"); 
		
		//Leggo le caratteristiche ovvero accedo alle proprietà dell'oggetto
		System.out.println(pers1.nome);
		System.out.println(pers1.cognome);
		System.out.println(pers1.eta);
		System.out.println(pers1.altezza);
		System.out.println(pers1.matricola);
		
		Canzone canzone1 = new Canzone(); //Qui utilizzo il costruttore di default
		canzone1.titolo = "Eooo"; //costruire le caratteristiche una alla volta 
		canzone1.cantante = "Bad Bunny";
		canzone1.durata = 3.8;
		
		System.out.println("Titolo: " + canzone1.titolo + " - " + canzone1.cantante);
		
		Canzone canzone2 = new Canzone("Bruno Mars", "24K", 2.5); //qui utilizzo il costruttore a firma piena
		System.out.println("Titolo: " + canzone2.titolo + " - " + canzone2.cantante);

		Canzone canzone3 = new Canzone("Mj", "Off the wall");
		System.out.println("Titolo: " + canzone3.titolo + " - " + canzone3.cantante);
		System.out.println(canzone3.toString());
		
		Bicicletta miaBici = new Bicicletta(); //Sto creando una bici con il costruttore di default 
		System.out.println("La mia bici è di marca: " + miaBici.marca);
		miaBici.accelera(100);
		System.out.println(miaBici); //ATT: stampare direttamente l'oggetto quando abbiamo un toString() lo richiamo in automatico
		
		
	}


}
