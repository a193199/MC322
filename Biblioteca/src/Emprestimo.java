import java.util.GregorianCalendar;
import java.util.Scanner;

public class Emprestimo {
//devolve relatorio de emprestimo
	Scanner sc = new Scanner(System.in);
	GregorianCalendar gc=new GregorianCalendar();
	
	
	public void relatorioEmprestimo(ItemMultimidia [] item) {
		
	// Consultar um funcion�rio
	   
	   
	   System.out.println("Digite o ID do item a ser consultado:\n");
	   int id = sc.nextInt();
	   //Retonra o ID do item consultado o estado )emprestimo, reserva ou disponível, a data de retorno e o Membro que está relacionada ao item
	   gc=item[id].getDate();

	   System.out.println("Status: " +item[id].getEstado());
	   System.out.println("Legenda Tipo: 1- livro | 2-CD | 3-e-book");
	   System.out.println("Tipo: " +item[id].getTipo());
	   if (item[id].getEstado()!= "disponivel") {
			   System.out.println("Retorno: " + gc.getTime());
	   }else {
		       System.out.println("Retorno: Sem data definida");
	   }
	   System.out.println("Membro: " + item[id].getIDMembro());
	   System.out.println("Multa: "+ item[id].getMulta());	   
	}
	
	public void listaDeItens (ItemMultimidia [] item, int qtdade) {
		
	   for(int i=0; i <= qtdade;i++) {
	   System.out.println("ID:"+ i +" | nome: " +item[i].getNome() +" | Status: " + item[i].getEstado() +
				" | Multa: " + item[i].getMulta());
		//System.out.println();
	}
}
	
	public void emprestarItem(ItemMultimidia [] item, int qtdadeLivros) {
			
		System.out.println("Digite o ID do livro desejado.");
		int id = sc.nextInt();
		
		if (item[id].getEstado() == "disponivel" || item[id].getEstado() == "reservado") {
			System.out.println("Digite o ID do membro.");
			int idMembro = sc.nextInt();
			item[id].setEstado("emprestado");
			item[id].setIDMembro(idMembro);
			System.out.println("Emprestimos realizado com sucesso!");
			System.out.println("Data de retorno: " + gc.getTime());
			
	    } else {
			System.out.println("Livro Indisponivel.");
		}
	  
	}
	public void devolverItem(ItemMultimidia [] item, int qtdadeLivros) {
		System.out.println("Digite o ID do livro desejado.");
		int id = sc.nextInt();

		if (item[id].getEstado() == "emprestado") {
			   item[id].setEstado("disponivel");
				System.out.println("Livro devolvido com sucesso!");
		} else {
				System.out.println("Nao ha emprestimo relacionado a esse livro.");
		}
			
	}
	public void adicionarMulta(ItemMultimidia [] item, int qtdadeLivros) {
		System.out.println("Digite o ID do livro desejado.");
		int id = sc.nextInt();
        if(item[id].getEstado() == "emprestado") {
		    System.out.println("Digite o valor da multa.");
		    int multa = sc.nextInt();
		    item[id].setMulta(multa);
		    System.out.println("Multa cadastrada.");
		}else {
			   System.out.println("Impossível realizar está operação");
		}
	}
	
}
