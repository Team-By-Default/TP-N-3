package warGame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SoldadoTest {
	
	Soldado jose;
	Soldado ronaldo;
	Soldado lejano;
	
	@Before
	public void setUp() {
		jose = new Soldado (0,0);
		ronaldo = new Soldado (0,0);
		lejano = new Soldado (1,0);
	}
	
	/**
	 * Buscamos ver si los atributos fueron bien colocados
	 */
	@Test
	public void testeandoAtributos() {
		
		Assert.assertEquals( 200, jose.getSalud(), 0);
		Assert.assertEquals( 100, jose.getEnergiaTope(), 0);
		Assert.assertEquals( 100, jose.getEnergia(), 0);
	}
	
	/**
	 * Buscamos ver los limites de la energia del
	 */
	@Test
	public void testeandoLimitesEnergia() {
		
		for(int i = 0; i <10; i++) {
			jose.hacerDanio();
		}
		
		Assert.assertEquals( 0, jose.getEnergia(), 0);
	}
	
	/**
	 * Buscamos ver si el soldado es capaz de atacar
	 */
	@Test
	public void testeandoAtacar() {
		
		Assert.assertEquals( true, jose.atacar(ronaldo));
		
		Assert.assertEquals( 190, ronaldo.getSalud(),0);
		Assert.assertEquals( 90, jose.getEnergia(),0);
	}
	
	/**
	 * Buscamos ver si el Soldado reciebe da�o
	 */
	@Test
	public void testeandoRecibirDanio() {

			Assert.assertEquals( true, ronaldo.atacar(jose));
			Assert.assertEquals( 190, jose.getSalud(),0);
	}
	
	/**
	 * Buscamos ver los limites de la salud del Soldado
	 */
	@Test
	public void testeandoMorir() {

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
	
	/**
	 * Buscamos ver si el Soldado puede atacar, estando muerto
	 */
	@Test
	public void testeandoAtacarMuerto() {

		for(int i = 0; i < 10; i++)
			ronaldo.atacar(jose);

		ronaldo.tomarAgua();
		
		for(int i = 0; i < 10; i++)
			ronaldo.atacar(jose);

		Assert.assertEquals( false, jose.atacar(ronaldo));
	}

	/**
	 * Buscamos ver que pasa si toma agua
	 */
	@Test
	public void testeandoTomarAgua() {

		Assert.assertEquals( 100, jose.getEnergia(), 0);
		jose.atacar(ronaldo);
		Assert.assertEquals( 90, jose.getEnergia(), 0);
		
		jose.tomarAgua();

		Assert.assertEquals( 100, jose.getEnergia(), 0);
	}

}
