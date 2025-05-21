package model;

public class Studente {
	
	/**
	 * nome
	 * cognome
	 * matricola
	 * corso
	 * contatore (all'occorrenza)
	 */

	private String nome;
	private String cognome;
	private String corso;
	private int matricola;
	private static int contatore;
	
	//costruttore a firma vuota
	public Studente() {
		
	}
	
	//costruttore a firma piena 
	public Studente(String cognome, String nome, String corso, int matricola) {
		this.cognome = cognome;
		this.nome = nome;
		this.corso = corso;
		this.matricola = matricola;
		contatore++;
		System.out.println("Nel tuo registro ci sono " + contatore + " studenti");	
	}
	
	//stampa le caratteristiche
	public String stampa() {
		return this.matricola + " - " + this.cognome + " - " + this.nome + " - " + this.corso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}
	
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + ", corso=" + corso
				+ "]";
	}
	
	
}
