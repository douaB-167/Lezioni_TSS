package ContoCorrente;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NuovoConto {
	
	public void NuovoConto() {
//		creazione istanza ContoCorrente
		ContoCorrente conto = new ContoCorrente();
		
		
		Scanner mioScann = new Scanner(System.in);
		char scelta;
		
//		incremento il contatore di 1 perchè ho un nuovo cliente
		conto.contatore++;
		
//		richiesta nome titolare
		Scanner nomeCompleto1 = new Scanner(System.in);
		System.out.print("Inserisci il tuo nome completo separato da uno spazio --> ");
		conto.titolare = nomeCompleto1.nextLine();
		
//		controllo se l'utente deposita la cifra minima consentita correttamente
//		il do{..}while viene ripetuto fino a che non si deposita un valore >= a 50
		do {
//			richiesta deposito minimo
			Scanner deposito = new Scanner(System.in);
			System.out.print("Per aprire il conto devi depositare un minimo di 50€ \nQuanto voui versare? --> ");
			conto.saldo = deposito.nextDouble();
			
			if(conto.saldo < 50) {
				System.out.println("Mi dispiace ma devi depositare di più della cifra che hai depositato");
			}
		}while(conto.saldo < 50);	
		
		System.out.println("Hai depositato " + conto.saldo + "€");
		
//		assegnazione alla variabile dataApertura un valore 
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String car_date = sdf.format(date);
//		conto1.dataApertura = (Date) car_date;
		conto.dataApertura = date;
		
//		asssegnazione numero conto
		int numero_conto = 1000;
		conto.numConto = numero_conto;
		
//		for(int i = 1000; i < 10000 ; i++) {
//			conto.numConto = i;
//		}
		
//		richiesta al titolare se vuoi effettuare dei movimenti
		Scanner movimenti = new Scanner(System.in);
		System.out.print("Vuoi effettuare dei movimenti? [s/n] --> ");
		char mov = movimenti.next().toLowerCase().charAt(0);
		
//		switch 2
		switch(mov) {
//		case 2.1
			case 'y':
			case 's':
				do {
					System.out.println("---------- MENU ----------");
					System.out.println("1. Prelievo");
					System.out.println("2. Versamento");
					System.out.println("3. Stampa scontrino");
					System.out.println("4. Esci");
					System.out.println("----------");
					
					System.out.print("Fai la tua scelta --> ");
					scelta = mioScann.next().charAt(0);
					
					switch(scelta) {
						case '1':
//							richiesta della cifra che si vuole prelevare
							Scanner prelievo = new Scanner(System.in);
							System.out.print("Inserisci la cifra che vorresti prelevare: --> ");
							double prel = prelievo.nextDouble();
							System.out.println("La cifra che hai prelevato è : " + prel + "€");
//							richiamo del metodo previevo() in modo tale che il saldo si aggiorni 
							conto.prelievo(prel);
							break;
						case '2':
//							richiesta della cifra che si vuole versare
							Scanner versamento = new Scanner(System.in);
							System.out.print("Inserisci la cifra che vorresti versare: --> ");
							double vers = versamento.nextDouble();
							System.out.println("La cifra che hai versato è : " + vers + "€");
//							richiamo del metodo versamento() in modo tale che il saldo si aggiorni 
							conto.versamento(vers);
							break;
						case '3':
//							richiamo del metodo stampaInfo per stampare lo scontrino finale 
							System.out.println(conto.stampaInfo(conto.titolare, conto.numConto, conto.saldo));
							break;
						case '4':
							System.out.println("Stai uscendo dal tuo conto...");
							break;
							
						default:
							System.out.println("Scusa non capisco questo comando");
							break;
					}
				}while(scelta != '4');
				break;
//			case 2.2
			case 'n':
				System.out.println(conto.titolare + " il tuo conto è stato creato correttamente, il tuo numero conto è " + conto.numConto + " con saldo " + conto.saldo + "€ in data " + car_date);
				break;
				
			default:
				System.out.println("Scusa non capisco questo comando");
				break;
		}
	}
}
