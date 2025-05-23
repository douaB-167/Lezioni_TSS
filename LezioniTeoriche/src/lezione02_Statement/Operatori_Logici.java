package lezione02_Statement;

public class Operatori_Logici {
	public static void main(String[] args) {
		
		//Gli operatori logici mi permettono di espandere le condizioni, quindi di valutare più cose ctrl + shift + y 
		/**
		 * && AND 
		 * || OR
		 *  ! NOT 
		 */
		
		//Esempio trimestri dell'anno
		int mese_attuale = 5;
		
		if(mese_attuale >= 1 && mese_attuale <= 3) {
			System.out.println("Siamo nel primo trimestre");
		}else if(mese_attuale >= 4 && mese_attuale <= 6) {
			System.out.println("Siamo nel secondo trimestre");
		}else if(mese_attuale >= 7 && mese_attuale <= 9) {
			System.out.println("Siamo nel terzo trimestre");
		}else if(mese_attuale >= 10 && mese_attuale <= 12) {
			System.out.println("Siamo nel quarto trimestre");
		}else {
			System.out.println("Valore non riconosciuto");
		}
		
		//Esempio festa. Per entrare alla festa devo avere un invito ed essere maggiorenne
		
		boolean invito = true;
		int miaEta = 20;
		
		if(invito && miaEta >= 18) {
			System.out.println("Benvenuto, puoi entrare");
		} else if(miaEta < 18 && invito) {
			System.out.println("Mi spiace, non hai l'età per entrare, pur avendo l'invito");
		} else if (miaEta >= 18 && !invito) {
			System.out.println("Mi spiace, hai l'età giusta ma non hai l'invito");
		} else {
			System.out.println("Non puoi entrare, non hai l'età giusta nè l'invito");
		}
		
		//Esempio esame uviversità. Professore buono. Ti metto un voto anche con un solo esame superato tra scritto e orale. Il voto finale sarà il maggiore
		
		int scritto = 25;
		int orale = 27;
		
		if(scritto >= 18 || orale >= 18) {
			System.out.println("Complimenti hau superato l'esame");
		} else {
			System.out.println("Mi spiace, non hai superato l'esame");
		}
		
		
		
	}
}
