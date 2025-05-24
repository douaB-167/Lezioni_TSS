package Azienda;

public class Manager extends RegistroAziendale {

	public Manager(Ruoli ruolo, String nome, String cognome,
			double orarioSettimanale) {
		super(ruolo, nome, cognome, orarioSettimanale);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calcolaStipendio() {
		return 1000 * 4 + 200;
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
