package biblioteca;
import java.util.GregorianCalendar;

public class DVDdeVideo extends ItemMultimidia {
	private String elenco;
	private int duracao;
	private String legenda;
	private String sinopse;

	public DVDdeVideo(int idItem, int tipo, String titulo, String estado, int IDMembro, 
			int multa, GregorianCalendar dataRetorno, int qtdadeItens,
			String autor, String editora, GregorianCalendar anoPublicacao,
			String sinopse, String capa, int totalCopias, int totalCopiasDisp, String localizacao, String elenco, int duracao, String legenda) {
		super(idItem,  tipo,  titulo,  estado,  IDMembro, 
				 multa,  dataRetorno,  qtdadeItens,
				 autor,  editora,  anoPublicacao,
				 sinopse,  capa,  totalCopias,  totalCopiasDisp, localizacao);
		// TODO Auto-generated constructor stub
		this.elenco=elenco;
		this.duracao=duracao;
		this.legenda=legenda;
		this.sinopse=sinopse;
	}
	
	public int getDuracao () {
		return duracao;	
	}

	public void setDuracao(int duracao) {
		this.duracao=duracao;
	}
	public String getElenco () {
		return elenco;	
	}

	public void setElenco(String elenco) {
		this.elenco=elenco;
	}
	public String getLegenda () {
		return legenda;	
	}

	public void setLegenda(String legenda) {
		this.legenda=legenda;
	}
	public String getSinopse () {
		return sinopse;	
	}

	public void setSinopse(String sinopse) {
		this.sinopse=sinopse;
	}
	
	public static void listaDeItens (DVDdeVideo [] item, int qtdade) {
		
		   for(int i=0; i < qtdade;i++) {
			   
		   System.out.println("Titulo: " +item[i].getTitulo());
		   System.out.println("Autor: "+ item[i].getAutor());	
		   System.out.println("Editora: "+ item[i].getEditora());	
		   System.out.println("Localizacao: "+ item[i].getLocalizacao());	
		   System.out.println("Status: " +item[i].getEstado());
		   System.out.println("Duração: " +item[i].getDuracao()+" minutos");
		   System.out.println("Legenda: " +item[i].getLegenda());
		   System.out.println("Elenco: " +item[i].getElenco());
		   System.out.println("Sinopse: " +item[i].getSinopse());
		}
	}

}
