package lezione09_Ereditarietà;

public class Motocicletta extends Veicolo{
	
	private String tipo;

	public Motocicletta(String marca, String modello, int annoProd, String tipo) {
		super(marca, modello, annoProd, 2);
		this.tipo = tipo;
		
	}

	@Override
	public void start() {
		System.out.println("Hai avviato la tua Motocicletta");
	}

	@Override
	public void mostraInfo() {
		// TODO Auto-generated method stub
		super.mostraInfo();
		System.out.println("Tipo di moto: " + this.tipo);
	}
	
	//Posso avere anche metodi tipici solo di questa classe
	public void impanna() {
		System.out.println("VROOOOOOOO sto impennando la moto!!");
	}
	

}
