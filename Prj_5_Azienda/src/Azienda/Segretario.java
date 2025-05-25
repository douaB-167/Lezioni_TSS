package Azienda;

public class Segretario extends RegistroAziendale {

	public Segretario(Ruoli ruolo, String nome, String cognome) {
		super(ruolo, nome, cognome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcolaStipendio() {
		return super.calcolaStipendio() * 1.9;
	}

	@Override
	void stampaDipendenti() {
		for (Ruoli ruoli : ruolo.values()) {
			System.out.println(ruoli);
		}
	}

	@Override
	void stampaAlRuolo() {
		System.out.println(Ruoli.Segretario + ": " + getNome() + " " + getCognome() + " numBadge: " + calcolaBadge());
	}

	@Override
	public String calcolaBadge() {
		// TODO Auto-generated method stub
		return super.calcolaBadge();
	}

	
}
