package Azienda;

public class Programmatore extends RegistroAziendale {

	public Programmatore(Ruoli ruolo, String nome, String cognome, 
			double orarioSettimanale) {
		super(ruolo, nome, cognome, orarioSettimanale);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcolaStipendio() {
		return super.calcolaStipendio() * 2.5;
	}

	@Override
	void stampaDipendenti() {
		for (Ruoli ruoli : ruolo.values()) {
			System.out.println(ruoli);
		}
	}

	@Override
	void stampaAlRuolo() {
		System.out.println(Ruoli.Programmatore + ": " + getNome() + " " + getCognome() + " numBadge: " + calcolaBadge());
	}

	@Override
	public String calcolaBadge() {
		// TODO Auto-generated method stub
		return super.calcolaBadge();
	}
	
	

}
