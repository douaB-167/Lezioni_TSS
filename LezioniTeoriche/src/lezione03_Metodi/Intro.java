package lezione03_Metodi;

import java.util.Scanner;

public class Intro {
//		Metodo: termine legato alla OOP
//		servono a wrappare codice, mettere codice sotto un unico nome
//		Permottono di scomporre un problema in sottoproblemi.
//		Re-use del codice 
	
	/**
	 * 	SINTASSI
	 * 	(-------------------------firma del metodo-------------------------------) quando ci sono parametri: firma piena, quando non ci sono parametri firma vuota
	 * 	(modificatori) (tipo restituito) (nome del metodo) (argomenti o parametri) (body del metodo) OPZIONALE all'interno del body
	 * 	public static		void				main			(string[] args) 		{...}		 return qualcosa; (il return restituisce qualcosa)
	 * 	public modificare d'accesso, il metodo appartiene alla classe e non all'istanza
	 * 	il metodo dichiarato static appartiene solo alla classe e non all'istanza, appartengono alla classe in cui io li dichiaro
	 * 	void non restituisce nulla
	 */
	public static void main(String[] args) { //array di stringhe con nome args
		System.out.println("Ciao dal metodo main");
		
		//Richiamo salutaUser()
		//Uso la logica funzionale poichè ho indipendenza tra dichiarazione e richiamo del metodo
		salutaUser();
		
		//Al metodo sotto devo passare un argomento, un parametro o più 
		salutaDocente("Pierluigi", "Pierantola", 61);
		salutaDocente("Pippo", "Rossi");
		salutaDocente("Anna Lanzullo");
		salutaDocente();
		
		String[] mioProfs = {"Laura Verdi", "Luca Gialli", "Andrea Andreoni", "Marco Marca"};
		for ( String nomeCogn : mioProfs) {
			salutaDocente(nomeCogn);
		}
		
	}
//	QUESTO E' UN METODO
//	STATIC PERCHè LO DEVO USARE QUA DENTRO
	public static void salutaUser() {
		//Dentro il metodo la logica sarà sempre imperativo/procedurale
		System.out.println("Ciao, Doua! ");
		System.out.println("Qual è il tuo cognome? ");
		Scanner in = new Scanner(System.in);
		
		System.out.println("Allora ciao, Doua " + in.nextLine());
	}
	
	public static void salutaDocente(String nomeDoc, String cognomeDoc) {
		System.out.println("Buongiono docente " + nomeDoc + " " + cognomeDoc); //programmazione per contratto
		//Non sono obbligato a usare etaDoc
	}
	
	//OVERLOADING: sovraccarico del metodo per poter avere più o meno dei parametri
	public static void salutaDocente(String nomeDoc, String cognomeDoc, int etaDoc) {
		System.out.println("Esimio docente " + nomeDoc + " " + cognomeDoc + ". Adesso so anche quanti anni ha!!");
		int etaPensione = 65;
		int anniRestanti = etaPensione - etaDoc;
		System.out.println("Le mancano " + anniRestanti + " alla pensione");
	}
	
	public static void salutaDocente(String nomeCognome) {
		System.out.println("Buongirono docente " + nomeCognome);
	}
	
	public static void salutaDocente() {
		System.out.println("Buongiorno docente");
	}

}
