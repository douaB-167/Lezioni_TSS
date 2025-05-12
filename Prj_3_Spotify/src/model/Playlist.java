package model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
	
	List<Brano> brano = new ArrayList<Brano>();
	public String nome;
	public double durataTotale;
	public int numeroBrani;
	
	public Playlist() {
		
	}
	
	public Playlist(String nome, double durataTotale, int numeroBrani) {
		this.nome = nome;
		this.durataTotale = durataTotale;
		this.numeroBrani = numeroBrani;
	}

	public void addBrano(Brano brano) {
		this.brano.add(brano);
	}

	public void removeBrano(Brano brano) {
		this.brano.add(brano);
	}
	
	public void infoPlaylist() {
		System.out.println("Playlist: " + nome + " " + numeroBrani + " brani. Della durata di " + durataTotale);
	}
	
}
