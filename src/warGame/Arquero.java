package warGame;

public class Arquero extends Unidad {

	/**
	 * La cantidad de flechas que posee el personaje.
	 */
	int flechas;

	/**
	 * Un ARQUERO tiene, de inicial y tope, 
	 * una salud de 50 y hace un
	 * danio de 5.
	 */
	private static final int SALUDTOPE = 50;
	private static final int DANIO = 5;
	
	
	public Arquero() {
		this.salud = SALUDTOPE;
		this.danio = DANIO;
		flechas=20;
	}
	
	/**
	 * El arquero carga 6 flechas, las cuales vienen en un paquete, y las carga en el carcaj
	 */
	public void cargarFlechas() {
		flechas += 6;
	}
	
	/**
	 * Al inflingir danio, el arquero debe
	 * utilizar una flecha.
	 * @return El daño realizado
	 */
	@Override
	protected float hacerDanio() {
		flechas --;
		return DANIO;
	}

	/**
	 * Un arquero puede atacar si tiene flechas
	 * y si se encuentra de 2 a 5 de distancia del
	 * objetivo.
	 * @param that Es la Unidad a la que pretende atacar
	 * @return true si puede atacar, false si no puede
	 */
	@Override
	protected boolean puedeAtacar(Unidad that) {
		if(distanciaA(that) >= 2 && distanciaA(that) <= 5 && flechas > 0)
			return true;
		return false;
	}

}
