package biblioteca.exception;

public class ItemNaoRelacionadoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensagem;

	public ItemNaoRelacionadoException(String mensagem) {
        this.mensagem = mensagem;
    }

	@Override
	public String getMessage() {
		return this.mensagem;
	}
}
