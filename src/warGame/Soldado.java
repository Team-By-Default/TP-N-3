package warGame;

public class Soldado extends Unidad {

	/**
	 * La energía que le queda a un soldado
	 */
	private int energia;
	
	/**
	 * El máximo de energía que puede tener.
	 */
	private int energiaTope;
	
	/**
	 * Un soldado tiene, de inicial y tope, una energía de 100, una salud de 200 y hace un danio
	 * de 10. Tener en cuenta que si se le asigna una capa se modificará la energía tope.
	 */
	private static final int SALUDTOPE = 200;
	private static final int DANIO = 10;
	
	public Soldado(int x,int y) {
		this.moverA(x, y);
		this.energia = energiaTope = 100;
		this.setSalud(SALUDTOPE);
		this.setDanio(DANIO);
	}
	
	/**
	 * UnidadConCapa tiene que poder duplicar la energiaTope
	 * @param energy: nuevo valor
	 */
	protected void setEnergiaTope(int energy) {
		this.energiaTope = energy;
	}
	
	/**
	 * @return el entero del maximo de energia
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
	 * tomarAgua() le da una poción de agua al soldado, que le restaura la energía.
	 */
	@Override
	public void tomarAgua() {
		energia = energiaTope;
	}
	
	/**
	 * Hacer daño le quita 10 puntos de energía
	 * @return El daño realizado
	 */
	@Override
	protected float hacerDanio() {
		this.energia -= 10;
		return DANIO;
	}
	
	/**
	 * Un soldado puede atacar si tiene por lo menos 10 de energía y está cuerpo a cuerpo contra el
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
