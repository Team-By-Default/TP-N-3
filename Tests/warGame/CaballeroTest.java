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
	
	/**
	 * Test que muestra que ambos Caballeros
	 * realizan 50 puntos de daño, sin items
	 * y que reciben 50 puntos de daños,
	 * sin items
	 * Ademas, testeamos que ambos sigan vivos
	 */
	@Test
	public void testeandoDanio() {
		jose.atacar(pepe);
		Assert.assertEquals(150, pepe.getSalud(),0);
		pepe.atacar(jose);
		Assert.assertEquals(150, jose.getSalud(),0);
		Assert.assertEquals(true, jose.estaVivo()&&pepe.estaVivo());
	}
	
	/**
	 * Test que muestra que, al quedar 
	 * un Caballero con 0 puntos de
	 * vida, este está muerto
	 */
	@Test
	public void testeandoMuerte() {
		while(pepe.estaVivo())
			jose.atacar(pepe);

		Assert.assertEquals(0, jose.getSalud(),0);
		Assert.assertEquals(false, pepe.estaVivo());
	}
	
	/**
	 * Teste que muestra que el Caballero no
	 * puede atacar por la distancia
	 */
	public void testeandoDistancia() {
		Assert.assertEquals( false, jose.atacar(lejano));
		
		Assert.assertEquals( true, jose.atacar(pepe));
	}
	
	/**
	 * Test que muestra que un Caballero 
	 * que es atacado 3 veces por una unidad
	 * no puede atacar
	 */
	@Test
	public void testeandoCaballoRebelde() {
		for(int i = 0; i < 3; i++) {
			pepe.atacar(jose);
		}
		
		Assert.assertEquals( false, jose.atacar(pepe));
	}
	/**
	 * Test que muestra que tras no poder atacar
	 * un Caballero que toma agua(su caballo)
	 * puede volver a atacar
	 */
	@Test
	public void testeandoCaballoRebeldeRecuperado() {
		for(int i = 0; i < 3; i++) {
			pepe.atacar(jose);
		}
		Assert.assertEquals( false, jose.atacar(pepe));
		
		jose.tomarAgua();
		Assert.assertEquals( true, jose.atacar(pepe));
	}
	
	
}
