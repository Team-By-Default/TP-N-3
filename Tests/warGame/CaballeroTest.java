package warGame;

import org.junit.Assert;
import org.junit.Test;

public class CaballeroTest {
	
	/**
	 * Buscamos ver si los atributos fueron bien colocados
	 */
	@Test
	public void testeandoAtributos() {
		Caballero jose = new Caballero ();
		
		Assert.assertEquals( 200, jose.salud, 0);
		Assert.assertEquals( 50, jose.danio, 0);
		Assert.assertEquals( 3, jose.getCaballoNoRebelde(), 0);
	}
	
	/**
	 * Buscamos ver los limites de la salud del caballero
	 */
	@Test
	public void testeandoRecibirDanio() {
		Caballero jose = new Caballero ();
		Soldado ronaldo = new Soldado ();
		
		for(int i = 0; i < 10; i++) {
			Assert.assertEquals( true, jose.estaVivo());
			ronaldo.atacar(jose);
		}

		ronaldo.tomarAgua();
		
		for(int i = 0; i < 10; i++) {
			Assert.assertEquals( true, jose.estaVivo());
			ronaldo.atacar(jose);
		}
		
		Assert.assertEquals( false, jose.estaVivo());
	}
}
