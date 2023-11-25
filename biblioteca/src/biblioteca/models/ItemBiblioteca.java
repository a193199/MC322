package biblioteca.models;

public class ItemBiblioteca {
	private ItemBiblioteca valor;
	private int itensReservados;
	private int itensEmprestados;
	private int numeroDeItensEmprestados;
	private int numeroDeItensReservados;

	public ItemBiblioteca(ItemBiblioteca valor) {
		this.valor = valor;
	}

	public ItemBiblioteca getValor() {
		return valor;
	}

	public int getItensReservados() {
		return itensReservados;
	}

	public int getItensEmprestados() {
		return itensEmprestados;
	}

	public int getNumeroDeItensEmprestados() {
		return numeroDeItensEmprestados;
	}

	public int getNumeroDeItensReservados() {
		return numeroDeItensReservados;
	}

	public void reservarItem(ItemMultimidia item) {

	}

	public void emprestarItem(ItemMultimidia item) {

	}
	
	public void devolverItem(ItemMultimidia item) {

	}

}
