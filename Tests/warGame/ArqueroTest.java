package warGame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArqueroTest {
	
	Arquero oliver;
	Arquero hawk;
	Arquero legolas;
	
	@Before
	public void setUp() {
		oliver = new Arquero (0,0);
		hawk = new Arquero (3,3);
		legolas = new Arquero (5,5);
	}
	
	
	/**
	 * Buscamos ver si los atributos fueron bien colocados
	 */
	@Test
	public void testeandoAtributos() {
		
		Assert.assertEquals( 50, oliver.getSalud(), 0);
		Assert.assertEquals( 20, oliver.flechas, 0);
	}
	
	/**
	 * Buscamos ver si el arquero carga bien las flechas
	 */
	@Test
	public void testeandoCargarFlechas() {
		
		oliver.cargarFlechas();
		Assert.assertEquals( 26, oliver.flechas, 0);
	}
	
	/**
	 * Buscamos ver si al hacer daño el arquero pierde una flecha
	 * e inflige el daño indicado
	 */
	@Test
	public void testeandoHacerDanio() {

		Assert.assertEquals( 5, oliver.hacerDanio(), 0);
		Assert.assertEquals( 19, oliver.flechas, 0);
	}
	
	/**
	 * Test que muestra que ambos Arqueros
	 * realizan 5 puntos de daño, sin items
	 * y que reciben 5 puntos de daños,
	 * sin items
	 */
	@Test
	public void testeandoDanio() {
		hawk.atacar(oliver);
		Assert.assertEquals(45, oliver.getSalud(),0);
		oliver.atacar(hawk);
		Assert.assertEquals(45, hawk.getSalud(),0);
	}
	
	/**
	 * Buscamos ver el limite de las flechas
	 */
	@Test
	public void testeandoFlechas() {

		for(int i = 1; i <= 20; i++) {
			Assert.assertEquals( 5, oliver.hacerDanio(), 0);
			Assert.assertEquals( (20-i), oliver.flechas, 0);
		}
	}
	
	/**
	 * Buscamos ver si puede atacar sin flechas
	 */
	@Test
	public void testeandoSinFlechas() {

		for(int i = 1; i <= 20; i++) {
			Assert.assertEquals( 5, oliver.hacerDanio(), 0);
			Assert.assertEquals( (20-i), oliver.flechas, 0);
		}

		Assert.assertEquals( false, oliver.atacar(hawk));
	}
	
	
	/**
	 * Buscamos ver si los arqueros son capaces de atacar a
	 * objetivos en diferentes distancias
	 */
	@Test
	public void testeandoPuedeAtacar() {

		Assert.assertEquals(true, oliver.puedeAtacar(hawk));
		Assert.assertEquals(true, hawk.puedeAtacar(oliver));
		
		Assert.assertEquals(true, hawk.puedeAtacar(legolas));
		Assert.assertEquals(true, legolas.puedeAtacar(hawk));
		
		Assert.assertEquals(false, legolas.puedeAtacar(oliver));
		Assert.assertEquals(false, oliver.puedeAtacar(legolas));
	}
	
	/**
	 * Buscamos ver si el arquero recibe daño
	 */
	@Test
	public void testeandoRecibirDanio() {

			Assert.assertEquals( 50, oliver.getSalud(), 0);
			hawk.atacar(oliver);
			Assert.assertEquals( 45, oliver.getSalud(), 0);
	}
	
	/**
	 * Buscamos ver si el arquero puede morir
	 */
	@Test
	public void testeandoMorir() {

		for(int i = 0; i < 10; i++) {
			Assert.assertEquals( true, oliver.estaVivo());
			hawk.atacar(oliver);
		}

		Assert.assertEquals( false, oliver.estaVivo());
	}
	
	/**
	 * Buscamos ver si el arquero puede atacar si esta muerto
	 */
	@Test
	public void testeandoMuertoAtaca() {

		for(int i = 0; i < 10; i++) {
			Assert.assertEquals( true, oliver.estaVivo());
			hawk.atacar(oliver);
		}

		Assert.assertEquals( false, oliver.atacar(hawk));
	}

	/**
	 * Buscamos ver que pasa si toma agua
	 */
	@Test
	public void testeandoTomarAgua() {

		Assert.assertEquals( 50, oliver.getSalud(), 0);
		hawk.atacar(oliver);
		Assert.assertEquals( 45, oliver.getSalud(), 0);
		
		oliver.tomarAgua();

		Assert.assertEquals( 45, oliver.getSalud(), 0);
	}
}
