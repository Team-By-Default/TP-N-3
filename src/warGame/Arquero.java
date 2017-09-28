package warGame;

public class Arquero extends Unidad implements Shooter{

	/**
	 * La cantidad de flechas que posee el personaje.
	 */
	private int flechas;

	/**
	 * Un Arquero tiene, de inicial y tope, una salud de 50 y hace un daño de 5.
	 */
	private static final int SALUDTOPE = 50;
	private static final int DANIO = 5;
	
	/**
	 * El constructor por defecto lo crea en la posición (0,0)
	 */
	public Arquero() {
		this.moverA(0, 0);
		this.setSalud(SALUDTOPE);
		this.setDanio(DANIO);
		flechas=20;
	}
	
	/**
	 * Este constructor crea un arquero en la posición especificada (x,y)
	 * @param x
	 * @param y
	 */
	public Arquero(int x, int y) {
		this.moverA(x, y);
		this.setSalud(SALUDTOPE);
		this.setDanio(DANIO);
		flechas=20;
	}
	
	/**
	 * Por implementar Shooter.
	 * El arquero carga 6 flechas, las cuales vienen en un paquete, y las carga en el carcaj
	 */
	public void cargarFlechas() {
		flechas += 6;
	}
	
	/**
	 * Al infringir danio, el arquero debe utilizar una flecha.
	 * @return El daño realizado
	 */
	@Override
	protected float hacerDanio() {
		this.flechas --;
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
