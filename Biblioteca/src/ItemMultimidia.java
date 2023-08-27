import java.util.*;

//classe para consultar os itens genéricos da biblioteca

public class ItemMultimidia {
	
	static Scanner sc = new Scanner(System.in);
	String nomeLivro;
	
	private int tipo;
	private int idItem;
	private int IDMembro;
	private String nome;
	private String estado;
	private int multa;
	private GregorianCalendar dataRetorno;
	private int qtdadeItens;
	
	
	public ItemMultimidia(int idItem, int tipo, String nome, String estado, int IDMembro, int multa, GregorianCalendar dataRetorno, int qtdadeItens){
		this.IDMembro=IDMembro;
		this.nome=nome;
		this.estado=estado;
		this.idItem=idItem;
		this.tipo=tipo; //variaveis para representar o tipo de item multimidia que está sendo manipulado
		this.multa=multa;			
		this.dataRetorno=dataRetorno;
		this.qtdadeItens=qtdadeItens;
	}
	
	public int getIDItem () {
		return idItem;	
	}

	public void setIDLivro(int idItem) {
		this.idItem=idItem;
	}
	
	public int getTipo () {
		return tipo;	
	}

	public void setTipo(int tipo) {
		this.tipo=tipo;
	}
	
	public int getIDMembro () {
		return IDMembro;	
	}

	public void setIDMembro(int IDMembro) {
		this.IDMembro=IDMembro;
	}


	public String getNome () {
		return nome;	
	}

	public void setNome(String nome) {
		this.nome=nome;
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
	
	public String cadastrarItem() {
		System.out.println("Digite o nome do Item: ");
		String nomeItem = sc.nextLine();
		return nomeItem;
	}

}


