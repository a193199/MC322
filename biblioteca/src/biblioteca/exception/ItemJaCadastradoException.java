package biblioteca.exception;

public class ItemJaCadastradoException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensagem;

	public ItemJaCadastradoException(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String getMessage() {
		return this.mensagem;

	}
}
