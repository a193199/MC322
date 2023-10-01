package biblioteca.controllers;

import java.util.List;

import biblioteca.exception.AcessoNegadoException;
import biblioteca.exception.LimiteExcedidoException;
import biblioteca.models.Funcionarios;

public interface FuncionarioController {
	public List<Funcionarios> getFuncionarios();
	public boolean acessoAoSistema(Funcionarios funcionario, String login, int senha) throws AcessoNegadoException;
	
}
