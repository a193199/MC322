package biblioteca.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import biblioteca.exception.HIstoricoMultaException;
import biblioteca.exception.ItemDanificadoException;
import biblioteca.exception.ItemIndisponivelException;
import biblioteca.exception.ItemJaCadastradoException;
import biblioteca.exception.ItemNaoRelacionadoException;
import biblioteca.exception.LimiteExcedidoException;
import biblioteca.models.Categoria;
import biblioteca.models.Emprestimo;
import biblioteca.models.ItemMultimidia;
import biblioteca.models.Membro;
import biblioteca.models.Reserva;
import biblioteca.models.ReservaSala;

public class BibliotecaControllerImpl implements BibliotecaController {

	private List<ItemMultimidia> itens;
	private List<Reserva> reserva;
	private Set<Emprestimo> emprestimo;
	private Set<Categoria> categoria;
	private Map<Integer, ItemMultimidia> mapa;

	public BibliotecaControllerImpl() {
		itens = new ArrayList<>();
		reserva = new ArrayList<>();
		mapa = new HashMap<>();
		emprestimo = new HashSet<>();
		categoria = new HashSet<>();
	}

	@Override
	public List<ItemMultimidia> consultarItensDisponiveis() {
		return itens;
	}

	@Override
	public boolean emprestarItem(Membro membro, ItemMultimidia item)
			throws LimiteExcedidoException, HIstoricoMultaException {
		if (membro.getQtdadeEmprestimo() > membro.getLimiteEmprestimo()) {
			throw new LimiteExcedidoException("Limite de emprestimos excedido");
		} else if (membro.getMultaAtraso() > 0) {
			throw new HIstoricoMultaException("Multa pendente. Regularize a situação");
		}
		return true;
	}

	@Override
	public boolean devolverItem(Membro membro, ItemMultimidia item)
			throws ItemNaoRelacionadoException, ItemDanificadoException {
		if (membro.getHistorico(item.getTitulo()) == null) { // caso não consiga encontrar o item no histórico do membro
			throw new ItemNaoRelacionadoException("Item não relacionado ao membro. Digite o item correto");
		} else if (item.getStatus() == "danificado") {
			throw new ItemDanificadoException("Item danificado, procure a administração");
		}
		return true;
	}

	@Override
	public Map<Integer, ItemMultimidia> adicionarAoMap(int id, ItemMultimidia item) throws ItemJaCadastradoException {
		if (mapa.get(item) != null) {
			throw new ItemJaCadastradoException("Item já cadastrado ao banco de dados");
		}
		this.mapa.put(id, item);
		return mapa;

	}

	@Override
	public Set<Emprestimo> adiconaEmprestimo(Emprestimo item) throws ItemIndisponivelException {
		if (item.getStatus() == "disponivel") {
			this.emprestimo.add(item);
		} else {
			this.reserva.add((Reserva) item);
			throw new ItemIndisponivelException("Este item não está disponível, adicionamos a reserva.");
		}

		return emprestimo;
	}

	@Override
	public List<Reserva> adiconarReserva(Reserva item) throws ItemIndisponivelException, LimiteExcedidoException {
		if (item.getStatus() != "disponivel") {
			throw new ItemIndisponivelException("Este item não está disponível, adicionamos a reserva.");
		} else if (item.getQtdadePessoas() == item.getLimite()) {
			throw new LimiteExcedidoException("Limite de emprestimos excedido");
		}
		this.reserva.add(item);
		return reserva;
	}

	@Override
	public Set<Categoria> retornaCategoria() {
		// TODO Auto-generated method stub
		return categoria;
	}

	@Override
	public void consultarItem(ItemMultimidia item) {
		if (reserva.contains(item)) {
			// adicona emprestimo para o próximo da fila
		} else {
			// lógica de item disponivel
		}

	}

	@Override
	public List<Reserva> adiconarReservaSala(ReservaSala item) throws ItemIndisponivelException {
		// TODO Auto-generated method stub
		return null;
	}

}