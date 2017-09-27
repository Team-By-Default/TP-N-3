package warGame;

public class UnidadConCapa extends UnidadConItem {

	/**
	 * @param unidad Es la unidad a la que le va a agregar el item
	 */
	public UnidadConCapa(Unidad unidad) {
		super(0,0);
		this.miUnidad = unidad;
		if(miUnidad instanceof Soldado) {
			Soldado soldadito = (Soldado) miUnidad;
			soldadito.setEnergiaTope(soldadito.getEnergiaTope() * 2);
		}
	}
	
	/**
	 * Determina si la unidad puede atacar, depende de miUnidad
	 * @param that Es la unidad a la que se dispone a atacar
	 * @return true si puede atacar, false si no
	 */
	protected boolean puedeAtacar(Unidad that) {
		return miUnidad.puedeAtacar(that);
	}
	/**
	 * Calcula el daño que realiza miUnidad
	 * @return En float el daño que envía la unidad
	 */
	@Override
	protected float hacerDanio() {
		return (float) (miUnidad.hacerDanio()*0.9);
	}

	
}
