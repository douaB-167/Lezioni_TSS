package lezione10_AnimaliGeometrici;

public class Fattoria {

	public static void main(String[] args) {
		
		Animale mioCane = new Cane();
		Animale mioGatto = new Gatto();
		Animale mioMucca = new Mucca();
		
		System.out.println("----La fattoria si sveglia !!! -----");
		mioCane.faiVerso();
		mioGatto.faiVerso();
		mioMucca.faiVerso();
		
		System.out.println("----Contiamo gli animali------");
		Animale[] animaleNellaFattoria = new Animale[4];
		
		animaleNellaFattoria[0] = mioCane;
		animaleNellaFattoria[1] = mioGatto;
		animaleNellaFattoria[2] = mioMucca;
		animaleNellaFattoria[3] = new Gallo();
		
		for(int i = 0; i < animaleNellaFattoria.length; i++) {
			System.out.println("Animale num " + i);
			animaleNellaFattoria[i].faiVerso();
		}
		
		System.out.println("Aggiungiamo un pappagallo");
		Animale pappagallo = new Pappagallo();
		System.out.println(pappagallo.versoAlt());
		
	}
}
