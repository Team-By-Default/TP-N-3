package warGame;

import org.junit.Assert;
import org.junit.Test;

public class LanceroTest {
	
	@Test
	public void testeandoAtributos() {
		Lancero jose = new Lancero ();
		
		Assert.assertEquals( 150, jose.salud, 0);
		Assert.assertEquals( 25, jose.danio, 0);
	}

	@Test
	public void testeandoHacerDanio() {
		Lancero jose = new Lancero ();
		
		Assert.assertEquals( 25, jose.hacerDanio(), 0);
	}

}
