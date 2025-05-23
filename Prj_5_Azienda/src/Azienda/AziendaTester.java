package Azienda;

public class AziendaTester {

	public static void main(String[] args) {
		
		//MANAGER --> POLIMORFISMO	
		RegistroAziendale mioRegistroM = new Manager(Ruoli.Manager, "Matteo", "Rossi", 52);
		System.out.println("Ruolo: " + Ruoli.Manager +  "\t\tStipendio: " + mioRegistroM.calcolaStipendio() + "€" + "\t NumBadge: " + mioRegistroM.calcolaBadge());
		
		//HR --> POLIMORFISMO	
		RegistroAziendale mioRegistroH = new HR(Ruoli.HR, "Edoardo", "Mardi", 45);
		System.out.println("Ruolo: " + Ruoli.HR +  "\t\tStipendio: " + mioRegistroH.calcolaStipendio() + "€" + "\t NumBadge: " + mioRegistroH.calcolaBadge());
		
		//PROGRAMMATORE --> POLIMORFISMO	
		RegistroAziendale mioRegistroP = new Programmatore(Ruoli.Programmatore, "Maria", "Longo", 38);
		System.out.println("Ruolo: " + Ruoli.Programmatore +  "\tStipendio: " + mioRegistroP.calcolaStipendio() + "€" + "\t NumBadge: " + mioRegistroP.calcolaBadge());
		
		//SEGRETARIO --> POLIMORFISMO	
		RegistroAziendale mioRegistroS = new Segretario(Ruoli.Segretario, "Luca", "Colli", 35);
		System.out.println("Ruolo: " + Ruoli.Segretario +  "\tStipendio: " + mioRegistroS.calcolaStipendio() + "€" + "\t NumBadge: " + mioRegistroS.calcolaBadge());
		
		//DIPENDENTE --> POLIMORFISMO	
		RegistroAziendale mioRegistroD = new Dipendente(Ruoli.Dipendente, "Doua", "Boufqir", 29);
		System.out.println("Ruolo: " + Ruoli.Dipendente +  "\tStipendio: " + mioRegistroD.calcolaStipendio() + "€" + "\t NumBadge: " + mioRegistroD.calcolaBadge());
//		mioRegistroD.stampaDipendenti();
		
	}
}
