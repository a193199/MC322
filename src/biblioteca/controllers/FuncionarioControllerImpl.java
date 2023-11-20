package biblioteca.controllers;

import java.util.LinkedList;
import java.util.List;

import biblioteca.exception.AcessoNegadoException;
import biblioteca.models.FuncionarioLogin;
import biblioteca.models.Funcionarios;

public class FuncionarioControllerImpl implements FuncionarioController {
	private List<Funcionarios> funcionarios;

	public FuncionarioControllerImpl() {
		funcionarios = new LinkedList<>();
	}

	public List<Funcionarios> getFuncionarios() {
		return funcionarios;
	}

	@Override
	public boolean acessoAoSistema(FuncionarioLogin funcionario, String login, int senha) throws AcessoNegadoException {
		if (funcionario.getSenha() != senha || funcionario.getLogin() != login) {
			throw new AcessoNegadoException("Acesso negado, verifique login e senha");
		} else if (!funcionario.getPermissao()) {
			throw new AcessoNegadoException("Acesso negado, você não tem permissão para acessar essa aplicação");
		}
		return true;
	}

}
