package biblioteca.models;
import java.util.GregorianCalendar;

public class Ebook implements ItemMultimidia {
	String formato;
	String URL;
	String requisitos;
	GregorianCalendar dataDisp;
	
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
	@Override
	public Object buscar(long id) {
		return id;
		// TODO Auto-generated method stub
		
	}
	

}
