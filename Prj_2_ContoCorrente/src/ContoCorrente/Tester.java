package ContoCorrente;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Tester {
	
	public static void main(String[] args) {
		
//		dichiaro qua la variabile ric perchè se la dichiarassi all'interno del do{..}while non potrà essere visualizzata neanche dal while visto ch
		char ric;

		do {
//			dichiaro qua l'input perchè sennò il messaggio di errore verrà stampaato in loop
//			richiesta se vuole apprire un conto oppure se ne ha già uno
			Scanner richiesta = new Scanner(System.in);
			System.out.print("Buongiorno, vuoi aprire un nuovo conto? [s/n] --> ");
			ric = richiesta.next().toLowerCase().charAt(0);
			
	//		switch 1
			switch(ric) {
	//		case 1.1
				case 'y':
				case 's':
	//				richiamo della classe NuovoConto
					NuovoConto nconto = new NuovoConto();
					nconto.NuovoConto();
					break;
	//		case 1.2
				case 'n':
	//				richiamo della classe DisposizioneConto
					DisposizioneConto dconto = new DisposizioneConto();
					dconto.DisposizioneConto();
					break;
					
				default:
					System.out.println("Scusa non capisco questo comando");
					break;
			}
		}while(ric != 's' && ric != 'n');
	}

}
