package lezione12_Interfacce;

public interface MiaPrimaInterface {

	//programmazione by contract
	// Dichiaro dei metodi senza implementazione (sono di default dichiarati public abstract)
	void primoMetodo();
	String secondoMetodo();
	Integer terzoMetodo();
	Boolean quartoMetodo();
	
	//Posso anche dichiarare delle prop (impplicitamente public abstract final)
	int COSTANTE = 1;
	
	//Da JAVA8+ posso anche inserire l'implementazione dei metodi
	static void metodoDefaultDellaInterfaccia() {
		System.out.println("Sono un metodo statico dell'interfaccia");
	}
	
	//metodo Default novità di java8+
	//soolo all'interfaccia senza l'obbligo di implementarlo nella classe che implementa
	default void metodoSoloDefault() {
		System.out.println("Questo è un metodo di default");
	}
	
	
	//L'astrazione definisce le gerarchie
	//L'implementazione definisce le funzionalità che voglio fare
	
	//Interfaccia: insieme di metodi non implementati
}
