package warGame;

public class UnidadConCapa extends UnidadConItem {

	public UnidadConCapa(Unidad unidad) {
		this.miUnidad = unidad;
		if(miUnidad instanceof Soldado) {
			Soldado soldadito = (Soldado) miUnidad;
			soldadito.setEnergiaTope(soldadito.getEnergiaTope() * 2);
		}
	}
	
	protected boolean puedeAtacar(Unidad that) {
		return miUnidad.puedeAtacar(that);
	}
	
	@Override
	protected int hacerDanio() {
		return miUnidad.hacerDanio() * 0.9;
	}

	
}
