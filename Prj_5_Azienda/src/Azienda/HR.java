package Azienda;

public class HR extends Dipendente {

	public HR(Ruoli ruolo, String nome, String cognome) {
		super(ruolo, nome, cognome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcolaStipendio() {
		return super.stipendioBase * 3.3;
	}

	@Override
	public String calcolaBadge() {
		// TODO Auto-generated method stub
		return super.calcolaBadge();
	}

	
}
