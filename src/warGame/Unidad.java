package warGame;

/**
 * La unidad basica, representa a todas las unidades, incluida UnidadConItem
 * @author alexis
 * @param salud Es la salud actual de la unidad
 * @param danio Es el daño que hace la unidad en un ataque por defecto
 * @param posicionX Es la posicion en X de la unidad
 * @param posicionY Es la posicion en Y de la unidad 
 */
public abstract class Unidad {

	//Vuelvo todas private y hago getters y setters (Vale)
	private float salud;
	private float danio;
	private int posicionX;
	private int posicionY;
	
	/*Es una clase abstracta, no debería tener constructor, no es instanciable... (Vale)
	 * Hago moverA(x,y) que setea la posición.
	public Unidad(int x,int y) {
		this.posicionX=x;
		this.posicionY=y;
	}*/
	
	/**
	 * Getters y setters para salud y danio
	 * La salud y el danio se pueden ver públicamente, pero solo las clases hijas pueden setearlos
	 */
	public float getSalud() {
		return this.salud;
	}
	
	protected void setSalud(float health) {
		this.salud = health;
	}
	
	public float getDanio() {
		return this.danio;
	}
	
	protected void setDanio(float danio) {
		this.danio = danio;
	}
	
	/**
	 * Mover a la unidad a la nueva posición con coordenadas X e Y	
	 * @param x
	 * @param y
	 */
	public void moverA(int x, int y) {
		this.posicionX = x;
		this.posicionY = y;
	}
	
	/**
	 * Se trata de el ataque en cuestion, que usaría el que desarrolle la batalla.
	 * @param that Es la unidad a la que se ataca
	 * @return true si logró atacar, false si no lo logró
	 */
	public boolean atacar(Unidad that) {
		if(this.estaVivo() && this.puedeAtacar(that)) {
			that.recibirDanio(this.hacerDanio());
			return true;
		}
		return false;
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
	protected float hacerDanio() {
		return danio;
	}
	
	/**
	 * Calcula el daño final recibido por un ataque
	 * @param danio Es el daño del enemigo
	 */
	protected void recibirDanio(float danio) {
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
	 * Nos avisa si nuestra Unidad sigue con vida
	 * @return true si está vivo, false si está muerto
	 */
	public boolean estaVivo() {
		if(this.salud>0)
			return true;
		return false;
	}
}
