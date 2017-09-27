package warGame;

public class UnidadConPunial extends UnidadConItem {

	public UnidadConPunial(Unidad unidad) {
		this.miUnidad = unidad;
	}
	/*
	 * El punial reduce la defensa en 3 puntos
	 */
	@Override
	public void recibirDanio(float danio) {
		this.miUnidad.recibirDanio(danio+3);
	}
	
	@Override
	protected boolean puedeAtacar(Unidad that) {
		return this.miUnidad.puedeAtacar(that);
	}
	/*
	 * El punial aumenta la fuerza de los ataques en 3 puntos
	 */
	@Override
	protected float hacerDanio() {
		return this.miUnidad.hacerDanio()+3;
	}

}
