package biblioteca.models;

public class FuncionarioLogin {
	
	private String login;
	private int senha;
	private boolean permissao;
	
	public FuncionarioLogin(String login, int senha, boolean permissao) {
	
		this.senha=senha;
		this.login=login;
		this.permissao=permissao;
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
