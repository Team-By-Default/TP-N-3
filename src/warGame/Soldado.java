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