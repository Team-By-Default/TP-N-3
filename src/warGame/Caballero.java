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
	protected boolean puedeAtacar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected int hacerDanio() {
		// TODO Auto-generated method stub
		return 0;
	}

}
