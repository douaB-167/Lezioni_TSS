package lezione3_Metodi;

import java.util.Scanner;

public class Calcolatrice0 {
	
	public static void main(String[] args) {
		double primoNum = getInput("Inserisci il primo num ?");
		double secondNum = getInput("Inserisci il secondo num ?");
		
//		double somma = primoNum + secondNum;
//		System.out.println("La somma dei tuoi 2 numeri vale: " + somma);
		
		System.out.println(addizone(primoNum, secondNum)); //ctrl + alt + freccia sotto
		System.out.println(sottrazione(primoNum, secondNum));
		System.out.println(moltiplicazione(primoNum, secondNum));
		System.out.println(quoziente(primoNum, secondNum));
	}
	
	public static double addizone(double a, double b) {
		double somma = a + b;
		return somma;
	}
	
	public static double moltiplicazione(double a, double b) {
		return a * b;
	}
	
	public static double sottrazione(double a, double b) {
		return a - b;
	}
	
	public static double quoziente(double a, double b) {
		double quoziente = a / b;
		return quoziente;
	}
	
	public static double getInput(String domanda) {
		System.out.println(domanda);
		
		Scanner input = new Scanner(System.in);
		
		double mioDouble = input.nextDouble();
		
		return mioDouble;
	}

}
