package warGame;

public abstract class Unidad {

	protected int salud;
	private int posicionX;
	private int posicionY;
	
	public void atacar(Unidad that) {
		
	}
	protected abstract boolean puedeAtacar(Unidad that);
	protected abstract int hacerDanio();
	protected void recibirDanio(int danio) {
		
	}
	protected double distanciaA(Unidad that) {
		return 0;	
	}
	public void tomarAgua() {
		
	}
	public boolean estaVivo() {
		return true;
	}
}
