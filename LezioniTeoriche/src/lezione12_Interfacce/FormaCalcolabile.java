package lezione12_Interfacce;

public interface FormaCalcolabile {
	
	//Metodi
	double calcolaArea();
	double calcolaPerimetro();
	
	String TIPO = "Forma Geometrica calcolabile";
	
	//metodi di default
	default void stampaInfoforma() {
		System.out.println("Area forma " + this.calcolaArea());
		System.out.println("Perimetro forma " + this.calcolaPerimetro());
	}
	
	static void benvenuto() {
		System.out.println("Benvenuto nella geometria piana euclidea calcolabile");
	}

	//DOPO
//	@FunctionalInterface
//	int faiUnCalcolo(int a, int b);
	
}
