package lezione9_Ereditarietà;

public class Main {
	
	public static void main(String[] args) {
		
		//creo un oggetto della superclasse
		System.out.println("-----VEICOLO------");
		Veicolo veicolo = new Veicolo("Generica", "Generico", 2025, 5);
		veicolo.mostraInfo();
		veicolo.start();
		veicolo.stop();
		
		//Creo un oggetto della sottoclasse
		System.out.println("-----AUTOMOBILE-----");
		Automobile auto = new Automobile("Peugeot", "2008", 2023, 4, 4);
		auto.mostraInfo(); //questo è in override con aggiunta
		auto.start(); //questo è in override
		auto.stop(); //questo NON è in override
		
		//Creo un veicolo generico ----- POLIMORFISMO
		System.out.println("------VEICOLO GENERICO------");
		Veicolo veicoloGen = new Automobile("BMW", "M4", 2019, 4, 5);
		veicoloGen.mostraInfo(); //chiama nella sottoclasse
		veicoloGen.start(); //chiama nella sottoclasse
		veicoloGen.stop(); //chiama nella superclasse
		
		//Creo una motocicletta
		System.out.println("-----MOTOCICLETTA------");
		Motocicletta moto = new Motocicletta("Kawasaki", "z750", 2015, "naked");
		moto.mostraInfo();
		moto.start();
		moto.stop();
	}

}