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
	 * Buscamos ver si los atributos fueron bien colocados
	 */
	@Test
	public void testeandoAtributos() {
		
		Assert.assertEquals( 150, jose.getSalud(), 0);
	}
	
	/**
	 * Buscamos ver si el lancero es capaz de atacar a su objetivo
	 */
	@Test
	public void testeandoPuedeAtacar() {
		
		Assert.assertEquals( true, jose.puedeAtacar(ronaldo));
		Assert.assertEquals( true, ronaldo.puedeAtacar(jose));

		Assert.assertEquals( false, jose.puedeAtacar(lejano));
		Assert.assertEquals( false, lejano.puedeAtacar(jose));
		
		Assert.assertEquals( true, lejano.puedeAtacar(ronaldo));
		Assert.assertEquals( true, ronaldo.puedeAtacar(lejano));
	}
	
	/**
	 * Buscamos ver si recibe daño el lancero
	 */
	@Test
	public void testeandoRecibirDanio() {
		
		Assert.assertEquals( 150, jose.getSalud(), 0);
		
		ronaldo.atacar(jose);

		Assert.assertEquals( 125, jose.getSalud(), 0);
	}
	
	/**
	 * Buscamos ver si el lancero es capaz de morir
	 */
	@Test
	public void testeandoMorir() {

		for(int i = 0; i < 6; i++) {
			Assert.assertEquals( true, jose.estaVivo());
			ronaldo.atacar(jose);
		}

		Assert.assertEquals( false, jose.estaVivo());
	}
	
	/**
	 * Buscamos ver si el lancero puede atacar si esta muerto
	 */
	@Test
	public void testeandoMuertoAtaca() {

		for(int i = 0; i < 6; i++) {
			Assert.assertEquals( true, jose.estaVivo());
			ronaldo.atacar(jose);
		}

		Assert.assertEquals( false, jose.atacar(ronaldo));
	}

	/**
	 * Buscamos ver que pasa si toma agua
	 */
	@Test
	public void testeandoTomarAgua() {

		Assert.assertEquals( 150, jose.getSalud(), 0);
		ronaldo.atacar(jose);
		Assert.assertEquals( 125, jose.getSalud(), 0);
		
		jose.tomarAgua();

		Assert.assertEquals( 125, jose.getSalud(), 0);
	}

}
