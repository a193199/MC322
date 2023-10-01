package biblioteca.controllers;

import java.util.List;
import java.util.Map;
import java.util.Set;

import biblioteca.exception.HIstoricoMultaException;
import biblioteca.exception.ItemDanificadoException;
import biblioteca.exception.ItemIndisponivelException;
import biblioteca.exception.ItemNaoRelacionadoException;
import biblioteca.exception.LimiteExcedidoException;
import biblioteca.models.Categoria;
import biblioteca.models.Emprestimo;
import biblioteca.models.ItemMultimidia;
import biblioteca.models.Membro;
import biblioteca.models.Reserva;
import biblioteca.models.ReservaSala;


public interface BibliotecaController {
    List<ItemMultimidia> consultarItensDisponiveis();
    List<Reserva> adiconarReserva(Reserva reserva) throws ItemIndisponivelException, LimiteExcedidoException;
    boolean emprestarItem(Membro membro, ItemMultimidia item) throws LimiteExcedidoException, HIstoricoMultaException;
    boolean devolverItem(Membro membro, ItemMultimidia item) throws ItemNaoRelacionadoException, ItemDanificadoException;
	Map<Integer, ItemMultimidia> adicionarAoMap(int id, ItemMultimidia item);
	Set<Emprestimo> adiconaEmprestimo(Emprestimo emp) throws ItemIndisponivelException;
	Set<Categoria> retornaCategoria();
	void consultarItem(ItemMultimidia item);
	List<Reserva> adiconarReservaSala(ReservaSala item) throws ItemIndisponivelException;
}