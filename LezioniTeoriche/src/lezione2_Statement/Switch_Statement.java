package lezione2_Statement;

public class Switch_Statement {
	public static void main(String[] args) {
		
		//Switch, mi permette di valutare, in base ai casi, il valore di una variabile
		
		int giornoSettimana = 2;
		
		switch(giornoSettimana) {
		case 1:
			System.out.println("Lunedì");
			break;
		case 2:
			System.out.println("Martedì");
			break;
		case 3:
			System.out.println("Mercoledì");
			break;
		case 4:
			System.out.println("Giovedì");
			break;
		case 5:
			System.out.println("Venerdì");
			break;
		case 6:
			System.out.println("Sabato");
			break;
		case 7:
			System.out.println("Domenica");
			break;
		default: 
			System.out.println("Non riconosco questo valore");
			break;
		}
		
		
		
	}

}
