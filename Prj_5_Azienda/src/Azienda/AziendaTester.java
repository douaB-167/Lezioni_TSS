package Azienda;

public class AziendaTester {

	public static void main(String[] args) {
		
		//MANAGER --> POLIMORFISMO	
		RegistroAziendale mioRegistroM = new Manager(Ruoli.Manager, "Matteo", "Rossi");
		System.out.println("Ruolo: " + Ruoli.Manager +  "\t\tStipendio: " + mioRegistroM.calcolaStipendio() + "€");
		mioRegistroM.stampaAlRuolo();
		
		//HR --> POLIMORFISMO	
		RegistroAziendale mioRegistroH = new HR(Ruoli.HR, "Edoardo", "Mardi");
		System.out.println("Ruolo: " + Ruoli.HR +  "\t\tStipendio: " + mioRegistroH.calcolaStipendio() + "€");
		mioRegistroH.stampaAlRuolo();
		
		//PROGRAMMATORE --> POLIMORFISMO	
		RegistroAziendale mioRegistroP = new Programmatore(Ruoli.Programmatore, "Maria", "Longo");
		System.out.println("Ruolo: " + Ruoli.Programmatore +  "\tStipendio: " + mioRegistroP.calcolaStipendio() + "€");
		mioRegistroP.stampaAlRuolo();
		
		//SEGRETARIO --> POLIMORFISMO	
		RegistroAziendale mioRegistroS = new Segretario(Ruoli.Segretario, "Luca", "Colli");
		System.out.println("Ruolo: " + Ruoli.Segretario +  "\tStipendio: " + mioRegistroS.calcolaStipendio() + "€");
		mioRegistroS.stampaAlRuolo();
		
		//DIPENDENTE --> POLIMORFISMO	
		RegistroAziendale mioRegistroD = new Dipendente(Ruoli.Dipendente, "Doua", "Boufqir");
		System.out.println("Ruolo: " + Ruoli.Dipendente +  "\tStipendio: " + mioRegistroD.calcolaStipendio() + "€");
		mioRegistroD.stampaAlRuolo();
//		mioRegistroD.stampaDipendenti();
		
	}
}
