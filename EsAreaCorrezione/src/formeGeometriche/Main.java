package formeGeometriche;

public class Main {
	
	public static void main(String[] args) {
		
		//Quadrato
		Quadrato quad = new Quadrato(4);
		System.out.println("Area quadrato: " + quad.calcolaArea());
		System.out.println("Perimetro quadrato: " + quad.calcolaPerimetro());
		
		//Rettangolo
		Rettangolo ret = new Rettangolo(5, 6);
		System.out.println("Area rettangolo: " + ret.calcolaArea());
		System.out.println("Perimetro rettangolo: " + ret.calcolaPerimetro());
		
		//Cerchio
		Cerchio cerchio = new Cerchio(3);
		System.out.println("Area cerchio: " + cerchio.calcolaArea());
		System.out.println("Perimetro cerchio: " + cerchio.calcolaPerimetro());
		
		//Triangolo
		Triangolo triangolo = new Triangolo(2, 3);
		System.out.println("Area triangolo: " + triangolo.calcolaArea());
		System.out.println("Perimetro triangolo: " + triangolo.calcolaPerimetro());
		
	}

}
