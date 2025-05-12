package Conto;

import java.util.Date;

public class Conto {
	
	public static int contatore; //mi serve a contatare quanti conti sono aperti nella banca
	public int numConto;
	public String titolare;
	public Date dataApertura;
	public double saldo;
	
	public Conto() {
		System.out.println("Hai appena creato un conto vuoto. Dovrai aggiungere le varie prop");
		contatore++; //ATT: non posso usare il this poichè contatore è static quindi appartiee solo ed escusivamente alla classe non all'istanza
	}
	
	public Conto(int numConto, String titolare, Date dataApertura, double saldo) {
		System.out.println("Hai appena creato un conto corrente");
		this.numConto = numConto;
		this.titolare = titolare;
		this.saldo = saldo;
		this.dataApertura = dataApertura;
		contatore++;
		System.out.println("Nella tua banca ci sono " + contatore + " conti");
	}
	
	
	public double preleva (double importo) {
		
		if(importo < saldo) {
			System.out.println("Stai prelevando: " + importo);
			saldo -= importo;
			System.out.println("Saldo attuale: " + saldo);
		} else {
			System.out.println("Non hai sufficienti fondi");
		}
		return saldo;
	}
	
	public void versamento(double importo) {
		if(importo > 0) {
			System.out.println("Stai versando: " + importo + "€");
			saldo += importo;
			System.out.println("Saldo attuale: " + saldo);
		}else {
			System.out.println("Non puoi versare un importo negativo");
		}
	}
	
	public String stampaInfo() {
		String s = "";
		s += "Numero conto: \t" + numConto;
		s +="\nTitolare: \t" + titolare;
		s +="\nSaldo attuale: \t" + saldo;
		return s;
	}

	@Override
	public String toString() {
		return "Conto [numConto=" + numConto + ", titolare=" + titolare + ", dataApertura=" + dataApertura + ", saldo="
				+ saldo + "]";
	}
	
	
	
}
