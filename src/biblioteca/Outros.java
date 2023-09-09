package biblioteca;
import java.util.GregorianCalendar;

public class Outros extends ItemMultimidia {
	private String tipoRecurso;
	private String formato;

	public Outros(int idItem, int tipo, String titulo, String estado, int IDMembro, 
			int multa, GregorianCalendar dataRetorno, int qtdadeItens,
			String autor, String editora, GregorianCalendar anoPublicacao,
			String sinopse, String capa, int totalCopias, int totalCopiasDisp, String localizacao,
			String tipoRecurso, String formato) {
		//chama o construtor da superclasse
		super(idItem,  tipo,  titulo,  estado,  IDMembro, 
				 multa,  dataRetorno,  qtdadeItens,
				 autor,  editora,  anoPublicacao,
				 sinopse,  capa,  totalCopias,  totalCopiasDisp, localizacao);
		//variáveis específicas da claase
			this.tipoRecurso=tipoRecurso;
			this.formato=formato;
		
	}
	
	//gets e sets especificos da classe
	public String getTipoRecurso () {
		return tipoRecurso;	
	}

	public void setTipoRecurso(String tipoRecurso) {
		this.tipoRecurso=tipoRecurso;
	}
	public String getFormato () {
		return formato;	
	}

	public void setFormato(String formato) {
		this.formato=formato;
	}
	
	public static void listaDeItens (Outros [] item, int qtdade) {
		
		   for(int i=0; i < qtdade;i++) {
			   
		   System.out.println("Titulo: " +item[i].getTitulo());
		   System.out.println("Autor: "+ item[i].getAutor());	
		   System.out.println("Editora: "+ item[i].getEditora());	
		   System.out.println("Localizacao: "+ item[i].getLocalizacao());	
		   System.out.println("Status: " +item[i].getEstado());
		   System.out.println("Recurso: " +item[i].getTipoRecurso());
		   System.out.println("Formato: " +item[i].getFormato());
		}
	}
}
