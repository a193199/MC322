package biblioteca.exception;

public class AcessoNegadoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensagem;

	public AcessoNegadoException(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String getMessage() {
		return this.mensagem;

	}
}
