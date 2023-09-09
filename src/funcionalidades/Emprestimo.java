package funcionalidades;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import biblioteca.ItemMultimidia;
import pessoa.Membros;

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

	   if (item[id].getEstado()!= "disponivel") {
			   System.out.println("Retorno: " + gc.getTime());
	   }else {
		       System.out.println("Retorno: Sem data definida");
	   }
	   System.out.println("Sinopse: " + item[id].getSinopse());
	      
	}
	
	public void emprestarItem(ItemMultimidia [] item, int qtdadeLivros) {
			
		System.out.println("Digite o ID do item desejado.");
		int id = sc.nextInt();
		
		if (item[id].getEstado() == "disponivel" || item[id].getEstado() == "reservado") {
			System.out.println("Digite o ID do membro.");
			int idMembro = sc.nextInt();
			item[id].setEstado("emprestado");
			item[id].setIDMembro(idMembro);
			System.out.println("Emprestimos realizado com sucesso!");
			System.out.println("Data de retorno: " + gc.getTime());
			
	    } else {
			System.out.println("Indisponivel.");
		}
	  
	}
	public void devolverItem(Membros membro, ItemMultimidia [] item, int qtdadeLivros) {
		System.out.println("Digite o ID do item desejado.");
		Calendar now = Calendar.getInstance();
		int id = sc.nextInt();
		
		      if (item[id].getEstado() == "emprestado") {
		    	  item[id].setEstado("disponivel");
				  System.out.println("Item devolvido com sucesso!");
				  
		}else if(item[id].getDate().compareTo(now) != 0) {
			      if(membro.getTipo() == 1) {
				  //Professor
			    	  item[id].setMulta(0.5);
			}else if(membro.getTipo()== 2 | membro.getTipo()==3) {
				 //Estudante de graduação ou pós
					  item[id].setMulta(1);
			}else if(membro.getTipo()== 4) {
				//Funcionários
					  item[id].setMulta(0.75);
			}
			
		}else {
				System.out.println("Nao ha emprestimo relacionado a esse item.");
		}
			
	}
//	public void adicionarMulta(ItemMultimidia [] item, int qtdadeLivros) {
//		System.out.println("Digite o ID do item desejado.");
//		int id = sc.nextInt();
//        if(item[id].getEstado() == "emprestado") {
//		    System.out.println("Digite o valor da multa.");
//		    int multa = sc.nextInt();
//		    item[id].setMulta(multa);
//		    System.out.println("Multa cadastrada.");
//		}else {
//			   System.out.println("Impossível realizar está operação");
//		}
//	}
	
}
