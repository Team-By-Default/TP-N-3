package warGame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LanceroTest {
	
	Lancero jose;
	Lancero ronaldo;
	Lancero lejano;
	
	@Before
	public void setUp() {
		jose = new Lancero ();
		ronaldo = new Lancero (1,0);
		lejano = new Lancero (4,0);
	}
	
	/**
	 * Buscamos ver si los atributos fueron bien colocados
	 */
	@Test
	public void testeandoAtributos() {
		
		Assert.assertEquals( 150, jose.getSalud(), 0);
		Assert.assertEquals( true, jose.estaVivo());
	}

	/**
	 * Test que muestra que ambos Lanceros
	 * realizan 25 puntos de daño, sin items
	 * y que reciben 25 puntos de daños,
	 * sin items
	 */
	@Test
	public void testeandoDanio() {
		jose.atacar(ronaldo);
		Assert.assertEquals(125, ronaldo.getSalud(),0);
		
		ronaldo.atacar(jose);
		Assert.assertEquals(125, jose.getSalud(),0);
	}
	
	/**
	 * Buscamos ver los efectos del ataque del lancero
	 */
	@Test
	public void testeandoAtacar() {
		
		Assert.assertEquals( true, jose.atacar(ronaldo));
		
		Assert.assertEquals( 125, ronaldo.getSalud(),0);
	}
	
	/**
	 * Buscamos ver si el lancero es capaz de atacar a su objetivo
	 */
	@Test
	public void testeandoDistancias() {
		
		Assert.assertEquals( true, jose.atacar(ronaldo));
		Assert.assertEquals( true, ronaldo.atacar(jose));

		Assert.assertEquals( false, jose.atacar(lejano));
		Assert.assertEquals( false, lejano.atacar(jose));
		
		Assert.assertEquals( true, lejano.atacar(ronaldo));
		Assert.assertEquals( true, ronaldo.atacar(lejano));
	}
	
	/**
	 * Buscamos ver si el lancero es capaz de morir
	 */
	@Test
	public void testeandoMorir() {

		while(jose.estaVivo())
			ronaldo.atacar(jose);

		Assert.assertEquals( false, jose.estaVivo());
	}
	
	/**
	 * Buscamos ver si el lancero puede atacar si esta muerto
	 */
	@Test
	public void testeandoMuertoAtaca() {

		while(jose.estaVivo())
			ronaldo.atacar(jose);

		Assert.assertEquals( false, jose.atacar(ronaldo));
	}

}
