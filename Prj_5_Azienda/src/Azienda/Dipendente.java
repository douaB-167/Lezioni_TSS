package Azienda;

import java.util.Random;

public abstract class Dipendente {

	//INCAPSULAMENTO
	protected Ruoli ruolo;
	protected String nome;
	protected String cognome;
	private String numBadge;
	protected final static double stipendioBase = 1000;
	
	//COSTRUTTORE A FIRMA PIENA
	public Dipendente(Ruoli ruolo, String nome, String cognome) {
		this.ruolo = ruolo;
		this.nome = nome;
		this.cognome = cognome;
	}

	//GETTER E SETTER
	public Ruoli getDipendente() {
		return this.ruolo;
	}


	public void setDipendente(Ruoli ruolo) {
		this.ruolo = ruolo;
	}


	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return this.cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	//METODI ASTRATTI
	abstract double calcolaStipendio();
	
	//METODO CONCRETO
	//PER IL CALCOLO DEL NUMBADGE DI OGNI LAVORATORE 
	//COMPOSTO DA: PRIMA LETTERA IN MAIUSCOLO NOME, PRIMA LETTERA IN MAIUSCOLO COGNOME. 3 NUMERI RANDOM, UNA LETTERA MAIUSCOLA RANDOM 
	public String calcolaBadge() {
		Random r = new Random();
		Integer num = r.nextInt(1000);
        char lettera = (char) ('A' + r.nextInt(26)); // da 'A' a 'Z'
//		      rand.nextInt(26) genera un numero casuale da 0 a 25.
//		      (char) ('A' + numero) trasforma quel numero in una lettera.
        
        this.numBadge = "";
//		        System.out.println(getNome().toUpperCase().charAt(0) + "" + getCognome().toUpperCase().charAt(0));
		this.numBadge += getNome().toUpperCase().charAt(0) + "" + getCognome().toUpperCase().charAt(0);
		this.numBadge += num.toString() + lettera;
		return this.numBadge;
	}
	
	public void mostraInfo() {
		System.out.println("Nome: " + getNome() + " Cognome: " + getCognome());
	}
	
	@Override
	public String toString() {
	    return ruolo.toString();
	}

	
}
