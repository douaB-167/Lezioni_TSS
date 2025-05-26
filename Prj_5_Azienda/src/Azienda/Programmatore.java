package Azienda;

public class Programmatore extends Dipendente {

	public Programmatore(Ruoli ruolo, String nome, String cognome) {
		super(ruolo, nome, cognome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcolaStipendio() {
		return super.stipendioBase * 2.5;
	}


	@Override
	public String calcolaBadge() {
		// TODO Auto-generated method stub
		return super.calcolaBadge();
	}
	
	

}
