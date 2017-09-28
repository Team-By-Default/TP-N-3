package warGame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnidadConEscudoTest {

	Unidad alexis;
	Unidad valeria;
	Unidad lara;
	Unidad daniel;
	
	@Before
	public void setUp() {
	alexis = new UnidadConEscudo(new Soldado(1,0));
	valeria = new UnidadConEscudo(new Caballero(0,0));
	daniel = new UnidadConEscudo(new Arquero(0,0));
	lara = new UnidadConEscudo(new Lancero(0,0));
	}
	
	@Test
	public void testeandoAtributos() {

		//Assert.assertEquals(100, ((Soldado)alexis).getEnergia());
	}

	@Test
	public void testeandoCombate() {
		Assert.assertEquals(true, alexis.atacar(daniel));
		Assert.assertEquals(46, daniel.getSalud(), 0);
	}
}
