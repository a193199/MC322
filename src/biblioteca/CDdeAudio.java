package biblioteca;
import java.util.GregorianCalendar;

public class CDdeAudio extends ItemMultimidia {

	private String listaDeFaixas;
	private int duracao;
	
	public CDdeAudio(int idItem, int tipo, String titulo, String estado, int IDMembro, 
			int multa, GregorianCalendar dataRetorno, int qtdadeItens,
			String autor, String editora, GregorianCalendar anoPublicacao,
			String sinopse, String capa, int totalCopias, int totalCopiasDisp, String localizacao, String listaDeFaixas, int duracao) {
		super(idItem,  tipo,  titulo,  estado,  IDMembro, 
				 multa,  dataRetorno,  qtdadeItens,
				 autor,  editora,  anoPublicacao,
				 sinopse,  capa,  totalCopias,  totalCopiasDisp, localizacao);
		//variáveis específicas
		this.duracao=duracao;
		this.listaDeFaixas=listaDeFaixas;
	}
	
	public int getDuracao () {
		return duracao;	
	}

	public void setDuracao(int duracao) {
		this.duracao=duracao;
	}
	public String getListaDeFaixas () {
		return listaDeFaixas;	
	}

	public void setFormato(String listaDeFaixas) {
		this.listaDeFaixas=listaDeFaixas;
	}
	
	public static void listaDeItens (CDdeAudio [] item, int qtdade) {
		
		   for(int i=0; i < qtdade;i++) {
			   
		   System.out.println("Titulo: " +item[i].getTitulo());
		   System.out.println("Autor: "+ item[i].getAutor());	
		   System.out.println("Editora: "+ item[i].getEditora());	
		   System.out.println("Localizacao: "+ item[i].getLocalizacao());	
		   System.out.println("Status: " +item[i].getEstado());
		   System.out.println("Duracao: " +item[i].getDuracao() + " segundos");
		   System.out.println("Lista de Faixas: " +item[i].getListaDeFaixas());
		}
	}

}
