package model;

public class Brano {
	
	public String autore;
	public String titolo;
	public String genere;
	public double durata;
	
	public Brano() {
	}

	public Brano(String autore, String titolo) {
		this.autore = autore;
		this.titolo = titolo;
	}
	
	public Brano(String autore, String titolo, String genere, double durata) {
		this.autore = autore;
		this.titolo = titolo;
		this.genere = genere;
		this.durata = durata;
	}

	/**
	 * stampa le informazioni principali del brano
	 * @return s che è una Stringa
	 */
	public String stampaInfo(){
		String s = "";
		s += "Titolo: " + titolo + " - " + autore + " " + durata;
		s += "\nGenere: " + genere;
		return s;
	}
	
	/**
	 * simula la riproduzione di un brano all'interno della playlist
	 */
	public void play() {
	    System.out.println("🎵 In riproduzione: \"" + titolo + "\" di " + autore +
	                       " (" + durata + " min)");
	}
}
