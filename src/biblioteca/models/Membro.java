package biblioteca.models;

public interface Membro {
    String getNome();
    int getIdentificacao();
    int getLimiteEmprestimo();
    int getPrazoEmprestimo();
    double getMultaAtraso();
}