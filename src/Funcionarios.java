//consultar cargo
//consultar faltas
//consultar salário

public class Funcionarios {
	
	private int ID;
	private String nome;
	private int salario;
	private String cargo;
	
	public Funcionarios (int ID, String cargo, String nome, int salario){
		this.ID=ID;
		this.nome=nome;
		this.salario=salario;
		this.cargo=cargo;
	}
	
	public int getID () {
		return ID;	
	}

	public void setID(int ID) {
		this.ID=ID;
	}
	
	public String getCargo () {
		return cargo;	
	}

	public void setCargo(String cargo) {
		this.cargo=cargo;
	}

	public String getNome () {
		return nome;	
	}

	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public int getSalario () {
		return salario;	
	}

	public void setSalario(int salario) {
		this.salario=salario;
	}
	
}
