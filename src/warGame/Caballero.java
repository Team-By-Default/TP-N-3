package warGame;

public class Caballero extends Unidad {

	int caballoRebelde;
	
	public Caballero() {
		caballoRebelde=3;
	}
	
	@Override
	public void tomarAgua() {
		caballoRebelde=3;
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
