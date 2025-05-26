package Azienda;

public class Manager extends Dipendente {
	
	

	public Manager(Ruoli ruolo, String nome, String cognome) {
		super(ruolo, nome, cognome);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	double calcolaStipendio() {
		// TODO Auto-generated method stub
		return super.stipendioBase * 4.2;
	}



	@Override
	public String calcolaBadge() {
		// TODO Auto-generated method stub
		return super.calcolaBadge();
	}
	
	
	

}
