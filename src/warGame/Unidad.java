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
		return Math.sqrt(Math.pow(this.posicionX-that.posicionX,2)+Math.pow(this.posicionY-that.posicionY,2));	
	}
	public void tomarAgua() {
		
	}
	public boolean estaVivo() {
		return true;
	}
}
