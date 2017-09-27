package warGame;

public class Soldado extends Unidad {

	/**
	 * La energ�a que le queda a un soldado
	 */
	private int energia;
	
	/**
	 * El m�ximo de energ�a que puede tener.
	 */
	private int energiaTope;
	
	/**
	 * Un soldado tiene, de inicial y tope, una
	 * energ�a de 100, una salud de 200 y hace un
	 * danio de 10.
	 * Tener en cuenta que si se le asigna una capa
	 * habr� un override y se superar� la energ�a
	 * tope.
	 */
	private static final int SALUDTOPE = 200;
	private static final int DANIO = 10;
	
	public Soldado() {
		this.energia = energiaTope = 100;
		this.danio = DANIO;
		this.salud = SALUDTOPE;
	}
	
	/**
	 * UnidadConCapa tiene que poder duplicar la
	 * energiaTope
	 * @param energy: nuevo valor
	 */
	public void setEnergiaTope(int energy) {
		this.energiaTope = energy;
	}
	/**
	 * @return el entero de el maximo de energia
	 */
	public int getEnergiaTope() {
		return this.energiaTope;
	}
	/**
	 * @return el entero de la energia actual
	 */
	public int getEnergia() {
		return this.energia;
	}
	
	/**
	 * tomarAgua() le da una poci�n de agua al
	 * soldado, que le restaura la energ�a.
	 */
	@Override
	public void tomarAgua() {
		energia = energiaTope;
	}
	
	/**
	 * Hacer da�o le quita 10 puntos de energ�a
	 * @return El da�o realizado
	 */
	@Override
	protected float hacerDanio() {
		this.energia -= 10;
		return DANIO;
	}
	
	/**
	 * Un soldado puede atacar si tiene por lo menos
	 * 10 de energ�a y est� cuerpo a cuerpo contra el
	 * objetivo (distancia menor a 2)
	 * @param that Es la Unidad a la que pretende atacar
	 * @return true si puede atacar, false si no puede
	 */
	@Override
	protected boolean puedeAtacar(Unidad that) {
		if(energia>=10 && this.distanciaA(that)<2)
			return true;
		return false;
	}
}
