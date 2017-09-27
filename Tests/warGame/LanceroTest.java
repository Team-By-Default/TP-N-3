package warGame;

import org.junit.Assert;
import org.junit.Test;

public class LanceroTest {
	
	/**
	 * Buscamos ver si los atributos fueron bien colocados
	 */
	@Test
	public void testeandoAtributos() {
		Lancero jose = new Lancero ();
		
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
		Lancero jose = new Lancero ();
		Soldado ronaldo = new Soldado ();
		
		Assert.assertEquals( false, jose.puedeAtacar(ronaldo));
	}
	
	/**
	 * Buscamos ver los limites de la salud del lancero
	 */
	@Test
	public void testeandoRecibirDanio() {
		Lancero jose = new Lancero ();
		Soldado ronaldo = new Soldado ();
		
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
