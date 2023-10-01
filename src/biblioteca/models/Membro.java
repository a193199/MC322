package biblioteca.models;

import java.util.List;

public interface Membro {
    int getQtdadeEmprestimo();
	String getNome();
    int getIdentificacao();
    int getLimiteEmprestimo();
    int getPrazoEmprestimo();
    double getMultaAtraso();
	List<Emprestimo> getHistorico(String string);
}