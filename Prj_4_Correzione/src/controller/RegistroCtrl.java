package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Studente;
import model.Registro;

public class RegistroCtrl {
	
	/**
	 * Registro registro;
	 * AL<Studente> studenti
	 * 
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
	
	private ArrayList<Studente> studenti = new ArrayList<Studente>();
	private ArrayList<Studente> presenti = new ArrayList<Studente>();
	private ArrayList<Studente> assenti = new ArrayList<Studente>();
	
	private Registro registro;
	private String presenza;
	
	public RegistroCtrl() {
		
	}
	
	public RegistroCtrl(Registro registro) {
		this.registro = registro;
	}

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
				this.registro.aggiungiStudente(studente);
			}
			System.out.println("Hai caricato tutti gli studenti");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Non sono stato in grado di trovare il file. Controlla la sua posizione");
			e.printStackTrace();
		}
	}
	
	public void faiAppello() {
		Scanner scanner = new Scanner(System.in);
		char scelta;
		
		presenti.clear();
	    assenti.clear();
		
		for(Studente studente : this.registro.getStudenti()) {
			do{ 
				System.out.println(studente);
				System.out.print("Il seguente studente è presente? p/a --> ");
				scelta = scanner.next().toLowerCase().charAt(0);
			}while(scelta != 'p' && scelta != 'a');
			if(scelta == 'p') {
				studente.setPresenza("Presente");
				presenti.add(studente);
			}else {
				studente.setPresenza("Assente");
				assenti.add(studente);
			}
		}
		
		System.out.println("Appello completato.");
		
		System.out.println("---REGISTRO COMPLETO---");
		for (Studente studente : this.registro.getStudenti()) {
			System.out.println(studente.getMatricola() + " - " + studente.getNome() + " " + studente.getCognome() + " " + studente.getPresenza());
		}
		
	}
	
	public void aggiungiStudenteSuFile(Studente s, String pathfile) {
		File fileElenco = new File(pathfile);
		
		if(s.equals(null)) {
			throw new IllegalArgumentException();
		}else {
			try {
				String nome = s.getNome();
				String cognome = s.getCognome();
				String corso = s.getCorso();
				Integer nMat = s.getMatricola();
				
				//il secondo parametro true serve a fare l'append al file già esistente
				//se non metto il true creo proprio un nuovo file
				FileWriter fW = new FileWriter(pathfile, true);
				
				fW.write("\n" + nome + "," + cognome + "," + corso + "," + nMat);
				fW.close();
				
				this.registro.aggiungiStudente(s);
				
				System.out.println("Studente " + s + "\nAggiunto con successo");
			} catch (IOException e) {
				System.out.println("Non sono in grado di aggiungere lo studente al file");
				e.printStackTrace();
			}
			
			
		}
		
		
	}
	
}
