package model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
	
	List<Brano> brani = new ArrayList<Brano>();
	public String nome;
	public double durataTotale;
	public int numeroBrani;
	
	public Playlist() {
		
	}
	
	public Playlist(String nome, int numeroBrani) {
		this.nome = nome;
		this.numeroBrani = numeroBrani;
	}

	/**
	 * serve ad aggiungere brano per brano all'ArrayList di tipo Brano
	 * @param brano
	 */
	public void addBrano(Brano brano) {
		this.brani.add(brano);
	}

	/**
	 * serve a rimuovere brano per brano all'ArrayList di tipo Brano
	 * @param brano
	 */
	public void removeBrano(Brano brano) {
		this.brani.remove(brano);
	}
	
	/**
	 * serve a stampare le informazioi di ogni brano all'utente
	 */
	public void infoPlaylist() {
		for(Brano brano : brani) {
			System.out.println("Titolo brano: " + brano.titolo + " del cantante: " + brano.autore + " della durata di " + brano.durata + " si sta riproducendo nella playlist " + nome);
		}
	}
	
	/**
	 * serve a controllare se il brano esiste già nella playlist, nel caso ci fosse lo segnala all'utente
	 * @param nuovo
	 * @return true/false
	 */
	public boolean esisteBrano(Brano nuovo) {
	    for (Brano b : brani) { //scorrrimento elemento per elemento dell'ArrayList
//	    	controllo dei titoli se sono uguali e in caso positivo controlla anche l'autore se è lo stesso
	        if (b.titolo.equalsIgnoreCase(nuovo.titolo) && b.autore.equalsIgnoreCase(nuovo.autore)) {
	            return true; //restituisce true se trova che il brano è già essitente nella playlist
	        }
	    }
	    return false; //restituisce false se non trova che il brano è già essitente nella playlist
	}
	
	/**
	 * serve a simulare il play di ogni brano
	 * @return true/false
	 */
	public boolean play() {
//		controlla se la playlist contiene almeno un brano nel caso stamoa un messggio di informaizione
	    if (brani.isEmpty()) {
	        System.out.println("La playlist è vuota. Nessun brano da riprodurre.");
	        return false;
	    }
//	    simulazione della riproduzione 
	    System.out.println("▶️ Riproduzione playlist: " + nome);
	    for (Brano brano : brani) {
	        brano.play();  // chiama il metodo di ogni brano
	    }

	    return true;
	}

	
}
