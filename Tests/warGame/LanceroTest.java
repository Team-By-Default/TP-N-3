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
		jose = new Lancero (0,0);
		ronaldo = new Lancero (1,0);
		lejano = new Lancero (10,10);
	}
	
	/**
	 * Buscamos ver si los atributos fueron bien colocados
	 */
	@Test
	public void testeandoAtributos() {
		
		Assert.assertEquals( 150, jose.salud, 0);
		Assert.assertEquals( 25, jose.danio, 0);
	}
	
	/**
	 * Buscamos ver si el lancero es capaz de atacar a su objetivo
	 * 
	 * Cambiar en futuro
	 */
	@Test
	public void testeandoPuedeAtacar() {
		
		Assert.assertEquals( false, jose.puedeAtacar(ronaldo));
	}
	
	/**
	 * Buscamos ver los limites de la salud del lancero
	 */
	@Test
	public void testeandoRecibirDanio() {
		
		for(int i = 0; i < 10; i++) {
			Assert.assertEquals( true, jose.estaVivo());
			ronaldo.atacar(jose);
		}
		ronaldo.tomarAgua();
		
		for(int i = 0; i < 5; i++) {
			Assert.assertEquals( true, jose.estaVivo());
			ronaldo.atacar(jose);
		}
		
		Assert.assertEquals( false, jose.estaVivo());
	}

}
