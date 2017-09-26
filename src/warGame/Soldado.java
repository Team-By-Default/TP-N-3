package warGame;

public class Soldado extends Unidad {

	int energia;
	
	public Soldado() {
		energia=100;
	}
	
	@Override
	public void tomarAgua() {
		
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
