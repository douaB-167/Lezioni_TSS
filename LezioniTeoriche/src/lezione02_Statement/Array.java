package lezione02_Statement;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
		//Array: contenitore di elementi simili tra loro dello stesso tipo. Prop principale: sono 0-based
		//Prop: gli array sono contenitori a lunghezza fissa
		
		String[] colori = new String[5];
		
		//Per ogni indice assegno un valore
		colori[0] = "Rosso";
		colori[1] = "Giallo";
		colori[2] = "Blu";
		colori[3] = "Rosa";
		colori[4] = "Verde";
		//colori[5] = "Nero"; //ATT: sto sfondando l'array
		
//		System.out.println(colori[0]);
//		System.out.println(colori[1]);
//		System.out.println(colori[2]);
//		System.out.println(colori[3]);
//		System.out.println(colori[4]);
		
		//Leggo, ciclo, stampo i valori dell'array utilizzando un ciclo for
		//length è una proprietà degli array
		System.out.println("Lunghezza dell'array " + colori.length);
		
		for (int i = 0; i < colori.length; i++) {
			System.out.println(colori[i]);
		}
		
		//Potrei utilizzare il metodo toString()
//		System.out.println(colori.toString());
		
		//Sintassi abbreviata
		int[] numCasuali = {5,7,9,4,8,1,3,2}; //non devo dichiarare attraverso new
		
		//ATT: che numero è il singolo elemento non è più un indice
		for(int numero:numCasuali) {
			System.out.println(numero);
		}
		
		//Creo un array con una dimensione inserita dall'utente
		
		Scanner input = new Scanner(System.in);
		//System.out.println("inserisci la dimensione dell'array");
		
		int dimArr = input.nextInt();
		int[] mioArr = new int[dimArr];
		int indice = 0;
		
		do {
			System.out.println("inserisci un intero");
			mioArr[indice] = input.nextInt();
			indice++;
		}while(mioArr.length > indice);
		
		for(int num : mioArr) {
			System.out.println(num);
		}
		
		
		//ordinare in modo crescente l'arrai di numeri casuali
		System.out.println("ORDINO ARRAY NUMERI CASUALI");
		Arrays.sort(numCasuali);
		
		for (int num: numCasuali) {
			System.out.println(num);
		}
		
		System.out.println(Arrays.toString(numCasuali));
		
		
	}
}
