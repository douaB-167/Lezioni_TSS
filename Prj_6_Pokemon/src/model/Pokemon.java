package model;

public abstract class Pokemon {

	protected String nome;
	protected int livello;
	protected int pv;
	protected int pvMax;
	protected String[] tipi;
	
	//Overload
	public Pokemon(String nome, int livello, int pvMax) {
		this.nome = nome;
		this.livello = livello;
		this.pvMax = pvMax;
	}
	
	public Pokemon(String nome, int livello, int pvMax, String[] tipi) {
		this.nome = nome;
		this.livello = livello;
		this.pvMax = pvMax;
		this.pv = pvMax;
		this.tipi = tipi;
	}
	
	
	//Metodi comuni a tutti i pokemon
	public void mostraInfo() {
		System.out.println("----" + this.nome + "----");
		System.out.println("Livello: " + this.livello);
		System.out.println("Pv: " + this.pv);
		String tipi = "";
		for (String tipo : this.tipi) {
			tipo += tipo + ", ";
		}
		System.out.println("Tipo: " + tipi);
	}
	
	private void prendiDanno(int danno) {
		pv = Math.max(0, pv - danno); //per non fare l'if, va a zero e non sottozero
		System.out.println(this.nome + " subisce " + danno + " punti danno. PV attuali: " + this.pv);
	}
	
	public abstract void attaccoBase();
	public abstract void mossaSpeciale();
	public abstract void faiVerso();
	
}
