package lezione04_Classi;

public class Canzone {
	
	String cantante;
	String titolo;
	double durata;
	
	//Il costruttore di default essite sempre, può essere anche non specificato se non esiste il costruttore a firma piena
	public Canzone() {} //esiste sempre appatto che io non definisca il costruttore a firma piena
	
	
//	Essendo in presenza di un costruttoere a firma piena e voglio utilizzare un costruttore di default allora devo per forza specificare quest'ultimo
	public Canzone(String cantante, String tirolo, double durata) {
		this.cantante = cantante;
		this.titolo = tirolo;
		this.durata = durata;
	}


	public Canzone(String cantante, String tirolo) {
		this.cantante = cantante;
		this.titolo = tirolo;
	}


	@Override
	//con il metodo to String ottengo una rappresentazione formato stringa del mio oggetto
	//ATT: anche il toString può essere invocato senza essere specificato
	public String toString() {
		if(durata == 0) {
			return "Canzone [cantante=" + cantante + ", titolo=" + titolo + "]";
		}else {
			return "Canzone [cantante=" + cantante + ", tirolo=" + titolo + ", durata=" + durata + "]";
		}
	}

}
