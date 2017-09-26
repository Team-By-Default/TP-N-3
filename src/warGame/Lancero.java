package warGame;

public class Lancero extends Unidad {
	
	private final static int SALUDTOPE = 150;
	private final static int DANIO = 25;

	public Lancero() {
		this.salud=SALUDTOPE;
		this.danio=DANIO;
	}

	@Override
	protected int hacerDanio() {
		return this.danio;
	}

	@Override
	protected boolean puedeAtacar(Unidad that) {
		if(this.distanciaA(that)>1 && this.distanciaA(that)<3)
			return true;
		return false;
	}

}
