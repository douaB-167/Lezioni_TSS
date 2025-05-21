package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Studente;

public class RegistroCtrl {
	
	/**
	 * sviluppa i seguenti metodi
	 * caricaStudentiDaFile()
	 * 
	 * ****aggiungiStudenteAFile()****
	 * 
	 * 
	 * faiAppello() {chiede se lo stud è presente o assente. Lo stud è presente? Y/N
	 * stampaPresenti()
	 * stampaAssenti()
	 */

	private ArrayList<Studente> studenti;
	private List<Studente> presentiList;
    private List<Studente> assentiList;
	
	public RegistroCtrl() {
		this.studenti = new ArrayList<Studente>();
		this.presentiList = new ArrayList<>();
		this.assentiList = new ArrayList<>();
	}
	
	/**
	 * questo metodo serve a caricare tutti gli studenti da file e stamparne il contenuto richiamando il costruttore a firma piena
	 */
	public void caricaStudentiDaFile() {
		File fileStudenti = new File("elencoStudenti_TSS.csv");
		try {
			Scanner sc = new Scanner(fileStudenti);
			while(sc.hasNextLine()) {
				String riga = sc.nextLine();
				String[] separate = riga.split(",");
				String cognome = separate[0];
				String nome = separate[1];
				String corso = separate[2];
				Integer matricola = Integer.parseInt(separate[3]);
				Studente studente = new Studente(cognome, nome, corso, matricola);
				this.studenti.add(studente);
			}
			System.out.println("Hai caricato tutti gli studenti");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Non sono stato in grado di trovare il file. Controlla la sua posizione");
			e.printStackTrace();
		}
	}
	
	/**
	 * questo metodo serve a caricare i nuovi studenti sul file
	 */
	public void aggiungiStudentiAFile() {
		
	}
	
	
	public ArrayList<Studente> getStudenti() {
		return studenti;
	}
	
	//get(index) è un metodo dell'arraylist
	public Studente getSingolobrano(int indice) {
		return studenti.get(indice);
	}
	
	/**
	 * questo metodo grazie al for each serve a far scorrere larraylist di tipo studenti e stampare ogni studente
	 */
	public void stampaStudentiRe() {
		for(Studente studente : studenti) {
			System.out.println(studente.stampa());
		}
	}
	
	/**
	 * questo metodo serve ad eseguire l'appello
	 * con il metodo clear() andiamo a cancellare i valori dell'appelo precedente
	 * con un primo syso e scanner attribuiamo la presenza oppure l'assenza
	 * con il do{}while eseguiamo il controllo dell'inserimento del carattere se è corretto
	 * con l'if scelta == 'p' aggiungiamo lo studente all'arraylist dei presenti
	 * se scelta == 'a' aggiungiamo lo studente all'arraylist degli assenti
	 * @return void
	 */
	public void faiAppello() {
		Scanner scanner = new Scanner(System.in);
		char scelta;
		
		presentiList.clear();
	    assentiList.clear();
		
		for(Studente studente : studenti) {
			do{ 
				System.out.println(studente.stampa());
				System.out.print("Il seguente studente è presente? p/a --> ");
				scelta = scanner.next().toLowerCase().charAt(0);
			}while(scelta != 'p' && scelta != 'a');
			if(scelta == 'p') {
				presentiList.add(studente);
			}else {
				assentiList.add(studente);
			}
		}
		
		System.out.println("Appello completato.");
		
	}
	
	/**
	 * questo metodo grazie al for each serve a stampare tutti gli assenti
	 */
	public void stampaAssenti() {
		System.out.println("\nAssenti:");
	    for (Studente s : assentiList) {
	        System.out.println(s.getMatricola() + " - " + s.getNome() + " " + s.getCognome());
	    }
	}
	
	/**
	 * questo metodo grazie al for each serve a stampare tutti i presenti
	 */
	public void stampaPresenti() {
	    System.out.println("\nPresenti:");
	    for (Studente s : presentiList) {
	        System.out.println(s.getMatricola() + " - " + s.getNome() + " " + s.getCognome());
	    }
	}
}
