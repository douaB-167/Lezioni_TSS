package lezione2_Statement;

import java.util.Scanner;

public class EsamiUniversita {
	public static void main(String[] args) {
		
		//Crea un programma per valutare gli esami all'universita
		//L'esame scritto fa da sbarramento per l'esame orale
		
		final int VOTO_MIN = 1;
		final int VOTO_MAX = 30;
		
		Scanner mioScann = new Scanner(System.in);
		System.out.println("Inserisci il voto del tuo esame scritto");
		
		int votoScritto = mioScann.nextInt();
		
		if(votoScritto >= VOTO_MIN && votoScritto <= VOTO_MAX) {
			if(votoScritto >= 18) {
				System.out.println("Voto scritto: " + votoScritto + ". Puoi sostenere l'esame orale");
				System.out.println("Inserisci il voto del tuo orale");
				int votoOrale = mioScann.nextInt();
				if(votoScritto >= VOTO_MIN && votoScritto <= VOTO_MAX) {
					if(votoOrale >= 18) {
						System.out.println("Voto orale: " + votoOrale);
						double votoFinale = Math.round((double) (votoScritto + votoOrale)/2);
						System.out.println("Voto finale: " + votoFinale);
					}else {
						System.out.println("Mi spiace, non hai superato l'esame orale quindi non hai superato l'esame!!");
					}
				}else {
					System.out.println("Voto orale inserito non valido");
				}
			} else {
				System.out.println("Mi spiace, non puoi sostenere l'esame");
			}
		} else {
			System.out.println("Voto scritto non valido");
		}
		
		//OPERATORE TERNARIO
		int a = 5;
		int b = 6;
		
		if (a == b) {
			System.out.println("I numeri sono uguali");
		}else {
			System.out.println("I numeri sono diversi");
		}
		
		String msg = (a == b)? "I numeri sono uguali": "I numeri sono diversi";
		System.out.println(msg);
		
	}
}
