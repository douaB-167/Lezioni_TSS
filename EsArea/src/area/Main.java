package area;

public class Main {
	
	public static void main(String[] args) {
		
		//Area Quadrato
		Quadrato quad = new Quadrato(4);
		System.out.println("Area quadrato: " + quad.calcolaArea());
		System.out.println("Perimetro quadrato: " + quad.calcolaPerimetro());
		
		//Area Rettangoo
		Rettangolo ret = new Rettangolo(5, 6);
		System.out.println("Area rettangolo: " + ret.calcolaArea());
		System.out.println("Perimetro rettangolo: " + ret.calcolaPerimetro());
		
		//Area Cerchio
		Cerchio cerchio = new Cerchio(5);
		System.out.println("Area cerchio: " + cerchio.calcolaArea());
		System.out.println("Perimetro cerchio: " + cerchio.calcolaPerimetro());
		
		//Area Triangolo
		Triangolo triangolo = new Triangolo(4, 7);
		System.out.println("Area triangolo: " + triangolo.calcolaArea());
		System.out.println("Perimetro triangolo: " + triangolo.calcolaPerimetro());
	}

}
