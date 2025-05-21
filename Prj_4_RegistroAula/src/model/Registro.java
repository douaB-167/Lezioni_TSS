package model;

import java.util.List;

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
	private List<Studente> studenti;
	
	public String getNomeCorso() {
		return nomeCorso;
	}
	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}
	
	public List<Studente> getStudenti(){
		return studenti;
	}
	
	public static Studente getStudenteByMatricola(Studente[] listaStudenti, int numMat) {
		Studente studenteTrovato = null;
		for(int i = 0; i < listaStudenti.length; i++) {
			if(listaStudenti[i] != null && listaStudenti[i].getMatricola() == numMat) {
				studenteTrovato = listaStudenti[i];
			}
		}
		return studenteTrovato;
	}
	
	public void addStudentiAlCorso(Studente studente) {
		
	}

}
