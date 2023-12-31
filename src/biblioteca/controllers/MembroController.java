package biblioteca.controllers;

import java.util.List;

import biblioteca.models.Membro;
import biblioteca.views.MembroView;

public interface MembroController {
    List<Membro> listarMembros();
    Membro buscarMembroPorIdentificacao(int identificacao);
    void adicionar(Membro membro);
    void remover(Membro membro);
}