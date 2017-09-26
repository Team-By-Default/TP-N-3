package warGame;

public abstract class Unidad {

	protected int salud;
	protected int danio;
	private int posicionX;
	private int posicionY;
	
	public void atacar(Unidad that) {
		if(this.puedeAtacar(that))
			that.recibirDanio(this.hacerDanio());
	}
	protected abstract boolean puedeAtacar(Unidad that);
	protected int hacerDanio() {
		return danio;
	}
	protected void recibirDanio(int danio) {
		this.salud-=danio;
	}
	protected double distanciaA(Unidad that) {
		return Math.sqrt(Math.pow(this.posicionX-that.posicionX,2)+Math.pow(this.posicionY-that.posicionY,2));	
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
