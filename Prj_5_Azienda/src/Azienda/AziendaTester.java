package Azienda;

public class AziendaTester {

	public static void main(String[] args) {
		
		RegistroAziendale registroAziendale = new RegistroAziendale();
		
		//MANAGER --> POLIMORFISMO	
		Dipendente manager1 = new Manager(Ruoli.Manager, "Doua", "Boufqir");
		
		//HR --> POLIMORFISMO	
		Dipendente hr1 = new HR(Ruoli.HR, "Mario", "Longi");
		
		//PROGRAMMATORE --> POLIMORFISMO	
		Dipendente programmatore1 = new Programmatore(Ruoli.Programmatore, "Edoardo", "Rossi");
		
		//SEGRETARIO --> POLIMORFISMO	
		Segretario segretario1 = new Segretario(Ruoli.Segretario, "Mario", "Bianchi");
		
		registroAziendale.aggiungiDipendente(manager1);
		registroAziendale.aggiungiDipendente(hr1);
		registroAziendale.aggiungiDipendente(programmatore1);
		registroAziendale.aggiungiDipendente(segretario1);
		
		registroAziendale.stampaDipendenti();
		registroAziendale.stampaRuolo(Ruoli.Manager);
		
		System.out.println("Stipendio: " + manager1.calcolaStipendio());
		manager1.mostraInfo();
		
		System.out.println("Stipendio: " + hr1.calcolaStipendio());
		hr1.mostraInfo();
		
		System.out.println("Stipendio: " + programmatore1.calcolaStipendio());
		programmatore1.mostraInfo();
		
		System.out.println("Stipendio: " + segretario1.calcolaStipendio());
		segretario1.mostraInfo();
		
	}
}
