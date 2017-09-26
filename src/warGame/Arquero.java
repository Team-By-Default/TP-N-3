package warGame;

public class Arquero extends Unidad {

	int flechas;
	
	public Arquero() {
		flechas=20;
	}
	
	public void cargarFlechas() {
		
	}

	@Override
	protected int hacerDanio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected boolean puedeAtacar(Unidad that) {
		// TODO Auto-generated method stub
		return false;
	}

}
