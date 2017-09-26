package warGame;

public class Soldado extends Unidad {

	/*
	 * La energ�a que le queda a un soldado
	 */
	private int energia;
	
	/*
	 * Un soldado tiene, de inicial y tope, una
	 * energ�a de 100, una salud de 200 y hace un
	 * danio de 10.
	 * Tener en cuenta que si se le asigna una capa
	 * habr� un override y se superar� la energ�a
	 * tope.
	 */
	private static final int SALUDTOPE = 200;
	private static final int ENERGIATOPE = 100;
	private static final int DANIO = 10;
	
	public Soldado() {
		this.energia = ENERGIATOPE;
		this.danio = DANIO;
		this.salud = SALUDTOPE;
	}
	
	/*
	 * tomarAgua() le da una poci�n de agua al
	 * soldado, que le restaura la energ�a.
	 */
	@Override
	public void tomarAgua() {
		energia = ENERGIATOPE;
	}
	
	@Override
	protected int hacerDanio() {
		this.energia -= 10;
		return DANIO;
	}
	
	/*
	 * Un soldado puede atacar si tiene por lo menos
	 * 10 de energ�a y est� cuerpo a cuerpo contra el
	 * objetivo (distancia menor a 2)
	 */
	@Override
	protected boolean puedeAtacar(Unidad that) {
		if(energia>=10 && this.distanciaA(that)<2)
			return true;
		return false;
	}

}
