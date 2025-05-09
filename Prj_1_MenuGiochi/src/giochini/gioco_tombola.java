package giochini;

import java.util.Arrays;
import java.util.Random;

public class gioco_tombola {
	
	public static void main(String[] args) {
		estrazione();
		estrazione2();
		estrazione3(20);
	}
	
	public static void estrazione() {
//		Random numR = new Random();
//		System.out.println(numR.nextInt(90));
		
		int[] numEstratti = new int[20];
		
		for(int i = 0; i < 20; i++) {
			Random numR = new Random();
			numEstratti[i] = numR.nextInt(1, 91);
			
			
			for(int j = 0; j < i; j++) {
				if(numEstratti[j] == numEstratti[i]) {
					i--;
				}
			}
		}
		System.out.println("Estrazione 1:");
		System.out.println(Arrays.toString(numEstratti));
		
		
	}
	
	public static void estrazione2() {
		Random generator = new Random();
		
		int[] numEstratti = new int[20];
		
		for(int i = 0; i <numEstratti.length; i++) {
			int numEstratto;
			boolean estratto;
			
			do {
				numEstratto = generator.nextInt(90)+1;
				estratto = false;
				for(int j = 0; j < i; j++) {
					if(numEstratti[j] == numEstratto) {
						estratto = true;
						break;
					}
				}
			}while(estratto);
			numEstratti[i] = numEstratto;
		}
		System.out.println("Estrazione 2:");
		System.out.println(Arrays.toString(numEstratti));
	}
	
	public static void estrazione3(int dimensione) {
		int[] numEstratti = new int[dimensione];
		Random rand = new Random();
		
		int contatore = 0;
		int tentativi = 0;
		
		while(contatore < dimensione) {
			int numEstratto = rand.nextInt(90) + 1;
			
			boolean presente = false;
			
			for(int i = 0; i < contatore; i++) {
				if(numEstratti[i] == numEstratto) {
					presente = true;
					tentativi++;
					break;
				}
			}
			
			if(!presente) {
				numEstratti[contatore] = numEstratto;
				contatore++;
			}
					
		}
		System.out.println("Estrazione 3:");
		System.out.println(Arrays.toString(numEstratti));
		System.out.println("Tentativi: " + tentativi);
	}

}
