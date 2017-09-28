package warGame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnidadConCapaTest {

	Unidad alexis;
	Unidad valeria;
	Unidad lara;
	Unidad daniel;
	
	@Before
	public void setUp() {
	alexis = new UnidadConCapa(new Soldado());
	valeria = new UnidadConCapa(new Caballero(1,0));
	daniel = new UnidadConCapa(new Arquero(2,0));
	lara = new UnidadConCapa(new Lancero(1,0));
	}
	
	/**
	 * Vemos si los atributos de cada rama estan bien ubicados
	 */
	@Test
	public void testeandoAtributos() {

		Assert.assertEquals(200, alexis.getSalud(),0);
		Assert.assertEquals(true, alexis.estaVivo());

		Assert.assertEquals(200, valeria.getSalud(),0);
		Assert.assertEquals(true, valeria.estaVivo());

		Assert.assertEquals(150, lara.getSalud(),0);
		Assert.assertEquals(true, lara.estaVivo());

		Assert.assertEquals(50, daniel.getSalud(),0);
		Assert.assertEquals(true, daniel.estaVivo());
	}
	
	/**
	 * Vemos si el daño esta bien aplicado
	 */
	@Test
	public void testeandoEnergia() {
		Unidad domie = new Soldado(1,0);
		int cant = 0;
		
		while(alexis.atacar(domie))
			cant++;
		
		Assert.assertEquals(20, cant, 0);
		
	}
	
	/**
	 * Vemos si el daño esta bien aplicado
	 */
	@Test
	public void testeandoDanio() {//Hacer danio no funca. Hace como si no hubiera habido algun cambio
		
		Assert.assertEquals(200, valeria.getSalud(),0);
		Assert.assertEquals(true, daniel.atacar(valeria));
		Assert.assertEquals(195.5, valeria.getSalud(),0);
		
		Assert.assertEquals(50, daniel.getSalud(),0);
		Assert.assertEquals(true, valeria.atacar(daniel));
		Assert.assertEquals(5, daniel.getSalud(),0);
		

		Assert.assertEquals(200, alexis.getSalud(),0);
		Assert.assertEquals(true, lara.atacar(alexis));
		Assert.assertEquals(177.5, alexis.getSalud(),0);
		
		Assert.assertEquals(150, lara.getSalud(),0);
		Assert.assertEquals(true, alexis.atacar(lara));
		Assert.assertEquals(141, lara.getSalud(),0);
		
	}
}
