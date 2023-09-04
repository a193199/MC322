import java.util.GregorianCalendar;

public class Livro extends ItemMultimidia {
	private int isbn;
	private int edicao;

	public Livro(int idItem, int tipo, String titulo, String estado, int IDMembro, 
			int multa, GregorianCalendar dataRetorno, int qtdadeItens,
			String autor, String editora, GregorianCalendar anoPublicacao,
			String sinopse, String capa, int totalCopias, int totalCopiasDisp, String localizacao,
			int isbn, int edicao) {
		super(idItem,  tipo,  titulo,  estado,  IDMembro, 
				 multa,  dataRetorno,  qtdadeItens,
				 autor,  editora,  anoPublicacao,
				 sinopse,  capa,  totalCopias,  totalCopiasDisp, localizacao);
		//variáveis especificas da classe
		this.edicao=edicao;
		this.isbn=isbn;
	}

	public int getEdicao () {
		return edicao;	
	}

	public void setEdicao (int edicao) {
		this.edicao=edicao;
	}
	
	public int getIsbn () {
		return isbn;	
	}

	public void setIsbn(int isbn) {
		this.isbn=isbn;
	}
	
	public static void listaDeItens (Livro [] item, int qtdade) {
		
		   for(int i=0; i < qtdade;i++) {
			   
		   System.out.println("Titulo: " +item[i].getTitulo());
		   System.out.println("Autor: "+ item[i].getAutor());	
		   System.out.println("Editora: "+ item[i].getEditora());	
		   System.out.println("Localizacao: "+ item[i].getLocalizacao());	
		   System.out.println("Status: " +item[i].getEstado());
		   System.out.println("Edição: " +item[i].getEdicao());
		   System.out.println("ISBN: " +item[i].getIsbn());
		}
	}
	
	public String cadastrarItem() {
		//System.out.println("Digite o nome do Item: ");
		String nomeItem = sc.nextLine();
		return nomeItem;
	}
	
}
