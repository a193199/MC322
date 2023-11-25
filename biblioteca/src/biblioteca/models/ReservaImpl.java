package biblioteca.models;

public class ReservaImpl implements Reserva {

	private int idMembro;

	public ReservaImpl(int idMembro) {
		super();
		this.idMembro = idMembro;
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLimite() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getQtdadePessoas() {
		// TODO Auto-generated method stub
		return 0;
	}
}
