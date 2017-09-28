package warGame;

public class Lancero extends Unidad {
	
	/**
	 * El lancero tiene una salud inicial y tope de
	 * 150 y causa un danio de 25.
	 */
	private final static int SALUDTOPE = 150;
	private final static int DANIO = 25;

	public Lancero() {
		this.moverA(0,0);
		this.setSalud(SALUDTOPE);
		this.setDanio(DANIO);
	}
	
	public Lancero(int x,int y) {
		this.moverA(x, y);
		this.setSalud(SALUDTOPE);
		this.setDanio(DANIO);
	}
	
	/**
	 * El lancero puede atacar si está a una 
	 * distancia entre 1 y 3 del oponente.
	 * @param that Es la Unidad a la que pretende atacar
	 * @return true si puede atacar, false si no puede
	 */
	@Override
	protected boolean puedeAtacar(Unidad that) {
		if(this.distanciaA(that)>=1 && this.distanciaA(that)<=3)
			return true;
		return false;
	}

}
