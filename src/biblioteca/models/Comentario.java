package biblioteca.models;

public class Comentario {

	private int membroId;
	private int intemId;
	private String texto;

	public Comentario(int membroId, int intemId, String texto) {
		super();
		this.membroId = membroId;
		this.intemId = intemId;
		this.texto = texto;
	}
}
