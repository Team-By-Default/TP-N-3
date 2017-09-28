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
		super(unidad);
	}
	
	/**
	 * Modifica el daño recibido por culpa del escudo, al 40%
	 * @param danio es el daño proveniente del enemigo
	 */
	@Override
	public void recibirDanio(float danio) {
		this.miUnidad.recibirDanio((int)(danio*0.4));
	}
	
	public static void main(String args[]) {
		Unidad alexis =(Unidad)(UnidadConItem) new UnidadConEscudo(new Soldado(0,0));
		//System.out.println(((Soldado)(Unidad)(UnidadConItem)alexis).getEnergia());
	}

}
