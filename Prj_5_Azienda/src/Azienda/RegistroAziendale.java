package Azienda;

import java.util.Random;

public abstract class RegistroAziendale {
	
	//INCAPSULAMENTO
	protected Ruoli ruolo;
	protected String nome;
	protected String cognome;
	protected String numBadge;
	protected double orarioSettimanale;
	protected static double stipendioBase = 1000;
	
	//COSTRUTTORE A FIRMA PIENA
	public RegistroAziendale(Ruoli ruolo, String nome, String cognome, double orarioSettimanale) {
		this.ruolo = ruolo;
		this.nome = nome;
		this.cognome = cognome;
		this.orarioSettimanale = orarioSettimanale;
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
	
	public String getNumBadge() {
		return this.numBadge;
	}
	
	public void setNumBadge(String numBadge) {
		this.numBadge = numBadge;
	}
	
	public double getOrarioSettimanale() {
		return this.orarioSettimanale;
	}
	
	public void setOrarioSettimanle(double orarioSettimanale) {
		this.orarioSettimanale = orarioSettimanale;
	}
	
	
	//METODI ASTRATTI
	abstract void stampaDipendenti();
	abstract void  stampaAlRuolo();
	
	//METODI CONCRETI
	//PER IL CALCOLO DELLO STIPENDIO
	public double calcolaStipendio() {
		return stipendioBase;
	};
	
	//PER IL CALCOLO DEL NUMBADGE DI OGNI LAVORATORE 
	//COMPOSTO DA: PRIMA LETTERA IN MAIUSCOLO NOME, PRIMA LETTERA IN MAIUSCOLO COGNOME. 3 NUMERI RANDOM, UNA LETTERA MAIUSCOLA RANDOM 
	public String calcolaBadge() {
		Random r = new Random();
		Integer num = r.nextInt(1000);
        char lettera = (char) ('A' + r.nextInt(26)); // da 'A' a 'Z'
//      rand.nextInt(26) genera un numero casuale da 0 a 25.
//      (char) ('A' + numero) trasforma quel numero in una lettera.
        
        this.numBadge = "";
//        System.out.println(getNome().toUpperCase().charAt(0) + "" + getCognome().toUpperCase().charAt(0));
		this.numBadge += getNome().toUpperCase().charAt(0) + "" + getCognome().toUpperCase().charAt(0);
		this.numBadge += num.toString() + lettera;
		return this.numBadge;
	}
	
}
