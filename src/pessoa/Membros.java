//consultar se tem emprestimo e quais sao
//consultar se j� atrasou
package pessoa;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Membros {

	private int ID;
	private String nome;
	private String nomeInstituicao;
	private String endereco;
	private GregorianCalendar dataRegistro;
	private int estado;
	private int tipo;
	private int limite;
	
	Scanner sc = new Scanner(System.in);
	
	public Membros(int ID, String nome, int estado, String nomeInstituicao, String endereco,
				   GregorianCalendar dataRegistro, int tipo){
		this.ID=ID;
		this.nome=nome;
		this.nomeInstituicao =nomeInstituicao;
		this.estado=estado;
		this.endereco=endereco;
		this.dataRegistro=dataRegistro;
		this.tipo=tipo;
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
	public int getTipo () {
		return tipo;	
	}

	public void setTipo(int tipo) {
		this.tipo=tipo;
	}
	
	public String getNomeInstituicao () {
		return nomeInstituicao;	
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao=nomeInstituicao;
	}
	
	public String getEndereco () {
		return endereco;	
	}

	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
	
	public GregorianCalendar getDataRegistro () {
		return dataRegistro;	
	}

	public void setDataRegistro(GregorianCalendar dataRegistro) {
		this.dataRegistro=dataRegistro;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
	public String cadastrarMembro() {
		System.out.println("Digite o nome do Membro: ");
		String nomeMembro = sc.nextLine();
		return nomeMembro;
	}

}
