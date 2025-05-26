package lezione12_Interfacce;

public class TesterForme {
	
	public static void main(String[] args) {
		
		FormaCalcolabile.benvenuto(); //lo uso come un semplice metodo statc
		
		Cerchio mioCerchio = new Cerchio(5.2);
		System.out.println("L'area del cerchio vale: " + mioCerchio.calcolaArea());
		System.out.println("Il perimetro del cerchio vale: " + mioCerchio.calcolaPerimetro());
		
		Rettangolo mioRettangolo = new Rettangolo(4.3, 8.2);
		System.out.println("L'area del rettangolo vale: " + mioRettangolo.calcolaArea());
		System.out.println("Il perimetro del rettangolo vale: " + mioRettangolo.calcolaPerimetro());
		mioRettangolo.stampaInfoforma();
		
		//Array di FormeCalcolabili
		FormaCalcolabile[] mieForme = {mioCerchio, mioRettangolo};
		for (FormaCalcolabile fc : mieForme) {
			System.out.println(fc.calcolaArea());
		}
		
		//DOPO
//		FormaCalcolabile formCalc = (a, b) -> a + b;
//		int risultato = formCalc.faiUnCalcolo(8, 9);
	}

}
