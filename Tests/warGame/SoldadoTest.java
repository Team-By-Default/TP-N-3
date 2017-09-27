package warGame;

import org.junit.Assert;
import org.junit.Test;

public class SoldadoTest {

	@Test
	public void testeandoAtributos() {
		Soldado jose = new Soldado ();
		
		Assert.assertEquals( 200, jose.salud, 0);
		Assert.assertEquals( 10, jose.danio, 0);
		Assert.assertEquals( 100, jose.getEnergiaTope(), 0);
		Assert.assertEquals( 100, jose.getEnergia(), 0);
	}

	@Test
	public void testeandoHacerDanio() {
		Soldado jose = new Soldado ();
		
		Assert.assertEquals( 10, jose.hacerDanio(), 0);
	}

	@Test
	public void testeandoPuedeAtacar() {
		Soldado jose = new Soldado ();
		Soldado ronaldo = new Soldado ();
		for(int i = 0; i <9; i++) {
			Assert.assertEquals( 10, jose.hacerDanio(), 0);
		}
		Assert.assertEquals( true, jose.puedeAtacar(ronaldo));
		
		Assert.assertEquals( 10, jose.hacerDanio(), 0);
		Assert.assertEquals( 0, jose.getEnergia(), 0);
		Assert.assertEquals( false, jose.puedeAtacar(ronaldo));
	}

	@Test
	public void testeandoAtacar() {
		Soldado jose = new Soldado ();
		Arquero ronaldo = new Arquero ();
		
		for(int i = 0; i < 5; i++) {
			Assert.assertEquals( true, ronaldo.estaVivo());
			jose.atacar(ronaldo);
		}
		
		Assert.assertEquals( true, jose.puedeAtacar(ronaldo));
		Assert.assertEquals( false, ronaldo.estaVivo());
	}

	@Test
	public void testeandoRecibirDanio() {
		Soldado jose = new Soldado ();
		Soldado ronaldo = new Soldado ();
		
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

}
