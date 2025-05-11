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
		
		char mov;
		do {
//			richiesta al titolare se vuoi effettuare dei movimenti
			Scanner movimenti = new Scanner(System.in);
			System.out.print("Vuoi effettuare dei movimenti? [s/n] --> ");
			mov = movimenti.next().toLowerCase().charAt(0);
			if(mov != 's' && mov != 'y' && mov != 'n') {
				System.out.println("Scusa non capisco questo comando");
			}
		}while(mov != 's' && mov != 'y' && mov != 'n');
		
//		switch 2
		switch(mov) {
//			case 2.1
			case 'y':
			case 's':
				do {
					System.out.println("---------- MENU ----------");
					System.out.println("1. Prelievo");
					System.out.println("2. Versamento");
					System.out.println("3. Bonifico");
					System.out.println("4. Stampa scontrino");
					System.out.println("5. Esci");
					System.out.println("----------");
					
					System.out.print("Fai la tua scelta --> ");
					scelta = mioScann.next().charAt(0);
					
					switch(scelta) {
						case '1':
//								richiesta della cifra che si vuole prelevare
							Scanner prelievo = new Scanner(System.in);
							System.out.print("Inserisci la cifra che vorresti prelevare: --> ");
							double prel = prelievo.nextDouble();
							System.out.println("La cifra che hai prelevato è : " + prel + "€");
//								richiamo del metodo previevo() in modo tale che il saldo si aggiorni 
							conto.prelievo(prel);
							break;
						case '2':
//								richiesta della cifra che si vuole versare
							Scanner versamento = new Scanner(System.in);
							System.out.print("Inserisci la cifra che vorresti versare: --> ");
							double vers = versamento.nextDouble();
							System.out.println("La cifra che hai versato è : " + vers + "€");
//								richiamo del metodo versamento() in modo tale che il saldo si aggiorni 
							conto.versamento(vers);
						case '3':
//								richiesta dei dati per effettuare il bonifico correttamente
//								dati beneficiario
							Scanner beneficiario = new Scanner(System.in);
							System.out.print("Inserisci i dati del beneficiario --> ");
							String ben = beneficiario.nextLine();
//								dati iban
							Scanner iban = new Scanner(System.in);
							String ib;
//								controllo che l'iban sia della lunghezza giusta ossia 27 caratteri
							do {
								System.out.print("Inserisci l'iban del beneficiario --> ");
								ib = iban.next();
								if (ib.length() != 27) {
									System.out.print("Iban del beneficiario errato! \nReinseriscilo --> ");
									iban = new Scanner(System.in);
									ib = iban.next();
								}
							}while(ib.length() != 27);
//								richiesta dell'importo del bonifico
							Scanner importo = new Scanner(System.in);
							double im;
							do{
								System.out.println("L'importo del bonifico deve essere >= 50");
								System.out.print("Inserisci l'importo del bonifico --> ");
								im = importo.nextDouble();
								if(im < 50){
									System.out.println("L'importo del bonifico deve essere >= 50");
									System.out.print("Inserisci l'importo del bonifico --> ");
									im = importo.nextDouble();
								}
							}while(im < 50);
//								stampa dei dati inseriti per effettuare il bonifico 
							System.out.println("Il tuo bonifico al beneficiario " + ben + " numero iban " + ib + " con importo " + im + "€ è stato inviato correttamente da " + conto.titolare + " numero conto " + conto.numConto);
//								richiamo della variabile prelievo() per aggiornare il saldo 
							conto.prelievo(im);
							break;
						case '4':
//								richiamo del metodo stampaInfo per stampare lo scontrino finale 
							System.out.println(conto.stampaInfo(conto.titolare, conto.numConto, conto.saldo));
							break;
						case '5':
							System.out.println("Stai uscendo dal tuo conto...");
							break;
					}
				}while(scelta != '5');
				break;
//				case 2.2
			case 'n':
				System.out.println(conto.titolare + " il tuo conto è stato creato correttamente, il tuo numero conto è " + conto.numConto + " con saldo " + conto.saldo + "€ in data " + car_date);
				break;
				
			default:
				System.out.println("Scusa non capisco questo comando");
				break;
		}
	}
}
