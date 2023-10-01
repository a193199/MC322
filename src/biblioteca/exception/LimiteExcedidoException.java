package biblioteca.exception;

public class LimiteExcedidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String mensagem;

	    public LimiteExcedidoException(String mensagem) {
	        this.mensagem = mensagem;
	    }

	    @Override
	    public String getMessage() {
	        return this.mensagem;
	    }
}
