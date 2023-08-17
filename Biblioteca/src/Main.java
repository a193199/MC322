//import java.io.IOException;
import java.util.*;
import java.text.*;


public class Main {
	
	public static void main(String[] args) {
		int MAX = 100;
		int qtdadeLivros=11;
		int qtdadeFuncionarios=5;
		int id;
		Date today;
		
		GregorianCalendar gc=new GregorianCalendar();
		Livro[] livro = new Livro[MAX];
		Membros[] membros = new Membros[MAX];	
		Funcionarios[] funcionarios = new Funcionarios[MAX];
		Revista[] revista = new Revista[MAX];
		
		Scanner sc = new Scanner(System.in);
		
		//Cadastrando Livros
		//Livro(int IDLivro, String nome, int estado, int IDMembro, int tipo)
		
		gc.add(Calendar.MONTH, 2);
		
		livro[0] = new Livro( 1, "1984", "disponivel", 0, 10, gc);
		livro[1] = new Livro( 2, "Revolucao dos Bichos", "disponivel", 0, 15, gc);
		livro[2] = new Livro( 3, "Inteligencia Artificial: Do Zero ao Metaverso", "disponivel", 0, 20, gc);
		livro[3] = new Livro( 4, "Indomavel", "disponivel", 0, 55, gc);
		livro[4] = new Livro( 5, "Primo Alemao", "disponivel", 0, 35, gc);
		livro[5] = new Livro( 6, "Blink", "disponivel", 0, 65, gc);
		livro[6] = new Livro( 7, "Antifragil", "disponivel", 0, 65, gc);
		livro[7] = new Livro( 8, "POO - Conceitos e tecnicas", "disponivel", 0, 20, gc);
		livro[8] = new Livro( 9, "Habitos atomicos", "disponivel", 0, 30, gc);
		livro[9] = new Livro(10, "Essencialismo", "disponivel", 0, 50, gc);
		livro[10]= new Livro(11, "Como fazer amigos e influenciar pessoas", "disponivel", 0, 10, gc);
		
		
		//Cadastrando Funcionarios
		funcionarios[0] = new Funcionarios(1,"Estagiaria","Maria Madalena",1000);
		funcionarios[1] = new Funcionarios(2, "Gerente", "Pedro Sampaio",11500);
		funcionarios[2] = new Funcionarios(3,"Auxiliar de estoque","Carlos Miguel",2500);
		funcionarios[3] = new Funcionarios(4,"Limpeza","Rafael Veiga",1890);
		funcionarios[4] = new Funcionarios(5,"TI","Marcos Rodrigues",500);
		
		//Cadastrando Membros
		membros[0] = new Membros(1,"Joao Figueiredo",0);
		membros[1] = new Membros(2,"Carlos Macedo",1);
		
		//Cadatrando revistas
		revista[0] = new Revista( 1, "ISTOE", 0);
		revista[1] = new Revista( 2, "Lance!", 0);
		revista[2] = new Revista( 3, "Claudia", 0);
		revista[3] = new Revista( 4, "Veja", 0);
		revista[4] = new Revista( 5, "Arquitetura e Urbanismo", 0);
		
		//incluir sistema a respeito do caixa da biblioteca
		//incluir funcao de compra de livros
		//
		//
		//+
		
		getMenu();
		System.out.println("Digite um comando:");
		
		int comando = sc.nextInt();
		
		while(comando < 8) {
			
			switch (comando) {
			
			case 1:
				System.out.println("------------------1 - Lista de Livros: ------------------");
			// Imprimir lista de livros
				for(int i=0; i < qtdadeLivros;i++) {
					System.out.println("ID:"+ i +" | nome: " +livro[i].getNome() +" | Estado: " + livro[i].getEstado() +
							" | Preco: " + livro[i].getPreco());
					//System.out.println();
				}
				msg();
				comando = sc.nextInt();
			break;
	
			case 2:
				System.out.println("------------------2 - Informaçoes sobre funcionarios: ------------------");
			// Consultar um funcion�rio
				for(int i = 0; i < qtdadeFuncionarios;i++) {
			   System.out.println("ID: "+ funcionarios[i].getID() +" | "+ "Nome: " + funcionarios[i].getNome());
				}
			   
			   System.out.println("Digite o ID do funcionario a ser consultado:\n");
			   id = sc.nextInt();
			   System.out.println("ID: "+ funcionarios[id-1].getID() +  " | " + "Cargo: " +funcionarios[id-1].getCargo()+  " | " + "Sal�rio: " + funcionarios[id-1].getSalario());
			   
			   msg();
			   comando = sc.nextInt();
			break;
	
			case 3:
				System.out.println("------------------3 - Cadastrar Livros: ------------------");	
			// Cadastrar um novo livro
					
				System.out.println("Digite o nome do livro:\n");
				String nomeLivro=Livro.cadastrarLivro();
				
				System.out.println("Digite o preco do livro em reais:\n");
				int preco=sc.nextInt();
					
				livro[qtdadeLivros++] = new Livro(qtdadeLivros, nomeLivro, "disponivel", 0, preco, gc);
				
				msg();
				comando = sc.nextInt();
			break;
			
			case 4:
				System.out.println("------------------4 - Emprestimo de Livros: ------------------");
				System.out.println("Digite o ID do livro desejado.");
				id = sc.nextInt();
	
				if (livro[id].getEstado() == "disponivel") {
					livro[id].setEstado("emprestado");
					System.out.println("Emprestimos realizado com sucesso!");
					System.out.println("Data de retorno: " + gc.getTime());
				} else {
					System.out.println("Livro Indisponivel.");
				}
				
				msg();
				comando = sc.nextInt();
			break;
			
			case 5:
	
			// Realizar devolucao
				System.out.println("------------------5 - Devolucao de Livros: ------------------");
				System.out.println("Digite o ID do livro desejado.");
				id = sc.nextInt();
	
				if (livro[id].getEstado() == "emprestado") {
					livro[id].setEstado("disponivel");
					System.out.println("Livro devolvido com sucesso!");
				} else {
					System.out.println("Nao ha emprestimo relacionado a esse livro.");
				}
				
				msg();
				comando = sc.nextInt();
			break;
			
			case 6:
				//aqui sera executada a compra de livros
				System.out.println("------------------6 - Retirar livros do sistema: ------------------");
				System.out.println("Digite o ID do livro desejado.");
				id = sc.nextInt();
				
				if(livro[id].getEstado() == "emprestado") {
					System.out.println("Livro indisponivel.");
				} else {
					qtdadeLivros--;
					for(int i = id; i < qtdadeLivros; i++) {
						livro[i]=livro[i+1];
					}
						
				}
				msg();
				comando = sc.nextInt();
				
			break;
			
			case 7:
				
				getMenu();
				comando = sc.nextInt();
				
			break;
	
			default:
				System.out.println("Opçao Invalida. Digite novamente.");
				
				msg();
				
	
			}
	
		}
		
		System.out.println("Obriado e volte sempre!");
		
		
	}
	
	public static void getMenu() {
		System.out.println("--------------MENU--------------");
		System.out.println("|  1: Lista de livros          |");
		System.out.println("|  2: Consultar um funcionario |");
		System.out.println("|  3: Cadastrar um novo livro  |");
		System.out.println("|  4: Realizar um emprestimo   |");	
		System.out.println("|  5: Devolver um livro        |");	
		System.out.println("|  6: Retirar livro do sistema |");
		System.out.println("|  7: Abrir menu               |");
		System.out.println("|  9: Fechar o menu            |");
		System.out.println("--------------------------------");
	}
	
	public static void msg() {
		System.out.println("Em caso de duvida, digite 7 para abrir o menu.");	
	}


}
