package model;

import java.util.ArrayList;

public class Registro {
	
	/**
	 * nomeCorso
	 * studenti ArrayList
	 * 
	 * getStudenteByMatricola(numMat) 
	 * 
	 * aggiungiStudenteAlCorso() **ATT**
	 */
	
	private String nomeCorso;
	private ArrayList<Studente> studenti = new ArrayList<Studente>();
//	list è la classe wrapper di ArrayList e Queue
	
	public Registro(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public ArrayList<Studente> getStudenti() {
		return studenti;
	}

	
	public Studente getStudByMat(int nMat) {
		for(Studente s : studenti) {
			if(s.getMatricola() == nMat) {
				return s;
			}
		}
		return null;
	}
	
	public void aggiungiStudente(Studente s) {
		this.studenti.add(s);
	}

}
