package lezione2_Statement;

public class If_Statement {
	
	public static void main(String[] args) {
		
		/**
		 * SINTASSI
		 * if(condition){
		 * 		...eseguo se TRUE
		 * }
		 * 
		 * else if(altraCondizione) [OPZIONALE]{
		 * 		...eseguo se TRUE
		 * }
		 * 
		 * else [OPZIONALE]{
		 * 		...eseguo se tutto il resto è FALSE
		 * }
		 */
		boolean piove = true;
		if(piove) {
			System.out.println("porto l'ombrello");
		}
		//else non è obbligatorio
		else {
			System.out.println("non porto l'ombrello");
		}
		
		
		///esempio
		int miaEta = 20;
		
		if(miaEta >= 18) {
			System.out.println("Benvenuto, puoi entrare");
		} else if (miaEta < 10) {
			System.out.println("Devi essere accompagnato dai genitori");
		}else {
			System.out.println("Mi spiace, non puoi entrare");
		}
		
		///
	}
}
