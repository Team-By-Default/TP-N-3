package warGame;
/**
 * Decorador encargado del escudo
 * @author alexis
 * 
 */
public class UnidadConEscudo extends UnidadConItem {

	/**
	 * @param unidad Es la unidad a la que le va a agregar el item
	 */
	public UnidadConEscudo(Unidad unidad) {
		this.miUnidad=unidad;
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
	 * Modifica el da�o recibido por culpa del escudo, al 40%
	 * @param danio es el da�o proveniente del enemigo
	 */
	@Override
	public void recibirDanio(float danio) {
		this.miUnidad.recibirDanio((int)(danio*0.4));
	}

}
