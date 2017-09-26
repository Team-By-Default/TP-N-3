package warGame;

public class UnidadConEscudo extends UnidadConItem {

	public UnidadConEscudo(Unidad unidad) {
		
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
	
	@Override
	public void recibirDanio(int danio) {
		
	}

}
