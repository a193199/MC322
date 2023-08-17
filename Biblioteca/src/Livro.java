import java.util.*;


//cadastrar livro
//consultar disponibilidade

public class Livro {
	static Scanner sc = new Scanner(System.in);
	String nomeLivro;
	
	private int IDLivro;
	private int IDMembro;
	private String nome;
	private String estado;
	private int preco;
	private GregorianCalendar dataRetorno;
	
	
	public Livro(int IDLivro, String nome, String estado, int IDMembro, int preco, GregorianCalendar dataRetorno){
		this.IDMembro=IDMembro;
		this.nome=nome;
		this.estado=estado;
		this.IDLivro=IDLivro;
		this.preco=preco;			
		this.dataRetorno=dataRetorno;
	}
	
	public int getIDLivro () {
		return IDLivro;	
	}

	public void setIDLivro(int IDLivro) {
		this.IDLivro=IDLivro;
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
	
	public int getPreco () {
		return preco;	
	}

	public void setPreco(int preco) {
		this.preco=preco;
	}
	
	public GregorianCalendar getDate () {
		return dataRetorno;	
	}

	public void setDate(GregorianCalendar dataRetorno) {
		this.dataRetorno=dataRetorno;
	}
	
	public static String cadastrarLivro() {
		
		String nomeLivro = sc.nextLine();
		return nomeLivro;
	}

}


