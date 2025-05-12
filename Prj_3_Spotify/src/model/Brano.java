package model;

public class Brano {
	
	public String autore;
	public String titolo;
	public String genere;
	public double durata;
	
	public Brano() {
		super();
	}

	public Brano(String autore, String titolo, String genere, double durata) {
		this.autore = autore;
		this.titolo = titolo;
		this.genere = genere;
		this.durata = durata;
	}

	public String stampaInfo(){
		String s = "";
		s += "Titolo: " + titolo + " - " + autore + " " + durata;
		s += "\nGenere: " + genere;
		return s;
	}
	
	public boolean play() {
	
		return true;
	}
	
	

}
