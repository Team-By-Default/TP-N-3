package warGame;

public class UnidadConPunial extends UnidadConItem {

	/**
	 * @param unidad Es la unidad a la que le va a agregar el item
	 */
	public UnidadConPunial(Unidad unidad) {
		super(0,0);
		this.miUnidad = unidad;
	}
	/**
	 * El pu�al reduce la defensa en 3 puntos, 
	 * es decir, 
	 * aumenta el ataque enemigo en 3 puntos
	 * @param danio Es el da�o base de la unidad
	 */
	@Override
	public void recibirDanio(float danio) {
		this.miUnidad.recibirDanio(danio+3);
	}
	
	/**
	 * Determina si la unidad puede atacar, depende de miUnidad
	 * @param that Es la unidad a la que se dispone a atacar
	 * @return true si puede atacar, false si no
	 */
	@Override
	protected boolean puedeAtacar(Unidad that) {
		return this.miUnidad.puedeAtacar(that);
	}
	/**
	 * El punial aumenta la fuerza de los ataques en 3 puntos
	 * @return El da�o final, sumado el +3 al da�o
	 */
	@Override
	protected float hacerDanio() {
		return this.miUnidad.hacerDanio()+3;
	}

}
