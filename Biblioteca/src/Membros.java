//consultar se tem emprestimo e quais sao
//consultar se j� atrasou
import java.util.Scanner;

public class Membros {

	private int ID;
	private String nome;
	private int estado;
	Scanner sc = new Scanner(System.in);
	
	public Membros(int ID, String nome, int estado){
		this.ID=ID;
		this.nome=nome;
		this.estado=estado;
	}
	
	public int getID () {
		return ID;	
	}

	public void setID(int ID) {
		this.ID=ID;
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
	public String cadastrarMembro() {
		System.out.println("Digite o nome do Membro: ");
		String nomeMembro = sc.nextLine();
		return nomeMembro;
	}

}
