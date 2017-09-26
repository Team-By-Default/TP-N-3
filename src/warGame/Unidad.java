package warGame;

public abstract class Unidad {

	protected int salud;
	protected int danio;
	private int posicionX;
	private int posicionY;
	
	public void atacar(Unidad that) {
		
	}
	protected abstract boolean puedeAtacar(Unidad that);
	protected int hacerDanio() {
		return salud;
	}
	protected void recibirDanio(int danio) {
		
	}
	protected double distanciaA(Unidad that) {
		return 0;	
	}
	public void tomarAgua() {
		return;
	}
	public boolean estaVivo() {
		if(this.salud>0)
			return true;
		return false;
	}
}
