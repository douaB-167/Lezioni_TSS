package lezione12_Interfacce;

public class InterfaceImpl implements MiaPrimaInterface{

	public InterfaceImpl() {
		
	}

	@Override
	public void primoMetodo() {
		System.out.println("Sono nella classe e questo è il primo metodo");
	}

	@Override
	public String secondoMetodo() {
		String salutaMetodo = "Ciao dal secondo metodo";
		return salutaMetodo;
	}

	@Override
	public Integer terzoMetodo() {
		Integer somma = 5 + 6 ;
		return somma;
	}

	@Override
	public Boolean quartoMetodo() {
		// TODO Auto-generated method stub
		return null;
	}
}
