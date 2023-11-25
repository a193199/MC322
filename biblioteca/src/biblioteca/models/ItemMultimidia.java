package biblioteca.models;

public interface ItemMultimidia {
    String getTitulo();
    String getDetalhes();
	String getStatus();
	Object buscar(long id);
	
}