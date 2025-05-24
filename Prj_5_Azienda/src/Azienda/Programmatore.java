package Azienda;

public class Programmatore extends RegistroAziendale {

	public Programmatore(Ruoli ruolo, String nome, String cognome, 
			double orarioSettimanale) {
		super(ruolo, nome, cognome, orarioSettimanale);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calcolaStipendio() {
		return 1000 * 2 + 500;
	}

	@Override
	void stampaDipendenti() {
		for (Ruoli ruoli : ruolo.values()) {
			System.out.println(ruoli);
		}
	}

	@Override
	String stampaAlRuolo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String calcolaBadge() {
		// TODO Auto-generated method stub
		return super.calcolaBadge();
	}
	
	

}
