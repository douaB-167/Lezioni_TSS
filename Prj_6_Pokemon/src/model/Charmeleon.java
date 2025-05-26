package model;

import utils.Evolvibile;
import utils.TipoFuoco;

public class Charmeleon extends Pokemon implements TipoFuoco, Evolvibile{

	public Charmeleon(String nome, int livello, int pvMax, String[] tipi) {
		super(nome, livello, pvMax, tipi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean puoEvolvere() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String prossimaEvoluzione() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pokemon evolvi() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void lanciafianne() {
		System.out.println(this.nome + " usa Lanciafiamme...VROOO");
	}

	@Override
	public void braciere() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nitrocarica() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attaccoBase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mossaSpeciale() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void faiVerso() {
		// TODO Auto-generated method stub
		
	}

}
