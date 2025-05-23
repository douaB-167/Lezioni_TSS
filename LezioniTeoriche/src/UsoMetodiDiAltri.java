import lezione03_Metodi.Calcolatrice0;
import lezione03_Metodi.MetodiAusiliari;

public class UsoMetodiDiAltri {
	public static void main(String[] args) {
		//questa è programmazione funzionale 
		//A oatto che sia pubic io posso utilizzare un metodo static di un'altra classe
		String qualcosa = MetodiAusiliari.cosaMiPassi("Qualcosa ti passerò");
		System.out.println(qualcosa);
		
		double somma = Calcolatrice0.addizone(5.2, 8.9);
		System.out.println("Il valore della somma è " + somma);
	}

}
