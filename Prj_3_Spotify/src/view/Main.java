package view;

import java.util.Scanner;

import model.Brano;
import model.Playlist;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		richiesta delle informazioni principali per creare una playlist
		System.out.print("Inserisci il titolo della playlist: ");
		String titoloPL = scanner.nextLine();
		
		System.out.print("Inserisci il numero di brani che vuoi inserire: ");
		int numeroBrani = scanner.nextInt();
		scanner.nextLine(); // <-- consuma il newline rimasto sennò salterà direttamente all'input dell'autore

//		creazione dell'istanza della classe Playlist
		Playlist playlist1 = new Playlist(titoloPL, numeroBrani);

//		creazione del ciclo for con dimensione chiesta in input
		for(int i = 0; i < numeroBrani; i++) {
//			richesta informazioni principali di ogni brano
			System.out.print("Inserisci il titolo della canzone: ");
			String titolo = scanner.nextLine();
			
			System.out.print("Inserisci il nome del cantante: ");
			String autore = scanner.nextLine();

//			creazione dell'istanza della classe Brano
			Brano nuovoBrano = new Brano(autore, titolo);
			
//			controllo se il brano esiste già prima di aggiungerlo
			if (playlist1.esisteBrano(nuovoBrano)) {
				System.out.println("❌ Brano già presente! Non verrà aggiunto.");
				i--; // così l’utente può reinserire un altro
			} else {
				playlist1.addBrano(nuovoBrano); //nel caso non ci sia un duplicato lo aggiunge all'Arraylist
			}
			  
		}
		
		System.out.println("\n🎵 Playlist creata con successo:");
        playlist1.infoPlaylist(); //stampa delle informazioni di ogni brano
        playlist1.play(); //richiamo del metodo play() nella classe playlist
	}

}
