package Azienda;

public abstract class RegistroAziendale {
	
	protected Ruoli ruolo;
	protected double stipendio;
	protected String nome;
	protected String cognome;
	protected String numBadge;
	protected double orarioSettimanale;
	
	public RegistroAziendale(Ruoli ruolo, double stipendio, String nome, String cognome, String numBadge, double orarioSettimanale) {
		this.ruolo = ruolo;
		this.stipendio = stipendio;
		this.nome = nome;
		this.cognome = cognome;
		this.numBadge = numBadge;
		this.orarioSettimanale = orarioSettimanale;
	}

	public Ruoli getDipendente() {
		return this.ruolo;
	}


	public void setDipendente(Ruoli ruolo) {
		this.ruolo = ruolo;
	}


	public double getStipendio() {
		return stipendio;
	}


	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
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
	
	abstract double calcolaStipendio();
	abstract String stampaDipendenti();
	abstract String stampaAlRuolo();
	
}
