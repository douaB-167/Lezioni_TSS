package lezione03_Metodi;

public class MetodiAusiliari {
	
	public static String cosaMiPassi(String qualcosa) {
		return qualcosa; //avere un return non vuol dire obbligo di un parametro 
	}
	
	public static void main(String[] args) {
		System.out.println(cosaMiPassi("Pollo"));
		
		String output = cosaMiPassi("Mondo");
		System.out.println(output);
	}

}
