package lezione2_Statement;

import java.util.Scanner;

public class While_Statement {
	public static void main(String[] args) {
		//WHILe: cicli indefiniti
		//while(condition){
		//	...esegui se condizione è TRUE
		// }
		
		//Esempio. replico un for con un while
		int i = 0;
		
		while(i < 10) {
			System.out.println("Ciao " + i);
			i++;
		}
		
		System.out.println("DO_WHILE");
		//prima eseguo qualcosa poi lo controllo. Almeno una volta faccio l'operazione
		int d = 10;
		
		do {
			int risultato = d * 5;
			System.out.println("5 x " + d + " = " + risultato);
			d++;
		}while(d <= 10);
		
		//Esemio concreto
		Scanner scan = new Scanner(System.in);
		
		String parola = "";
		int tentativi = 0;
		
		while(!parola.equals("ciaobello")){
			tentativi++;
			System.out.println("Parola d'ordine errata");
			parola = scan.nextLine();
		}
		
		System.out.println("Benvenuto");
		System.out.println("Per entrare hai impiegato " + tentativi + " tentativi");
		
		
		
	}
}
