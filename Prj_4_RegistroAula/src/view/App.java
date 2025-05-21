package view;

import java.util.Scanner;

import controller.RegistroCtrl;
import model.Menu;
import model.Studente;

public class App {
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		RegistroCtrl db = new RegistroCtrl();
//		db.caricaStudentiDaFile();
//		System.out.println("Stai stampando tutti gli studenti !!");
//		db.stampaStudentiRe();
		
		RegistroCtrl db = new RegistroCtrl();
		
		Scanner input = new Scanner(System.in);
		char scelta;
		
		do {
			Menu.stampaMenu();
			
			scelta = input.next().toLowerCase().charAt(0);
			
			int numeroMatricola = 0;
			
			switch(scelta) {
			case '1': 
				db.caricaStudentiDaFile();
				break;
			case '2':  //appello
				db.faiAppello();
				break;
			case '3': //assente
				db.stampaAssenti();
				break;
			case '4': //presente
				db.stampaPresenti();
				break;
			case '5': 
				break;
			case 'q':
				System.out.println("Stai uscendo dal tuo registro...");
				break;
			default:
				System.out.println("Scelta non valida");
				break;
			}
			
		}while(scelta != 'q');
	}

}
