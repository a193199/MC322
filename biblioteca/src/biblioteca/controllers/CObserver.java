package biblioteca.controllers;

import biblioteca.models.ItemMultimidiaImpl;

public class CObserver extends ItemMultimidiaImpl {
	public CObserver(int id, String nome) {
		super(nome, id);
	}
	@Override 
	public Object buscar(long id) {
		System.out.println("Buscando produto com id" + id);
		return super.buscar(id);	
	}
}
