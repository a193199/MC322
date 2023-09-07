//import java.io.IOException;
import java.util.*;

import biblioteca.CDdeAudio;
import biblioteca.DVDdeVideo;
import biblioteca.Ebook;
import biblioteca.ItemMultimidia;
import biblioteca.Livro;
import biblioteca.Outros;
import funcionalidades.Emprestimo;
import funcionalidades.Relatorio;
import funcionalidades.RenovacaoReserva;
import pessoa.Funcionarios;
import pessoa.Membros;


public class Main {
	
	public static void main(String[] args) {
		
		//00: Declaração de variáveis
		int MAX = 100;
		int qtdadeLivros=2;
		int qtdadeEbook=1;
		int qtdadeCD=1;
		int qtdadeDVD=1;
		int qtdadeOutros=1;
		int qtdadeFuncionarios=5;
		int qtdadeMembros=7;
		int id;
		String autor, editora,sinopse, capa, localizacao;
		int totalCopias, totalCopiasDisp;
		
		//01: Inicialização de métodos
		
		GregorianCalendar gc=new GregorianCalendar();
		Membros[] membros = new Membros[MAX];	
		Funcionarios[] funcionarios = new Funcionarios[MAX];
		ItemMultimidia[] item = new ItemMultimidia[MAX];
		DVDdeVideo[] dvd = new DVDdeVideo[MAX];
		Ebook[] ebook = new Ebook[MAX];
		Livro[] livro = new Livro[MAX];
		CDdeAudio[] cd = new CDdeAudio[MAX];
		Outros[] outros = new Outros[MAX];
		Relatorio relatorio = new Relatorio();
		RenovacaoReserva renovacaoReserva = new RenovacaoReserva();
		Emprestimo emprestimo = new Emprestimo();
		String nomeMembro;
		
		//02: Início looping principal
		try (Scanner sc = new Scanner(System.in)) {
			gc.add(Calendar.MONTH, 0);
			//ID - Tipo - Nome - estado - idMembro - multa - data retorno
			
			ebook[0]  = new Ebook (1,3,"1984","disponivel",0,0,gc,1,"George Orwell", 
								  "Nova",gc,"","****1984****", 10,10,"online","PDF","www.bit.ly/1984", 
								  "leitor pdf",gc);
			
			livro[0]  = new Livro (1,1,"Antifrágil","disponivel",0,0,gc,1,"Nassim Nicholas Taleb", 
								  "Objetiva",gc,"","****ANTIFRAGIL****", 10,10,	"1C4P",1,4);
			
			livro[1]  = new Livro (2,1,"Sapiens - Edição em quadrinhos","disponivel",0,0,gc,1,"YUVAL NOAH HARARI", 
					  "Quadrinhos na Cia",gc,"","****SAPIENS****", 10,10,	"1C3P",1,3);
			
//			String lista []={"Speak to Me / Breathe", "Eclipse", "Brain Damage", "Time","The Great Gig in the Sky",
//					"Money","Us and Them","Any Colour You Like","On the Run"};
			
			cd[0] 	  = new CDdeAudio(1,2,"The Dark Side of the Moon","disponivel",0,0,gc,1,"Pink Floyd", 
									 "Capitol",gc,"","****The Dark Side of the Moon****", 10,10,"online",
									 "\n1:Speak to Me / Breathe \n2:Eclipse \n3:Brain Damage \n4:Time \n5:The Great Gig in the Sky \n6:Money \n7:Us and Them \n8:Any Colour You Like \n9:On the Run" 
									 ,2550);
			
			dvd[0]    = new DVDdeVideo(1,4,"A Ilha do Medo","disponivel",0,0,gc,1,"Dennis Lehane", 
									  "Warner Bros",gc,
									  "\n\nNos anos 1950, a fuga de uma assassina leva o detetive Teddy Daniels e seu parceiro a \ninvestigarem o seu desaparecimento de um quarto trancado em um hospital psiquiátrico. \nLá, uma rebelião se inicia e o agente terá que enfrentar seus próprios medos.",
									  "****A Origem****", 10,10,"online",
									  "\n1:Leonardo DiCaprio \n2:Mark Ruffalo \n3:Ben Kingsley \n4:Michelle Williams",
									  138,
									  "disponivel");
			
			outros[0] = new Outros(1,5,"Mario Kart 8 Deluxe","disponivel",0,0,gc,1,"Nintendo Switch", 
								   "null",gc,"","****Mario Kart****", 10,10,"online","Jogo","Online");
			
			//Cadastrando Funcionarios
			funcionarios[0] = new Funcionarios(1,"Estagiaria","Maria Madalena",1000);
			funcionarios[1] = new Funcionarios(2, "Gerente", "Pedro Sampaio",11500);
			funcionarios[2] = new Funcionarios(3,"Auxiliar de estoque","Carlos Miguel",2500);
			funcionarios[3] = new Funcionarios(4,"Limpeza","Rafael Veiga",1890);
			funcionarios[4] = new Funcionarios(5,"TI","Marcos Rodrigues",500);
			
			//Cadastrando Membros
//Membros(int ID, String nome, int estado, String nomeInstituicao, String endereco,
//GregorianCalendar dataRegistro, int tipo)
			membros[0] = new Membros(1,"Joao Figueiredo",0,"UNICAMP","Rua Girassol, 182 - SP",gc,0);
			membros[1] = new Membros(2,"Carlos Macedo",0,"USP","Rua A, 34 - SP",gc,0);
			membros[2] = new Membros(3,"Ana Pieri",0,"UNESP","Rua Matutas, 100 - SP",gc,0);
			
			getMenu();
			System.out.println("Digite um comando:");
			
			int comando = sc.nextInt();
			
			while(comando < 11) {
				
				switch (comando) {
				
				case 1:
					System.out.println("------------------1 - Lista de Livros: -------------------");
				// Imprimir lista de livros
					Livro.listaDeItens(livro, qtdadeLivros);
					System.out.println("------------------1 - Lista de e-books: ------------------");
					Ebook.listaDeItens(ebook, qtdadeEbook);
					System.out.println("------------------1 - Lista de CDs: ------------------");
					CDdeAudio.listaDeItens(cd, qtdadeCD);
					System.out.println("------------------1 - Lista de DVDs: ------------------");
					DVDdeVideo.listaDeItens(dvd, qtdadeDVD);
					System.out.println("------------------1 - Lista de Outros: ------------------");
					Outros.listaDeItens(outros, qtdadeOutros);
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
			       
				    opcoes();
					int tipoItem = sc.nextInt();
					
				    System.out.println("Digite o nome do item:");
					String nomeItem = livro[0].cadastrarItem();
					
					System.out.println("Digite o valor da multa em reais:");
					int multa=sc.nextInt();
					
					System.out.println("Digite o nome do autor/compositor:");
					autor=livro[0].cadastrarItem();
					
					System.out.println("Digite o nome da editora/gravadora:");
					editora=livro[0].cadastrarItem();
					
					System.out.println("Digite a capa representativa:");
					capa=livro[0].cadastrarItem();
					
					System.out.println("Digite o total de copias:");
					totalCopias=sc.nextInt();
					
					System.out.println("Digite a localização:");
					localizacao=livro[0].cadastrarItem();
					
					System.out.print("Digite o ano de publicacao: ");
			        int ano = sc.nextInt();
			        
			        System.out.print("Digite o mês (1-12) de publicacao: ");
			        int mes = sc.nextInt();
			        GregorianCalendar anoPublicacao = new GregorianCalendar(ano, mes - 1, 1);
			        
			        
			        if(tipoItem == 1) {
			        	System.out.println("Digite a edicao do livro:");
			        	int edicao=sc.nextInt();
			        	System.out.println("Digite o ISBN:");
			        	int isbn=sc.nextInt();
			        	qtdadeLivros=qtdadeLivros+1;
						livro[qtdadeLivros-1] = new Livro (qtdadeLivros,1,nomeItem,"disponivel",0,0,gc,1,autor, 
													    editora,anoPublicacao,"",capa, 10,10,localizacao,edicao,isbn);
			        }else if (tipoItem == 2) {
			        	System.out.println("Digite a url:");
						String url =livro[0].cadastrarItem();
						
			        	qtdadeEbook=qtdadeEbook+1;
						ebook[qtdadeEbook-1] = new Ebook (1,1,nomeItem,"disponivel",0,0,gc,1,autor, 
													    editora,anoPublicacao,"",capa, 10,10,localizacao,"online","PDF",url, 
														  gc);
			        }else if (tipoItem == 3) {
			        	System.out.println("Digite a duracao em segundos:");
			        	int duracao=sc.nextInt();
			        	qtdadeCD=qtdadeCD+1;
						cd[qtdadeCD-1] = new CDdeAudio (1,1,nomeItem,"disponivel",0,0,gc,1,autor, 
													   editora,anoPublicacao,"",capa, 10,10,"online","",duracao);
			        }else if (tipoItem == 4) {
			        	
			        	System.out.println("Digite uma breve sinopse:");
						sinopse=livro[0].cadastrarItem();
						
						System.out.println("Digite a duracao em minutos:");
			        	int duracao=sc.nextInt();
			        	
						qtdadeDVD=qtdadeDVD+1;
						dvd[qtdadeDVD-1] = new DVDdeVideo (1,1,nomeItem,"disponivel",0,0,gc,1,autor, 
													    editora,anoPublicacao,sinopse,capa, 10,10,"online","",duracao,"disponivel");
						
			        }else if(tipoItem == 5) {
			        	System.out.println("Digite o tipo de recurso:");
						String recurso=livro[0].cadastrarItem();
						System.out.println("Digite o formato:");
						String formato=livro[0].cadastrarItem();
			        	qtdadeOutros=qtdadeOutros+1;
						outros[qtdadeOutros-1] = new Outros (1,1,nomeItem,"disponivel",0,0,gc,1,autor, 
													    editora,anoPublicacao,"",capa, 10,10,"online",recurso,formato);
			        } else {
			        	System.out.println("Opção Inválida");
			        }
					
					System.out.println("Item cadastrado com sucesso!");
					//System.out.println("Nome: "+livro[qtdadeItens].getTitulo() + " | ID: " + livro[qtdadeItens].getIDItem());
					   
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
					   membros[qtdadeMembros] = new Membros(qtdadeMembros, nomeMembro, 0, "", "", null, 0);
					   System.out.println("Membro cadastrado com sucesso!");
					   System.out.println("Nome: "+membros[qtdadeMembros].getNome() + "| ID: " + membros[qtdadeMembros].getID());
					   
					} 
				   
				   opcoes();
				   tipoItem = sc.nextInt();
				   
				   if(tipoItem == 1) {
					   emprestimo.emprestarItem(livro, qtdadeLivros);
			       }else if (tipoItem == 2) {
			           emprestimo.emprestarItem(ebook, qtdadeEbook);
			       }else if (tipoItem == 3) {
			    	   emprestimo.emprestarItem(cd, qtdadeCD);
			       }else if (tipoItem == 4) {
			    	   emprestimo.emprestarItem(dvd, qtdadeDVD);
			       }else if(tipoItem == 5) {	
			    	   emprestimo.emprestarItem(outros, qtdadeOutros);
			       } else {
			        	System.out.println("Opção Inválida");
			       }

			       msg();
				   comando = sc.nextInt();
				break;
				
				case 5:
				   System.out.println("------------------------5 - Renovação de Livros: -----------------------");
				   System.out.println("Digite o ID do livro desejado.");
				   id = sc.nextInt();
					// Realizar uma reserva
				   renovacaoReserva.alterarEstado(membros[0], livro[id]);
				   msg();
				   comando = sc.nextInt();
				break;
					
				case 6:

				// Realizar devolucao
				   System.out.println("-----------------------6 - Devolucao de Livros: ------------------------");
				   
				   opcoes();
				   tipoItem = sc.nextInt();
				   System.out.println("Digite o ID do membro:");
				   id = sc.nextInt();
				   if(tipoItem == 1) {
					   emprestimo.devolverItem(membros[id],livro, qtdadeLivros);
			       }else if (tipoItem == 2) {
			    	   emprestimo.devolverItem(membros[id],ebook, qtdadeEbook);
			       }else if (tipoItem == 3) {
			    	   emprestimo.devolverItem(membros[id],cd, qtdadeCD);
			       }else if (tipoItem == 4) {
			    	   emprestimo.devolverItem(membros[id],dvd, qtdadeDVD);
			       }else if(tipoItem == 5) {	
			    	   emprestimo.devolverItem(membros[id],outros, qtdadeOutros);
			       } else {
			        	System.out.println("Opção Inválida");
			       }
				   
				   msg();
				   comando = sc.nextInt();
				break;
				
				case 7:
					//aqui sera executada a compra de livros
				   System.out.println("-------------------------7 - Adicionar multa: --------------------------");
				   
				   opcoes();
				   tipoItem = sc.nextInt();
				   
				   if(tipoItem == 1) {
					   
			       }else if (tipoItem == 2) {
			    	   
			       }else if (tipoItem == 3) {
			    	  
			       }else if (tipoItem == 4) {
			    	   
			       }else if(tipoItem == 5) {	
			    	   
			       } else {
			        	System.out.println("Opção Inválida");
			       }
			   
				   msg();
				   comando = sc.nextInt();
					
				break;
				
				case 8:
				   System.out.println("--------------------8 - Estatisticas da Biblioteca: --------------------");
				   opcoes();
				   
				   tipoItem = sc.nextInt();
				   
				   if(tipoItem == 1) {
					   System.out.println("X X X X X X X X X LIVRO X X X X X X X X X");
					   relatorio.relatorioTotal(livro, qtdadeLivros);
			       }else if (tipoItem == 2) {
			    	   System.out.println("X X X X X X X X X EBOOK X X X X X X X X X");
			    	   relatorio.relatorioTotal(ebook, qtdadeEbook);
			       }else if (tipoItem == 3) {
			    	   System.out.println("X X X X X X X X X CD X X X X X X X X X");
			    	   relatorio.relatorioTotal(cd, qtdadeCD);
			       }else if (tipoItem == 4) {
			    	   System.out.println("X X X X X X X X X DVD X X X X X X X X X");
			    	   relatorio.relatorioTotal(dvd, qtdadeDVD);
			       }else if(tipoItem == 5) {	
			    	   System.out.println("X X X X X X X X X OUTROS X X X X X X X X X");
			    	   relatorio.relatorioTotal(outros, qtdadeOutros);
			       } else {
			        	System.out.println("Opção Inválida");
			       }
				   
				   msg();
				   comando = sc.nextInt();
					
				break;
				
				case 9:
				   System.out.println("--------------------9 - Relatorio de emprestimo: --------------------");
				   
				   opcoes();
				   tipoItem = sc.nextInt();
				   if(tipoItem == 1) {
					   emprestimo.relatorioEmprestimo(livro);
			       }else if (tipoItem == 2) {
			    	   emprestimo.relatorioEmprestimo(ebook);
			       }else if (tipoItem == 3) {
			    	   emprestimo.relatorioEmprestimo(cd);
			       }else if (tipoItem == 4) {
			    	   emprestimo.relatorioEmprestimo(dvd);
			       }else if(tipoItem == 5) {	
			    	   emprestimo.relatorioEmprestimo(outros);
			       } else {
			        	System.out.println("Opção Inválida");
			       }

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
		System.out.println("  1: Lista de itens");
		System.out.println("  2: Consultar um funcionario");
		System.out.println("  3: Cadastrar um novo item");
		System.out.println("  4: Realizar um emprestimo");	
		System.out.println("  5: Realizar uma reserva ou renovação");	
		System.out.println("  6: Adicionar multa");	
		System.out.println("  7: Retirar item do sistema");
		System.out.println("  8: Relatórios Estatístico");
		System.out.println("  9: Relatórios de Itens");
		System.out.println(" 10: Abrir menu");
		System.out.println(" 11: Fechar o menu");
		System.out.println("---------------------------------------------");
	}
	
	public static void msg() {
		System.out.println("Em caso de duvida, digite 10 para abrir o menu.");	
	}
	
	public static void opcoes() {
		System.out.println("Digite: \n1 Para livros \n2 Para e-book \n3 Para CDs \n4 Para DVDs \n5 Para outros");	
	}
	
}
