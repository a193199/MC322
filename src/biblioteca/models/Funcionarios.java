//consultar cargo
//consultar faltas
//consultar sal�rio
package biblioteca.models;

public class Funcionarios {

	private int ID;
	private String nome;
	private int salario;
	private String cargo;
	private String login;
	private int senha;
	private boolean permissao;

	public Funcionarios(int ID, String cargo, String nome, int salario, String login, int senha, boolean permissao) {
		this.ID = ID;
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		this.senha=senha;
		this.login=login;
		this.permissao=permissao;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean getPermissao() {
		return permissao;
	}
}
