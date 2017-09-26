package warGame;

public class Caballero extends Unidad {

	/*
	 * Cuando recibe 3 ataques el caballo se asuta
	 * y se pone rebelde. Mientras esté rebelde el
	 * caballero no podrá atacar. El caballo solo se
	 * calma con una poción de agua.
	 * El contador caballoNoRebelde empieza en 3 y se
	 * considera rebelde cuando llega a 0.
	 */
	private int caballoNoRebelde;
	
	/*
	 * El caballero tiene una salud inicial y tope de
	 * 200 y causa un danio de 50.
	 */
	private final static int SALUDTOPE = 200;
	private final static int DANIO = 50;
	
	public Caballero() {
		this.caballoNoRebelde=3;
		this.salud = SALUDTOPE;
	}
	
	/*
	 * tomarAgua() le da una poción de agua al
	 * caballo y lo calma, lo saca del estado rebelde
	 */
	@Override
	public void tomarAgua() {
		this.caballoNoRebelde=3;
	}
	
	/*
	 * (non-Javadoc)
	 * @see warGame.Unidad#hacerDanio()
	 */
	@Override
	protected int hacerDanio() {
		return DANIO;
	}
	
	/*
	 * El caballero puede atacar si está a una 
	 * distancia entre 1 y 2 del oponente y si su
	 * caballo no está rebelde.
	 */
	@Override
	protected boolean puedeAtacar(Unidad that) {
		if(distanciaA(that) >= 1 && distanciaA(that) <= 2 && caballoNoRebelde > 0)
			return true;
		return false;
	}

}
