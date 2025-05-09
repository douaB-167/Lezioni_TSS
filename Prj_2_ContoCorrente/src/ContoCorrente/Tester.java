package ContoCorrente;

import java.util.Scanner;

public class Tester {
	
	public static void main(String[] args) {
		
		ContoCorrente conto1 = new ContoCorrente();
		Scanner mioScann = new Scanner(System.in);
		char scelta;
		
		Scanner nomeCognome = new Scanner(System.in);
		System.out.print("Buongiorno, inserisci il tuo nome e cognome, separati dallo spazio --> ");
		String[] nome = nomeCognome.nextLine().split(" ");
		//System.out.println(nome[0]);
		
		
		
		
		
		
//		do {
//			System.out.println("---------- MENU ----------");
//			System.out.println("1. Prelievo");
//			System.out.println("2. Versamento");
//			System.out.println("3. Esci");
//			System.out.println("----------");
//			
//			System.out.print("Fai la tua scelta --> ");
//			scelta = mioScann.next().charAt(0);
//			
//			switch(scelta) {
//			case '1':
//				
//				break;
//			case '2':
//				break;
//			case '3':
//				System.out.println("Stai uscendo dal tuo conto...");
//				break;
//					
//			default:
//				System.out.println("Scusa non capisco questo comando");
//				break;
//			}
//			
//			System.out.println(conto1.toString());
//			System.out.println(conto1.stampaInfo());
//		}while(scelta != 3);
	}

}
