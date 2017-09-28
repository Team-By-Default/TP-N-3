package warGame;

public class UnidadConCapa extends UnidadConItem {

	/**
	 * @param unidad Es la unidad a la que le va a agregar el item
	 */
	public UnidadConCapa(Unidad unidad) {
		this.miUnidad = unidad;
		if(miUnidad instanceof Soldado) {
			Soldado soldadito = (Soldado) miUnidad;
			soldadito.setEnergiaTope(soldadito.getEnergiaTope() * 2);
		}
	}
	
	/**
	 * Calcula el daño que realiza miUnidad
	 * @return En float el daño que envía la unidad, debilitado por la capa
	 */
	@Override
	protected float hacerDanio() {
		return (float) (miUnidad.hacerDanio()*0.9);
	}

	
}
