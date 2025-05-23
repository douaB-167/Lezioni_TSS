package Azienda;

public class Programmatore extends RegistroAziendale {

	public Programmatore(Ruoli ruolo, double stipendio, String nome, String cognome, String numBadge,
			double orarioSettimanale) {
		super(ruolo, stipendio, nome, cognome, numBadge, orarioSettimanale);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calcolaStipendio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String stampaDipendenti() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String stampaAlRuolo() {
		// TODO Auto-generated method stub
		return null;
	}

}
