package lezione7_Composizione;

public class Main {
	
	public static void main(String[] args) {
		
		Casa miaCasa = new Casa("Via Carlo Alberto 22");
		miaCasa.aggiugngiStanza(new Stanza("Studio", 12));
		miaCasa.aggiugngiStanza(new Stanza("Cucina", 20));
		miaCasa.aggiugngiStanza(new Stanza("Bagno", 8));
		miaCasa.aggiugngiStanza(new Stanza("Camera da letto", 25));
		
		miaCasa.visualizzaStanze();
		
		//Prop size() degli Arraylist
		System.out.println("Nella mia casa ci sono: " + miaCasa.stanze.size());
	}

}
