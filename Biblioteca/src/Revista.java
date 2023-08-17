//import java.util.Scanner;

public class Revista {
	
	private int ID;
	private String nome;
	private int estado;
	
	public Revista(int ID, String nome, int estado){
		this.ID=ID;
		this.nome=nome;
		this.estado=estado;
	}	
	
	public int getID () {
		return ID;	
	}

	public void setID(int ID) {
		this.ID=ID;
	}
	
	public String getNome () {
		return nome;	
	}

	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public int getEstado () {
		return estado;	
	}

	public void setEstado(int estado) {
		this.estado=estado;
	}


}

