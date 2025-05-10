package ContoCorrente;

import java.util.Date;
import java.util.Scanner;

public class ContoCorrente {
	
//	public static int prossimoNumeroConto = 1000;
	
	public int contatore;  //+ public, - private
	public int  numConto;
	public double saldo;
	public String titolare;
	public Date dataApertura;
	
	public ContoCorrente() { }
	
	
	public ContoCorrente(int contatore, int numConto, double saldo, String titolare, Date dataApertura) {
		this.contatore = contatore;
		this.saldo = saldo;
		this.titolare = titolare;
		this.dataApertura = dataApertura;
		this.numConto = numConto;
//		this.numConto = prossimoNumeroConto;
//        prossimoNumeroConto++;
	}


	public void numeraConto() {
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci il numero del tuo conto --> ");
		numConto = in.nextInt();
	}
	
	public double versamento(double versa) {
		return saldo += versa;
	}
	
	public double prelievo(double prel) {
		return saldo -= prel;
	}
	
	public String stampaInfo(String titolare, int numConto, double saldo) {
		return "Il titolare del conto numero " + numConto + " è " + titolare + " con saldo " + saldo + "€";
	}

	@Override
	public String toString() {
		return "ContoCorrente [contatore=" + contatore + ", numConto=" + numConto + ", saldo=" + saldo + ", titolare="
				+ titolare + ", dataApertura=" + dataApertura + "]";
	}
	
	
	
	
}
