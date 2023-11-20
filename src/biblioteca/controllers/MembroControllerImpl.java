package biblioteca.controllers;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import biblioteca.models.Membro;

//alterar para permitir ação, remoção  e busca por id
public class MembroControllerImpl implements MembroController {

	private List<Membro> membros;

	public MembroControllerImpl() {
		membros = new LinkedList<>();
	}

	@Override
	public List<Membro> listarMembros() {
		return Collections.unmodifiableList(membros);
	}

	@Override
	public Membro buscarMembroPorIdentificacao(int identificacao) {
		return membros.get(identificacao);
	}

	@Override
	public void adicionar(Membro membro) {
		// TODO Auto-generated method stub
		if (buscarMembroPorIdentificacao(membro.getIdentificacao()) != null) {
			membros.add(membro);
		}
		membroMsg(1);
	}

	@Override
	public void remover(Membro membro) {
		membros.remove(membro);

	}

	public void membroMsg(int i) {
		switch (i) {
		case 1:
			System.out.println("Memebro já cadastrado");
			break;
		}
	}
}
