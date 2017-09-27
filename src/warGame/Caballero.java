package warGame;

public class Caballero extends Unidad {

	/**
	 * Cuando recibe 3 ataques el caballo se asuta
	 * y se pone rebelde. Mientras est� rebelde el
	 * caballero no podr� atacar. El caballo solo se
	 * calma con una poci�n de agua.
	 * El contador caballoNoRebelde empieza en 3 y se
	 * considera rebelde cuando llega a 0.
	 */
	private int caballoNoRebelde;
	
	/**
	 * El caballero tiene una salud inicial y tope de
	 * 200 y causa un danio de 50.
	 */
	private final static int SALUDTOPE = 200;
	private final static int DANIO = 50;
	
	public Caballero() {
		this.caballoNoRebelde=3;
		this.salud = SALUDTOPE;
		this.danio = DANIO;
	}
	
	/**
	 * @return cantidad de ataques restantes para
	 * alterar al caballo
	 */
	public int getCaballoNoRebelde() {
		return this.caballoNoRebelde;
	}
	
	/**
	 * tomarAgua() le da una poci�n de agua al
	 * caballo y lo calma, lo saca del estado rebelde
	 */
	@Override
	public void tomarAgua() {
		this.caballoNoRebelde=3;
	}
	
	/**
	 * El caballero puede atacar si est� a una 
	 * distancia entre 1 y 2 del oponente y si su
	 * caballo no est� rebelde.
	 * @param that Es la Unidad a la que pretende atacar
	 * @return true si puede atacar, false si no puede
	 */
	@Override
	protected boolean puedeAtacar(Unidad that) {
		if(distanciaA(that) >= 1 && distanciaA(that) <= 2 && caballoNoRebelde > 0)
			return true;
		return false;
	}

}
