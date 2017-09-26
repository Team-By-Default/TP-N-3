package warGame;

public class Soldado extends Unidad {

	int energia;
	
	public Soldado() {
		energia=100;
		super.danio=10;
		
	}
	
	@Override
	public void tomarAgua() {
		energia=100;
	}

	@Override
	protected boolean puedeAtacar(Unidad that) {
		if(energia>=10) {
			energia-=10;
			return true;
		}
		return false;
	}

}
