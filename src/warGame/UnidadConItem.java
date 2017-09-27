package warGame;
/**
 * Decorador
 * @author alexis
 * @param miUnidad Es la unidad a ser modificada
 */
public abstract class UnidadConItem extends Unidad {

	Unidad miUnidad;
	
	public UnidadConItem(int x,int y) {
		super(x,y);
	}

}
