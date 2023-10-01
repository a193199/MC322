package biblioteca.models;

import java.util.ArrayList;
import java.util.List;

public class MembroImpl implements Membro {
	public String nome;
	public String id;
	List<Emprestimo> historico = new ArrayList<>();
	
	public MembroImpl(String nome, String id, List<Emprestimo>  historico) {
		super();
		this.nome = nome;
		this.id = id;
		this.historico=historico;		
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getIdentificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLimiteEmprestimo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPrazoEmprestimo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMultaAtraso() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getQtdadeEmprestimo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public List<Emprestimo> getHistorico(String titulo) {
		// TODO Auto-generated method stub
		return this.historico;
	}

}
