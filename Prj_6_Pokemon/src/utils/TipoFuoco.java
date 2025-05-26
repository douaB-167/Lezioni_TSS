package utils;

import model.Pokemon;

public interface TipoFuoco {
	
	default void lanciafianne(Pokemon pokemon) {
		System.out.println(pokemon + " usa Lanciafiamme...VROOO");
	};
	void braciere();
	void nitrocarica();

}
