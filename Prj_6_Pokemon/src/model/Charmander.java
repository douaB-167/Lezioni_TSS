package model;

import utils.Evolvibile;
import utils.TipoFuoco;

public class Charmander extends Pokemon implements TipoFuoco, Evolvibile{

	public Charmander(String nome, int livello, int pvMax, String[] tipi) {
		super(nome, livello, pvMax, tipi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void lanciafianne(Pokemon pokemon) {
		// TODO Auto-generated method stub
		System.out.println(pokemon.nome + " usa Lanciafiamme...VROOO");
	}

	@Override
	public void braciere() {
		// TODO Auto-generated method stub
		System.out.println(this.nome + " usa Braciere");
	}

	@Override
	public void nitrocarica() {
		// TODO Auto-generated method stub
		System.out.println(this.nome + " usa Nitrocarica");
	}

	@Override
	public void attaccoBase() {
		// TODO Auto-generated method stub
		this.braciere();
	}

	@Override
	public void mossaSpeciale() {
		// TODO Auto-generated method stub
		this.lanciafianne();
	}

	@Override
	public void faiVerso() {
		// TODO Auto-generated method stub
		System.out.println(this.nome + " dice CHAR CHAR");
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

}
