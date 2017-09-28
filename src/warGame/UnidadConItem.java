package warGame;
/**
 * Decorador
 * @author alexis
 * @param miUnidad Es la unidad a ser modificada
 */
public abstract class UnidadConItem extends Unidad {

	protected Unidad miUnidad;
	
	public UnidadConItem(Unidad miUnidad){
		super(0,0);
	    this.miUnidad = miUnidad;
	}
	/**
	 * Se trata de el ataque en cuestion, que usar�a el que desarrolle la batalla.
	 * @param that Es la unidad a la que se ataca
	 * @return true si logr� atacar, false si no lo logr�
	 */
	public boolean atacar(Unidad that) {
		return miUnidad.atacar(that);
	}
	/**
	 * Depende de cada unidad, me dice si tengo la posibilidad de atacar
	 * @param that Es la unidad a la que se ataca
	 * @return Retorna true si puede atacar
	 */
	protected boolean puedeAtacar(Unidad that) {
		return miUnidad.puedeAtacar(that);
	}
	/**
	 * Calcula el da�o que se entrega al enemigo
	 * @return El da�o en enteros
	 */
	protected float hacerDanio() {
		return miUnidad.hacerDanio();
	}
	/**
	 * Calcula el da�o final recibido por un ataque
	 * @param danio Es el da�o del enemigo
	 */
	protected void recibirDanio(float danio) {
		miUnidad.recibirDanio(danio);
	}
	/**
	 * Calcula la distancia entre la Unidad y otra Unidad
	 * @param that Es una Unidad
	 * @return La distancia en double entre ambas unidades
	 */
	protected double distanciaA(Unidad that) {
		return miUnidad.distanciaA(that);
	}
	/**
	 * Ve los efectos de tomar agua, por defecto, ninguno
	 */
	public void tomarAgua() {
		miUnidad.tomarAgua();
	}
	/**
	 * Nos avisa si nuestra Unidad sigue con vida
	 * @return true si est� vivo, false si est� muerto
	 */
	public boolean estaVivo() {
		return miUnidad.estaVivo();
	}
	/**
	 * @return La salud restante en float
	 */
	public float getSalud() {
		return miUnidad.getSalud();
	}

}
