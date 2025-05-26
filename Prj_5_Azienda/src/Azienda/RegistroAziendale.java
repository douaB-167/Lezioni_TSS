package Azienda;

import java.util.ArrayList;
import java.util.List;

public class RegistroAziendale {

	private List<Dipendente> listaDipendenti;
	
	//COSTRUTTORE 
	public RegistroAziendale() {
		this.listaDipendenti = new ArrayList<Dipendente>();
	}
	
	//METODI CONCRETI
	public void aggiungiDipendente(Dipendente dip) {
		this.listaDipendenti.add(dip);
	}
	
	public void stampaDipendenti() {
		System.out.println("------- ELENCO DIPENDENTI -------");
		for(Dipendente dipendente: listaDipendenti){
			System.out.println(dipendente);
		}
	}
	
	public void stampaRuolo(Ruoli ruolo) {
		System.out.println("------- ELENCO DIPENDENTI PER RUOLO -------");
		for(Dipendente dip: listaDipendenti){
			if(dip.ruolo.equals(ruolo)) {
				System.out.println(dip);
			}
		}
	}
	
	
}
