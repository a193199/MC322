package biblioteca.models;

public class ItemMultimidiaImpl implements ItemMultimidia {

	private String nome;
	private int ID;
	
	public ItemMultimidiaImpl(String nome, int id) {
		this.nome=nome;
		this.ID=id;
	}
	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDetalhes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getNome() {
		return nome;
	}
	public int getID() {
		return ID;
	}

}
