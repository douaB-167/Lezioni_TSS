package ContoCorrente;

import java.util.Date;
import java.util.Scanner;

public class ContoCorrente {
	
	public int contatore;  //+ public, - private
	public int  numConto;
	public double saldo;
	public String titolare;
	public Date dataApertura;
	
	
	public ContoCorrente() {
		
	}

	public int numeraConto() {
		Scanner in = new Scanner(System.in);
		numConto = in.nextInt();
		return numConto;
	}
	
	public int versamento() {
		return 0;
	}
	
	public int prelievo() {
		return 0;
	}
	
	public String stampaInfo() {
		return numConto + titolare + saldo;
	}

	@Override
	public String toString() {
		return "ContoCorrente [contatore=" + contatore + ", numConto=" + numConto + ", saldo=" + saldo + ", titolare="
				+ titolare + ", dataApertura=" + dataApertura + "]";
	}
	
	
	
	
}
