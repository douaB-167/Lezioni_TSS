package giochini;

import java.util.Random;

public class Tombola {
	public static void Tombola() {
//		creazione primo array di dimensione 90
		int[] numeri = new int[90];
		for(int i = 0; i < numeri.length; i++) {
			numeri[i] = i + 1;
		}
//		for(int i : numeri) {
//			System.out.println(i);
//		}
//		creazione secondo array di dimensione 20 con numeri random da 1-90
		Random rand = new Random();
//		int numero = rand.nextInt(90); 
		int[] casuale = new int[20];
		for(int i = 0; i < casuale.length; i++) {
			casuale[i] = rand.nextInt(90);
		}
		for(int i : casuale) {
			System.out.println(i);
		}
//		controllo nel secondo array se ci sono valori duplicati
       for(int i = 0; i < casuale.length; i++) {
    	   for(int j = i + 1; j < casuale.length; j++) {
    		   if(casuale[i] == casuale[j]) {
    			   System.out.println("duplicato " + casuale[i]);
    		   }
    	   }
       }

	}

}
