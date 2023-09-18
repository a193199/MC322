package biblioteca.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import biblioteca.models.Categoria;
import biblioteca.models.Emprestimo;
import biblioteca.models.ItemMultimidia;
import biblioteca.models.Membro;
import biblioteca.models.Reserva;

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
	public boolean emprestarItem(Membro membro, ItemMultimidia item) {
		// Lógica de empréstimo
		return true;
	}

	@Override
	public boolean devolverItem(Membro membro, ItemMultimidia item) {
		// Lógica de devolução
		return true;
	}

	@Override
	public Map<Integer, ItemMultimidia> adicionarAoMap(int id, ItemMultimidia item) {
		this.mapa.put(id, item);
		return mapa;

	}

	@Override
	public Set<Emprestimo> adiconaEmprestimo(Emprestimo item) {
		this.emprestimo.add(item);
		return emprestimo;
	}

	@Override
	public List<Reserva> adiconarReserva(Reserva item) {
		this.reserva.add(item);
		return reserva;
	}

	@Override
	public Set<Categoria> retornaCategoria() {
		// TODO Auto-generated method stub
		return categoria;
	}


}