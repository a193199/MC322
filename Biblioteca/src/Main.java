//import java.io.IOException;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		int MAX = 100;
		int qtdadeItens=11;
		int qtdadeFuncionarios=5;
		int qtdadeMembros=7;
		int id;
		
		GregorianCalendar gc=new GregorianCalendar();
		Membros[] membros = new Membros[MAX];	
		Funcionarios[] funcionarios = new Funcionarios[MAX];
		ItemMultimidia[] item = new ItemMultimidia[MAX];
		Relatorio relatorio = new Relatorio();
		RenovacaoReserva renovacaoReserva = new RenovacaoReserva();
		Emprestimo emprestimo = new Emprestimo();
		String nomeMembro;
		
		try (Scanner sc = new Scanner(System.in)) {
			gc.add(Calendar.MONTH, 0);
			//ID - Tipo - Nome - estado - idMembro - multa - data retorno
			item[0] = new ItemMultimidia( 1, 1,"1984", "disponivel", 0, 10, gc, qtdadeItens);
			item[1] = new ItemMultimidia( 2, 1,"Revolucao dos Bichos", "disponivel", 0, 15, gc, qtdadeItens);
			item[2] = new ItemMultimidia( 3, 1,"Inteligencia Artificial: Do Zero ao Metaverso", "disponivel", 0, 20, gc, qtdadeItens);
			item[3] = new ItemMultimidia( 4, 1,"Indomavel", "disponivel", 0, 55, gc, qtdadeItens);
			item[4] = new ItemMultimidia( 5, 1,"Primo Alemao", "disponivel", 0, 35, gc, qtdadeItens);
			item[5] = new ItemMultimidia( 6, 1,"Blink", "disponivel", 0, 65, gc, qtdadeItens);
			item[6] = new ItemMultimidia( 7, 1,"Antifragil", "disponivel", 0, 65, gc, qtdadeItens);
			item[7] = new ItemMultimidia( 8, 1,"POO - Conceitos e tecnicas", "disponivel", 0, 20, gc, qtdadeItens);
			item[8] = new ItemMultimidia( 9, 1,"Habitos atomicos", "disponivel", 0, 30, gc, qtdadeItens);
			item[9] = new ItemMultimidia(10, 1,"Essencialismo", "disponivel", 0, 50, gc, qtdadeItens);
			item[10]= new ItemMultimidia(11, 1,"Como fazer amigos e influenciar pessoas", "disponivel", 0, 10, gc, qtdadeItens);
			item[11]= new ItemMultimidia(12, 1,"Quarto Escuro", "disponivel", 0, 10, gc, qtdadeItens);
			
			
			//Cadastrando Funcionarios
			funcionarios[0] = new Funcionarios(1,"Estagiaria","Maria Madalena",1000);
			funcionarios[1] = new Funcionarios(2, "Gerente", "Pedro Sampaio",11500);
			funcionarios[2] = new Funcionarios(3,"Auxiliar de estoque","Carlos Miguel",2500);
			funcionarios[3] = new Funcionarios(4,"Limpeza","Rafael Veiga",1890);
			funcionarios[4] = new Funcionarios(5,"TI","Marcos Rodrigues",500);
			
			//Cadastrando Membros
			//ID - Nome - Estado
			membros[0] = new Membros(1,"Joao Figueiredo",0);
			membros[1] = new Membros(2,"Carlos Macedo",0);
			membros[2] = new Membros(3,"Ana Pieri",0);
			membros[3] = new Membros(4,"Luiza Malatesta",0);
			membros[4] = new Membros(5,"Igor Brasileiro",0);
			membros[5] = new Membros(6,"Joao Goes",0);
			membros[6] = new Membros(7,"Pedro Paulo",0);
			
			
			getMenu();
			System.out.println("Digite um comando:");
			
			int comando = sc.nextInt();
			
			while(comando < 11) {
				
				switch (comando) {
				
				case 1:
					System.out.println("------------------1 - Lista de Livros: ------------------");
				// Imprimir lista de livros
					emprestimo.listaDeItens(item, qtdadeItens);
					msg();
					comando = sc.nextInt();
				break;

				case 2:
				   System.out.println("------------------2 - Informaçoes sobre funcionarios: ------------------");
				   relatorio.RelatorioFuncionarios(funcionarios, qtdadeFuncionarios);
				   msg();
				   comando = sc.nextInt();
				break;

				case 3:
				   System.out.println("-----------------------3 - Cadastrar Livros: --------------------------");	
					// Cadastrar um novo livro	
			       
					String nomeItem = item[qtdadeItens-1].cadastrarItem();
					System.out.println("Digite o tipo de item (1- livro | 2-CD | 3-e-book):");
					int tipoItem = sc.nextInt();
					System.out.println("Digite o valor da multa em reais:");
					int multa=sc.nextInt();
					
					qtdadeItens=qtdadeItens+1;
					item[qtdadeItens] = new ItemMultimidia(qtdadeItens, tipoItem, nomeItem, "disponivel", 0, multa, gc, qtdadeItens);
					System.out.println("Item cadastrado com sucesso!");
					System.out.println("Nome: "+item[qtdadeItens].getNome() + " | ID: " + item[qtdadeItens].getIDItem());
					   
				   msg();
				   comando = sc.nextInt();
				break;
				
				case 4:
				   System.out.println("---------------------4 - Emprestimo de Livros: -------------------------");
				   System.out.println("Membro já cadastrado? (Digite 1 para sim ou 2 para nao).");
				   
				   int resposta = sc.nextInt();
				   if(resposta == 2) {
					   
					   nomeMembro=membros[qtdadeMembros-1].cadastrarMembro();
					   qtdadeMembros++;
					   membros[qtdadeMembros] = new Membros(qtdadeMembros, nomeMembro, 0);
					   System.out.println("Membro cadastrado com sucesso!");
					   System.out.println("Nome: "+membros[qtdadeMembros].getNome() + "| ID: " + membros[qtdadeMembros].getID());
					   
					   emprestimo.emprestarItem(item, qtdadeItens);
					   
					} else if(resposta == 1) {
				   emprestimo.emprestarItem(item, qtdadeItens);
				}
			       msg();
				   comando = sc.nextInt();
				break;
				
				case 5:
				   System.out.println("------------------------5 - Renovação de Livros: -----------------------");
				   System.out.println("Digite o ID do livro desejado.");
				   id = sc.nextInt();
					// Realizar uma reserva
				   renovacaoReserva.alterarEstado(membros[0], item[id]);
				   msg();
				   comando = sc.nextInt();
				break;
					
				case 6:

				// Realizar devolucao
				   System.out.println("-----------------------6 - Devolucao de Livros: ------------------------");
				   emprestimo.devolverItem(item, qtdadeItens);
				   msg();
				   comando = sc.nextInt();
				break;
				
				case 7:
					//aqui sera executada a compra de livros
				   System.out.println("-------------------------7 - Adicionar multa: --------------------------");
				   emprestimo.adicionarMulta(item, qtdadeItens);			   
				   msg();
				   comando = sc.nextInt();
					
				break;
				
				case 8:
				   System.out.println("--------------------8 - Estatisticas da Biblioteca: --------------------");
				   relatorio.relatorioTotal(item, qtdadeItens);
				   msg();
				   comando = sc.nextInt();
					
				break;
				
				case 9:
				   System.out.println("--------------------9 - Relatorio de emprestimo: --------------------");
				   emprestimo.relatorioEmprestimo(item);
				   msg();
				   comando = sc.nextInt();
						
				break;
				
				case 10:
					
				   getMenu();
				   comando = sc.nextInt();
					
				break;

				default:
					System.out.println("Opçao Invalida. Digite novamente.");
					
					msg();
					

				}

			}
		}
		
		//Cadastrando Livros
		//Livro(int IDLivro, String nome, int estado, int IDMembro, int tipo)
		
		System.out.println("Obriado e volte sempre!");
		
		
	}
	

	public static void getMenu() {
		System.out.println("---------------------MENU--------------------");
		System.out.println("  1: Lista de livros");
		System.out.println("  2: Consultar um funcionario");
		System.out.println("  3: Cadastrar um novo livro");
		System.out.println("  4: Realizar um emprestimo");	
		System.out.println("  5: Realizar uma reserva ou renovação");	
		System.out.println("  6: Devolver um livro");	
		System.out.println("  7: Retirar livro do sistema");
		System.out.println("  8: Relatórios Estatístico");
		System.out.println("  9: Relatórios de Itens");
		System.out.println(" 10: Abrir menu");
		System.out.println(" 11: Fechar o menu");
		System.out.println("---------------------------------------------");
	}
	
	public static void msg() {
		System.out.println("Em caso de duvida, digite 10 para abrir o menu.");	
	}


}
