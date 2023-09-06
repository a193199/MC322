import java.util.GregorianCalendar;

public class Ebook extends ItemMultimidia {
	String formato;
	String URL;
	String requisitos;
	GregorianCalendar dataDisp;
	
	public Ebook(int idItem, int tipo, String titulo, String estado, int IDMembro, 
			int multa, GregorianCalendar dataRetorno, int qtdadeItens,
			String autor, String editora, GregorianCalendar anoPublicacao,
			String sinopse, String capa, int totalCopias, int totalCopiasDisp, String localizacao,
			String formato, String URL, String requisitos, GregorianCalendar dataDisp) {
		super(idItem,  tipo,  titulo,  estado,  IDMembro, 
				 multa,  dataRetorno,  qtdadeItens,
				 autor,  editora,  anoPublicacao,
				 sinopse,  capa,  totalCopias,  totalCopiasDisp, localizacao);
		// variaveis especificas
		this.dataDisp=dataDisp;
		this.URL=URL;
		this.requisitos=requisitos;
		this.formato=formato;
	}
	
	public GregorianCalendar getDataDisp () {
		return dataDisp;	
	}

	public void setDataDisp(GregorianCalendar dataDisp) {
		this.dataDisp=dataDisp;
	}
	public String getUrl () {
		return URL;	
	}

	public void setUrl(String URL) {
		this.URL=URL;
	}
	public String getRequisitos() {
		return requisitos;	
	}

	public void setRequisitos(String requisitos) {
		this.requisitos=requisitos;
	}
	public String getFormato () {
		return formato;	
	}

	public void setFormato(String formato) {
		this.formato=formato;
	}
	
	public static void listaDeItens (Ebook [] item, int qtdade) {
		
		   for(int i=0; i < qtdade;i++) {
			   
		   System.out.println("Titulo: " +item[i].getTitulo());
		   System.out.println("Autor: "+ item[i].getAutor());	
		   System.out.println("Editora: "+ item[i].getEditora());	
		   System.out.println("Localizacao: "+ item[i].getLocalizacao());	
		   System.out.println("Status: " +item[i].getEstado());
		   System.out.println("Data de disponibilidade: " +item[i].getDataDisp().getTime());
		   System.out.println("URL: " +item[i].getUrl());
		   System.out.println("Requisito: " +item[i].getRequisitos());
		   System.out.println("Formato: " +item[i].getFormato());
		}
	}

}
