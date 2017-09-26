package warGame;

public class UnidadConEscudo extends UnidadConItem {

	public UnidadConEscudo(Unidad unidad) {
		super.miUnidad=unidad;
	}
	
	@Override
	protected boolean puedeAtacar(Unidad That) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void recibirDanio(int danio) {
		
	}

}
