import java.util.Scanner;

//cadastrar livro
//consultar disponibilidade

public class Livro {
	static Scanner sc = new Scanner(System.in);
	String nomeLivro;
	
	private int IDLivro;
	private int IDMembro;
	private String nome;
	private int estado;
	
	
	public Livro(int IDLivro, String nome, int estado, int IDMembro){
		this.IDMembro=IDMembro;
		this.nome=nome;
		this.estado=estado;
		this.IDLivro=IDLivro;

			
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
	
	public int getEstado () {
		return estado;	
	}

	public void setEstado(int estado) {
		this.estado=estado;
	}
	
	public static String cadastrarLivro() {
		
		String nomeLivro = sc.nextLine();
		return nomeLivro;
	}

}


