package warGame;

import org.junit.Assert;
import org.junit.Test;

public class CaballeroTest {
	
	/**
	 * Buscamos ver si los atributos fueron bien colocados
	 */
	@Test
	public void testeandoAtributos() {
		Caballero jose = new Caballero (0,0);
		Caballero pepe = new Caballero(1,0);
		Assert.assertEquals( 200, jose.getSalud(), 0);
		Assert.assertEquals( true, pepe.atacar(jose));
		Assert.assertEquals( true, jose.atacar(pepe));
		Assert.assertEquals( true, pepe.atacar(jose));
		Assert.assertEquals( true, pepe.atacar(jose));
		Assert.assertEquals( false, jose.atacar(pepe));
	}
}
