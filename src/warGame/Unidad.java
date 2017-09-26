package warGame;

/**
 * 
 * @author alexis
 * @param salud Es la salud total de la unidad
 * @param danio Es el daño que hace la clase por defecto
 * @param posicionX Es la posicion en X de la unidad
 * @param posicionY Es la posicion en Y de la unidad 
 */
public abstract class Unidad {

	protected int salud;
	protected int danio;
	private int posicionX;
	private int posicionY;
	/**
	 * Se trata de el ataque en cuestion, que usaría el que desarrolle la batalla.
	 * @param that Es la unidad a la que se ataca
	 */
	public void atacar(Unidad that) {
		if(this.puedeAtacar(that))
			that.recibirDanio(this.hacerDanio());
	}
	/**
	 * Depende de cada unidad, me dice si tengo la posibilidad de atacar
	 * @param that Es la unidad a la que se ataca
	 * @return Retorna true si puede atacar
	 */
	protected abstract boolean puedeAtacar(Unidad that);
	/**
	 * Calcula el daño que se entrega al enemigo
	 * @return El daño en enteros
	 */
	protected int hacerDanio() {
		return danio;
	}
	/**
	 * Calcula el daño final recibido por un ataque
	 * @param danio Es el daño del enemigo
	 */
	protected void recibirDanio(int danio) {
		this.salud-=danio;
	}
	/**
	 * Calcula la distancia entre la Unidad y otra Unidad
	 * @param that Es una Unidad
	 * @return La distancia en double entre ambas unidades
	 */
	protected double distanciaA(Unidad that) {
		return Math.sqrt(Math.pow(this.posicionX-that.posicionX,2)+Math.pow(this.posicionY-that.posicionY,2));	
	}
	/**
	 * Ve los efectos de tomar agua, por defecto, ninguno
	 */
	public void tomarAgua() {
		return;
	}
	/**
	 * Nos avisa si nuestra Unidad sigue con vida
	 * @return true si está vivo, false si está muerto
	 */
	public boolean estaVivo() {
		if(this.salud>0)
			return true;
		return false;
	}
}
