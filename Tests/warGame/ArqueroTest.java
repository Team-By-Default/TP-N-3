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
		oliver = new Arquero ();
		hawk = new Arquero (3,3);
		legolas = new Arquero (5,5);
	}
	
	
	/**
	 * Buscamos ver si los atributos fueron bien colocados
	 */
	@Test
	public void testeandoAtributos() {
		
		Assert.assertEquals( 50, oliver.getSalud(), 0);
	}
	
	/**
	 * Buscamos ver el limite de las flechas
	 */
	@Test
	public void testeandoFlechas() {
		int cant = 0;
		while(oliver.atacar(hawk))
			cant++;
		Assert.assertEquals( 20, cant, 0);
	}
	
	/**
	 * Buscamos ver si el arquero carga bien las flechas
	 */
	@Test
	public void testeandoCargarFlechas() {
		int cant = 0;
		while(oliver.atacar(hawk))
			cant++;
		Assert.assertEquals( 20, cant, 0);
		
		oliver.cargarFlechas();

		while(oliver.atacar(hawk))
			cant++;
		Assert.assertEquals( 26, cant, 0);
	}
	
	/**
	 * Test que muestra que ambos Arqueros
	 * realizan 5 puntos de daño, sin items
	 */
	@Test
	public void testeandoHacerDanio() {
		hawk.atacar(oliver);
		Assert.assertEquals(45, oliver.getSalud(),0);
	}
	
	/**
	 * Buscamos ver si puede atacar sin flechas
	 */
	@Test
	public void testeandoSinFlechas() {
		int cant = 0;
		while(oliver.atacar(hawk))
			cant++;
		Assert.assertEquals( 20, cant, 0);
		Assert.assertEquals( false, oliver.atacar(hawk));
	}
	
	
	/**
	 * Buscamos ver si los arqueros son capaces de atacar a
	 * objetivos en diferentes distancias
	 */
	@Test
	public void testeandoPuedeAtacar() {

		Assert.assertEquals(true, oliver.atacar(hawk));
		Assert.assertEquals(true, hawk.atacar(oliver));
		
		Assert.assertEquals(true, hawk.atacar(legolas));
		Assert.assertEquals(true, legolas.atacar(hawk));
		
		Assert.assertEquals(false, legolas.atacar(oliver));
		Assert.assertEquals(false, oliver.atacar(legolas));
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

		while(oliver.estaVivo())
			hawk.atacar(oliver);

		Assert.assertEquals( false, oliver.estaVivo());
	}
	
	/**
	 * Buscamos ver si el arquero puede atacar si esta muerto
	 */
	@Test
	public void testeandoMuertoAtaca() {

		while(oliver.estaVivo())
			hawk.atacar(oliver);

		Assert.assertEquals( false, oliver.atacar(hawk));
	}
}
