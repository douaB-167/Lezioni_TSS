package view;

import controller.RegistroCtrl;
import model.Registro;
import model.Studente;

public class App {
	
	public static void main(String[] args) {
		
//		Studente mioStud = new Studente("Doua", "Boufqir", "TSS", 2);
//		System.out.println(mioStud.getToken());
		
		Registro tss2025 = new Registro("TSS 2025");
		RegistroCtrl regstr = new RegistroCtrl(tss2025);
		regstr.caricaStudentiDaFile();
		regstr.faiAppello();
		
		Studente nuovoStud = new Studente("Pier", "Pier", "TSS", 15);
		regstr.aggiungiStudenteSuFile(nuovoStud, "./elencoStudenti_TSS.csv");
	}

}
