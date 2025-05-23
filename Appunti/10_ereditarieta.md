# Ereditarietà in Java
L'ereditarietà è uno dei concetti fondamentali della programmazione orientata agli oggetti in Java

## Cos'è l'ereditarietà?
L'ereditarietà permette di creare una nuova classe (sottoclasse) basata su una classe esistente (superclasse). La sottoclasse eredita tutti i membri (campi e metodi) della superclasse e può:
 * Aggungere nuovi campi e metodi;
 * Sovrascrivere i metodi esistenti;
 * Utilizzare i membri ereditati.
In Java, l'ereditarietà si implementa usando la parola chiave ```java extends ```.

## Caratteristiche dell'ereditarietà in Java
 * **Ereditarietà singola**: Java supporta solo l'ereditarietà singola (una classe può estendere **SOLO** una superclasse);
 * **Modificatore ```java protected```**: Permette l'accesso ai membri della superclasse dalle sottoclassi;
 * **Parola chiave ```java super ```**: Permette di chiamare metodi della superclasse dalla sottoclasse;
 * **Classe Object**: Tutte le classi in Java derivano implicitamente dalla classe ```java Object```;
 * **Polimorfismo**: Un riferimento di tipo superclasse può puntare a oggetti delle sottoclassi.

## Vantaggi dell'ereditarietà
 * **Riutilizzo del codice**: Evita la duplicazione di codice;
 * **Estensibilità**: Facilita l'aggiunta di nuove funzionalità;
 * **Gerarchia di classi**: Crea una struttura logica e organizzata;
 * **Manutenibilità**: Rende il codice più modulare e facile da mantenere

## Considerazioni pratiche
 * Non abusare dell'ereditarietà; a volte la composizione è preferibile;
 * Progettare attentamente la gerarchia delle classi fin dall'inizio;
 * Considerare l'utilizzo di classi astratte e interfacce per definire contratti più flessibili;
 * Ricordare il principio "is-a": una sottoclasse dovrebbe sempre essere un tipo della sua superclasse

#### esempio 
```java
public class Veicolo {

	//campi dichiarati protected fanno si che queste prop vengano viste solo dalla classe e da chi eredita
	protected String marca;
	protected String modello;
	protected int annoProd;
	protected int numRuote;

	//costruttore
	public Veicolo(String marca, String modello, int annoProd, int numRuote) {
		this.marca = marca;
		this.modello = modello;
		this.annoProd = annoProd;
		this.numRuote = numRuote;
	}
	
	//metodi
	public void start() {
		System.out.println("Hai avviato il veicolo");
	}
	
	public void stop() {
		System.out.println("Hai fermato il veicolo");
	}
	
	public void mostraInfo() {
		System.out.println("Veicolo: " + this.marca + " " + this.modello + "(anno: " + this.annoProd + ")" + " numero ruote: " + this.numRuote);
	}

}
//Per mettere in atto l'ereditarietà uso la parola chiave extends
public class Automobile extends Veicolo{

	//porp aggiuntiva che specializza il mio Veicolo Automobile
	private int numPorte;
	
	public Automobile(String marca, String modello, int annoProd, int numRuote, int numPorte) {
		//super chiama il costruttore della superclasse, di Veicolo
		super(marca, modello, annoProd, numRuote);
		this.numPorte = numPorte;
	}
	
	public void accendiAC() {
		System.out.println("Sto accendendo AC della mia Automobile");
	}
	
	//sovrascrivo i metodi della mia superclasse, non è obbligatorio
	@Override
	public void start() {
		System.out.println("Hai messo in moto la tua Automobile");
	}
	
	//Non sovrascrivo lo stop
	
	//Sovrascrivo il metodo mostraInfo() aggiungendo un pezzo
	@Override
	public void mostraInfo() {
		super.mostraInfo(); //stamperà entrambi i syso
		System.out.println("Numero porte: " + this.numPorte);
	}

}
```