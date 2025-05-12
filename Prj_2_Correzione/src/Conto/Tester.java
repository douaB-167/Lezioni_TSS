package Conto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Tester {
	
	/**
	 * JAVADOC
	 * @param Conto[] listaConti
	 * @param int numConto
	 * @return Conto
	 */
	public static Conto trovaConto(Conto[] listaConti, int numConto) {
		
		Conto contoTrovato = null;
		for(int i = 0; i < listaConti.length; i++) {
			if(listaConti[i] != null && listaConti[i].numConto == numConto) {
				contoTrovato = listaConti[i];
			}
		}
		return contoTrovato;
	}
	
	public static void main(String[] args) {
		
//		Date d = new Date(); //Questa data ci serve nel costruttore del conto
//		
//		Conto c1 = new Conto(1001, "Paolo Panini", d, 1250.0);
//		System.out.println(c1.stampaInfo());
//		c1.versamento(652);
//		
//		Conto c2 = new Conto(1002, "Anna Verdi", d, 110.40);
//		System.out.println(c2.stampaInfo());
//		c2.preleva(23);
		
		Date d = new Date();
		
		Conto[] contiCorrenti = new Conto[5];
		
//		ArrayList<Conto> contiCorrs = new ArrayList<Conto>();
//		contiCorrenti[0] = new Conto(1001, "Paolo Panini", d, 1250.0);
		
		Scanner input = new Scanner(System.in);
		char scelta;
		
		do {
			Menu.stampaMenu(); //é utiile che sia static
			
			scelta = input.next().toLowerCase().charAt(0);
			Conto mioConto = null;
			int numeroConto = 0;
			
			switch(scelta) {
				case '1': //apri conto
					//posso essere sicuro che il mio contatore parta da 0
					contiCorrenti[Conto.contatore] = new Conto(1001, "Laura Gialli", d, 120);
					break;
				case '2': //prelievo
					System.out.println("Forniscimi un numero di conto");
					numeroConto = input.nextInt();
					mioConto = trovaConto(contiCorrenti, numeroConto);
					mioConto.versamento(500);
					break;
				case '3': //versamento
					System.out.println("Forniscimi un numero di conto");
					numeroConto = input.nextInt();
					mioConto = trovaConto(contiCorrenti, numeroConto);
					mioConto.preleva(500);
					break;
				case '4':
					System.out.println(contiCorrenti[0].stampaInfo());
					break;
				case 'q':
					System.out.println("Stai uscendo dalla tua banca...");
					break;
				default:
					System.out.println("Scelta non valida");
					break;
			}
			
		}while(scelta != 'q');
		
	}

}
