package warGame;

import org.junit.Assert;
import org.junit.Test;

public class ArqueroTest {
	
	@Test
	public void testeandoAtributos() {
		Arquero oliver = new Arquero ();
		
		Assert.assertEquals( 50, oliver.salud, 0);
		Assert.assertEquals( 5, oliver.danio, 0);
		Assert.assertEquals( 20, oliver.flechas, 0);
	}
	
	@Test
	public void testeandoCargarFlechas() {
		Arquero oliver = new Arquero ();

		oliver.cargarFlechas();
		Assert.assertEquals( 26, oliver.flechas, 0);
	}
	
	@Test
	public void testeandoHacerDanio() {
		Arquero oliver = new Arquero ();

		Assert.assertEquals( 5, oliver.hacerDanio(), 0);
		Assert.assertEquals( 19, oliver.flechas, 0);
	}
	
	@Test
	public void testeandoPuedeAtacar() {
		Arquero oliver = new Arquero ();
		Arquero hawk = new Arquero ();

		Assert.assertEquals(false, oliver.puedeAtacar(hawk));
	}

}
