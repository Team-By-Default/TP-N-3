package warGame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CaballeroTest {
	
	Caballero jose;
	Caballero pepe;
	Caballero lejano;
	
	@Before
	public void setUp() {
		jose = new Caballero (0,0);
		pepe = new Caballero (1,0);
		lejano = new Caballero (10,10);
	}
	
	/**
	 * Buscamos ver si los atributos fueron bien colocados
	 */
	@Test
	public void testeandoAtributos() {
		Assert.assertEquals( 200, jose.getSalud(), 0);
		Assert.assertEquals( true, jose.estaVivo());
	}
	
	@Test
	public void testeandoCaballoRebelde() {
		Assert.assertEquals( true, pepe.atacar(jose));
		Assert.assertEquals( true, pepe.atacar(jose));
		Assert.assertEquals( true, pepe.atacar(jose));
		Assert.assertEquals( false, jose.atacar(pepe));//
	}
}
