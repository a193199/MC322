package biblioteca.controllers;

import java.util.List;
import java.util.Map;
import java.util.Set;

import biblioteca.models.Categoria;
import biblioteca.models.Emprestimo;
import biblioteca.models.ItemMultimidia;
import biblioteca.models.Membro;
import biblioteca.models.Reserva;

public interface BibliotecaController {
    List<ItemMultimidia> consultarItensDisponiveis();
    List<Reserva> adiconarReserva(Reserva reserva);
    boolean emprestarItem(Membro membro, ItemMultimidia item);
    boolean devolverItem(Membro membro, ItemMultimidia item);
	Map<Integer, ItemMultimidia> adicionarAoMap(int id, ItemMultimidia item);
	Set<Emprestimo> adiconaEmprestimo(Emprestimo emp);
	Set<Categoria> retornaCategoria();
}