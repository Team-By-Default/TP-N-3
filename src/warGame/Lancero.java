package warGame;

public class Lancero extends Unidad {

	public Lancero() {
		this.salud=150;
	}

	@Override
	protected int hacerDanio() {
		return 25;
	}

	@Override
	protected boolean puedeAtacar(Unidad that) {
		if(this.distanciaA(that)>1 && this.distanciaA(that)<3)
			return true;
		return false;
	}

}
