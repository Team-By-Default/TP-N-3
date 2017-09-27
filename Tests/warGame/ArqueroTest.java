package warGame;

import org.junit.Assert;
import org.junit.Test;

public class ArqueroTest {
	
	/**
	 * Buscamos ver si los atributos fueron bien colocados
	 */
	@Test
	public void testeandoAtributos() {
		Arquero oliver = new Arquero ();
		
		Assert.assertEquals( 50, oliver.salud, 0);
		Assert.assertEquals( 5, oliver.danio, 0);
		Assert.assertEquals( 20, oliver.flechas, 0);
	}
	
	/**
	 * Buscamos ver si el arquero carga bien las flechas
	 */
	@Test
	public void testeandoCargarFlechas() {
		Arquero oliver = new Arquero ();

		oliver.cargarFlechas();
		Assert.assertEquals( 26, oliver.flechas, 0);
	}
	
	/**
	 * Buscamos ver si al hacer daño el arquero pierde una flecha
	 * e inflige el daño indicado
	 */
	@Test
	public void testeandoHacerDanio() {
		Arquero oliver = new Arquero ();

		Assert.assertEquals( 5, oliver.hacerDanio(), 0);
		Assert.assertEquals( 19, oliver.flechas, 0);
	}
	
	/**
	 * Buscamos ver el limite de las flechas
	 */
	@Test
	public void testeandoFlechas() {
		Arquero oliver = new Arquero ();

		for(int i = 1; i <= 20; i++) {
			Assert.assertEquals( 5, oliver.hacerDanio(), 0);
			Assert.assertEquals( (20-i), oliver.flechas, 0);
		}
	}
	
	/**
	 * Buscamos ver si el arquero es capaz de atacar a su objetivo
	 * 
	 * Cambiar en futuro
	 */
	@Test
	public void testeandoPuedeAtacar() {
		Arquero oliver = new Arquero ();
		Arquero hawk = new Arquero ();

		Assert.assertEquals(false, oliver.puedeAtacar(hawk));
	}
	
	/**
	 * Buscamos ver los limites de la salud del arquero
	 */
	@Test
	public void testeandoRecibirDanio() {
		Arquero oliver = new Arquero ();
		Soldado hawk = new Soldado ();
		
		for(int i = 0; i < 5; i++) {
			Assert.assertEquals( true, oliver.estaVivo());
			hawk.atacar(oliver);
		}

		Assert.assertEquals( false, oliver.estaVivo());
	}

}
