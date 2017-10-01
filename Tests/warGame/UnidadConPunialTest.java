package warGame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnidadConPunialTest {

	Unidad alexis;
	Unidad valeria;
	Unidad lara;
	Unidad daniel;

	@Before
	public void setUp() {
		alexis = new UnidadConPunial(new Soldado());
		valeria = new UnidadConPunial(new Caballero(1, 0));
		daniel = new UnidadConPunial(new Arquero(2, 0));
		lara = new UnidadConPunial(new Lancero(1, 0));
	}

	/**
	 * Vemos si los atributos de cada rama estan bien ubicados
	 */
	@Test
	public void testeandoAtributos() {

		Assert.assertEquals(200, alexis.getSalud(), 0);
		Assert.assertEquals(true, alexis.estaVivo());
		Assert.assertEquals(100, ((UnidadConPunial) alexis).getEnergia());

		Assert.assertEquals(200, valeria.getSalud(), 0);
		Assert.assertEquals(true, valeria.estaVivo());

		Assert.assertEquals(150, lara.getSalud(), 0);
		Assert.assertEquals(true, lara.estaVivo());

		Assert.assertEquals(50, daniel.getSalud(), 0);
		Assert.assertEquals(true, daniel.estaVivo());
	}

	/**
	 * Vemos si el daño esta bien aplicado
	 */
	@Test
	public void testeandoDanio() {
		Assert.assertEquals(200, valeria.getSalud(), 0);
	    Assert.assertEquals(true, daniel.atacar(valeria));
		Assert.assertEquals(192, valeria.getSalud(), 0);
		
		Assert.assertEquals(50, daniel.getSalud(), 0);
		Assert.assertEquals(true, valeria.atacar(daniel));
		Assert.assertEquals(false, daniel.estaVivo());
		Assert.assertEquals(false, daniel.atacar(valeria)); //arquero no puede atacar porque esta muerto

		Assert.assertEquals(200, alexis.getSalud(), 0);
		Assert.assertEquals(true, lara.atacar(alexis));
		Assert.assertEquals(172, alexis.getSalud(), 0);

		Assert.assertEquals(150, lara.getSalud(), 0);
		Assert.assertEquals(true, alexis.atacar(lara));
		Assert.assertEquals(137, lara.getSalud(), 0);

	}

}