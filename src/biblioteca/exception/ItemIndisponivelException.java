package biblioteca.exception;

public class ItemIndisponivelException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensagem;

	public ItemIndisponivelException(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String getMessage() {
		return this.mensagem;

	}
}
