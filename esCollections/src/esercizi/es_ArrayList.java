package esercizi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class es_ArrayList {
	public static void main(String[] args) {
	
		//creazione ArrayList
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//aggiunta degli element
		arrayList.add("Marco");
		arrayList.add("Edoardo");
		arrayList.add("Luca");
		arrayList.add("Paolo");
		arrayList.add("Massimo");
		arrayList.add("Pietro");
		arrayList.add("Giuseppe");
		arrayList.add("Matteo");
		arrayList.add("Silvio");
		arrayList.add("John");
		arrayList.add("Dario");
		arrayList.add("Andrea");
		
		//size(), restituisce il numero di elementi all'intenro dell'ArrayList
		System.out.println(arrayList.size());
		
		//copia dell'ArrayList iniziale dentro un altro
		ArrayList<String> copia = new ArrayList<>(arrayList);

		//mescola gli elementi
		
		
		//inverti tutti gli elementi
		
		//subList(fromIndex, toIndex), serve a copiare solo una porzione dell'ArrayList
		ArrayList<String> copia_porzione = new ArrayList<>(arrayList.subList(2, 8));
		System.out.println("La copia di una sola porzione avvenuta con successo");
		
		//inverti la posizione di due elementi
		
		//unisci due ArrayList
		
		//clone(), clona un ArrayList
		ArrayList<String> clone = (ArrayList<String>) arrayList.clone();
		System.out.println("Clonazione avvenuta con successo");
//		for (String string : clone) {
//			System.out.println(string);
//		}
		
		//clear(), svuota un ArrayList
//		arrayList.clear();
//		System.out.println("Tutti gli elementi sono stati rimossi correttamente");
//		
		//testing se l'array è vuolo 
		if(arrayList.isEmpty()) {
			System.out.println("Il tuo ArrayList è vuoto");
		} else {
			System.out.println("Il tuo ArrayList non è vuoto");
		}
		
		//incrementa la capacità dell'ArrayList
//		arrayList.ensureCapacity(arrayList.size()); è inutile con il size() dentro
		arrayList.ensureCapacity(12);
		System.out.println("Capacità aumentata con successo");
		
		//get(), restituisce tutti gli elementi alla posizione specificata
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(i+1 + ". " + arrayList.get(i));
		}
	}
}  
