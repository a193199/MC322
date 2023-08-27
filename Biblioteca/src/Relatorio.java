import java.util.Scanner;

public class Relatorio {
	
//esta classe constitui os relatorios da biblioteca desde estatísticas de uso até relatórios financeiros de multas
	public Relatorio() {
	//imprimir quantidade de livros totais
	//quantidade de livros emprestados
	//quantidade de livros reservados
	//quantidade de livros disponiveis
	//valor a receber por multa
	
	}
	
	static Scanner sc = new Scanner(System.in);
	public void relatorioTotal(ItemMultimidia [] item, int qtdadeItens) {
		
		
		int tempDisp=0;
		int tempReserv=0;
		int tempEmp=0;
		int multa = 0;
		
		   System.out.println("Quantidade de Livros: " + qtdadeItens);
		   
		   for(int i = 0; i < qtdadeItens;i++) {
			   if(item[i].getEstado() == "disponivel") {
				tempDisp++;
			}else if (item[i].getEstado() == "emprestado") {
				tempEmp++;
			}else if (item[i].getEstado() == "reservado")  {
				tempReserv++;
			}
			 multa =+ item[i].getMulta();
		  }
		  System.out.println("Quantidade de Itens Disponíveis: " + tempDisp);
		  System.out.println("Quantidade de Itens Emprestados: " + tempEmp);
		  System.out.println("Quantidade de Itens Reservados: " + tempReserv);
		  System.out.println("Valor de Multas a receber: " + multa);
		   
		}
	
	public void RelatorioFuncionarios(Funcionarios [] funcionarios, int qtdadeFuncionarios ) {
		

		// Consultar um funcion�rio
			for(int i = 0; i < qtdadeFuncionarios;i++) {
		   System.out.println("ID: "+ funcionarios[i].getID() +" | "+ "Nome: " + funcionarios[i].getNome());
			}
		   
		   System.out.println("Digite o ID do funcionario a ser consultado:\n");
		   int id = sc.nextInt();
		   System.out.println("ID: "+ funcionarios[id-1].getID() +  " | " + "Cargo: " +funcionarios[id-1].getCargo()+  " | " + "Salario: " + funcionarios[id-1].getSalario());
		   
	}
}
