package ContoCorrente;

import java.util.Scanner;

public class DisposizioneConto {
	
	public void DisposizioneConto(){
//		creazione istanza ContoCorrente
		ContoCorrente conto = new ContoCorrente();
		
		
		Scanner mioScann = new Scanner(System.in);
		char scelta;
		
		char dis;
		do{
			Scanner disposizione_conto = new Scanner(System.in); 
			System.out.print("Hai già un conto? [s/n] --> ");
			dis = disposizione_conto.next().toLowerCase().charAt(0);
			if(dis != 's' && dis != 'y' && dis != 'n') {
				System.out.println("Scusa non capisco questo comando");
			}
		}while(dis != 's' && dis != 'y' && dis != 'n');
		
//		switch 3
		switch(dis) {
//		case 3.1
			case 'y':
			case 's':
//				richiesta del nome del titolare 
				Scanner nomeCompleto2 = new Scanner(System.in);
				System.out.print("Ciao bentornato, inserisci il tuo nome completo separato da uno spazio --> ");
				conto.titolare = nomeCompleto2.nextLine();
				
//				richiamo al metodo del numero del conto del titolare
				conto.numeraConto();
				
//				visualizzazione del menù per la scelta dell'operazione che si vuole eseguire
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
//							richiesta della cifra che si vuole prelevare
							Scanner prelievo = new Scanner(System.in);
							System.out.print("Inserisci la cifra che vorresti prelevare: --> ");
							double prel = prelievo.nextDouble();
							System.out.println("La cifra che hai prelevato è : " + prel + "€");
//							richiamo del metodo prelievo() in modo tale che il saldo si aggiorni
							conto.prelievo(prel);
							break;
						case '2':
//							richiesta della cifra che si vuole versare
							Scanner versamento = new Scanner(System.in);
							System.out.print("Inserisci la cifra che vorresti versare: --> ");
							double vers = versamento.nextDouble();
							System.out.println("La cifra che hai versato è : " + vers + "€");
//							richiamo del metodo mersamento() in mdo otale che il saldo si aggiorni
							conto.versamento(vers);
							break;
						case '3':
//							richiesta dei dati per effettuare il bonifico correttamente
//							dati beneficiario
							Scanner beneficiario = new Scanner(System.in);
							System.out.print("Inserisci i dati del beneficiario --> ");
							String ben = beneficiario.nextLine();
//							dati iban
							Scanner iban = new Scanner(System.in);
							String ib;
//							controllo che l'iban sia della lunghezza giusta ossia 27 caratteri
							do {
								System.out.print("Inserisci l'iban del beneficiario --> ");
								ib = iban.next();
								if (ib.length() != 27) {
									System.out.print("Iban del beneficiario errato! \nReinseriscilo --> ");
									iban = new Scanner(System.in);
									ib = iban.next();
								}
							}while(ib.length() != 27);
//							richiesta dell'importo del bonifico
							Scanner importo = new Scanner(System.in);
							System.out.print("Inserisci l'importo del bonifico --> ");
							double im = importo.nextDouble();
//							stampa dei dati inseriti per effettuare il bonifico 
							System.out.println("Il tuo bonifico al beneficiario " + ben + " numero iban " + ib + " con importo " + im + "€ è stato inviato correttamente da " + conto.titolare + " numero conto " + conto.numConto);
//							richiamo della variabile prelievo() per aggiornare il saldo 
							conto.prelievo(im);
							break;
						case '4':
//							richiamo del metodo stampaInfo() in modo tale da visualizzare lo scontrino finale 
							System.out.println(conto.stampaInfo(conto.titolare, conto.numConto, conto.saldo));
							break;
						case '5':
							System.out.println("Stai uscendo dal tuo conto...");
							break;
					}
					
				}while(scelta != '5');
				break;
//		case 3.2
			case 'n':
				System.out.println("Non hai effettuato nessuna operazione, buona giornata.");
				break;
				
			default: 
				System.out.println("Scusa non capisco questo comando");
				break;
		}
	}

}
