import java.util.*;

//classe para consultar os itens genéricos da biblioteca

public class ItemMultimidia {
	
	static Scanner sc = new Scanner(System.in);
	String nomeLivro;
	
	//informações básicas do item
	private String titulo;
	private String autor;
	private String editora;
	private GregorianCalendar anoPublicacao;
	private String sinopse;
	private String capa;
	
	//informações adicionais comuns a todos os tipos de itens
	private int totalCopias;		//fisicas ou licenças
	private int totalCopiasDisp; 	//fisicas ou licenças
	private String localizacao; 		//biblioteca ou online
	private String estado;			//estado de conservação
	
	//gerenciamento de item
	private int multa;
	private GregorianCalendar dataRetorno;
	private int qtdadeItens;
	private int tipo;
	int IDMembro;
	int IDItem;
	
	
	public ItemMultimidia(int idItem, int tipo, String titulo, String estado, int IDMembro, 
			int multa, GregorianCalendar dataRetorno, int qtdadeItens,
			String autor, String editora, GregorianCalendar anoPublicacao,
			String sinopse, String capa, int totalCopias, int totalCopiasDisp, String localizacao
			){
		this.IDMembro=IDMembro;
		this.IDItem=idItem;
		this.titulo=titulo;
		this.estado=estado;
		
		this.multa=multa;			
		this.dataRetorno=dataRetorno;
		this.qtdadeItens=qtdadeItens;
		
		this.autor=autor;
		this.editora=editora;
		this.setAnoPublicacao(anoPublicacao);
		this.sinopse=sinopse;
		this.capa=capa;
		this.totalCopias=totalCopias;
		this.totalCopiasDisp=totalCopiasDisp;
		this.localizacao=localizacao;
	
	}
	
	
	public int getIDItem () {
		return IDItem;	
	}

	public void setIDLivro(int idItem) {
		this.IDItem=idItem;
	}
	
	public String getAutor () {
		return autor;	
	}

	public void setAutor(String autor) {
		this.autor=autor;
	}
	
	public int getIDMembro () {
		return IDMembro;	
	}

	public void setIDMembro(int IDMembro) {
		this.IDMembro=IDMembro;
	}


	public String getTitulo () {
		return titulo;	
	}

	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public String getEstado () {
		return estado;	
	}

	public void setEstado(String estado) {
		this.estado=estado;
	}
	
	public int getMulta () {
		return multa;	
	}

	public void setMulta(int multa) {
		this.multa=multa;
	}
	
	public GregorianCalendar getDate () {
		return dataRetorno;	
	}

	public void setDate(GregorianCalendar dataRetorno) {
		this.dataRetorno=dataRetorno;
	}
	
	public int getQtdadeItens () {
		return qtdadeItens;	
	}

	public void setQtdadeItens(int qtdadeItens) {
		this.qtdadeItens=qtdadeItens;
	}
	
	public String getEditora () {
		return editora;	
	}

	public void setEditora(String editora) {
		this.editora=editora;
	}
	
	public String getSinopse () {
		return sinopse;	
	}

	public void setSinopse(String sinopse) {
		this.sinopse=sinopse;
	}
	
	public String getCapa () {
		return capa;	
	}

	public void setCapa(String capa) {
		this.capa=capa;
	}
	
	public int getTotalCopias () {
		return totalCopias;	
	}

	public void setTotalCopias(int totalCopias) {
		this.totalCopias=totalCopias;
	}
	
	public int getTotalCopiasDisp () {
		return totalCopiasDisp;	
	}

	public void setTotalCopiasDisp(int totalCopiasDisp) {
		this.totalCopiasDisp=totalCopiasDisp;
	}
	
	public String getLocalizacao () {
		return localizacao;	
	}

	public GregorianCalendar getAnoPublicacao() {
		return anoPublicacao;
	}


	public void setAnoPublicacao(GregorianCalendar anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public void seLocalizacao(String localizacao) {
		this.localizacao=localizacao;
	}

	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public String cadastrarItem() {
		//System.out.println("Digite o nome do Item: ");
		String nomeItem = sc.nextLine();
		return nomeItem;
	}

}


