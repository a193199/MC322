import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int MAX = 100;
		int qtdadeLivros=11;
		int qtdadeFuncionarios=5;
		int id;

		Livro[] livro = new Livro[MAX];
		Membros[] membros = new Membros[MAX];	
		Funcionarios[] funcionarios = new Funcionarios[MAX];
		
		Scanner sc = new Scanner(System.in);
		
		
		//Cadastrando Livros
		//Livro(int IDLivro, String nome, int estado, int IDMembro, int tipo)
		
		livro[0] = new Livro( 1, "1984", 0, 0);
		livro[1] = new Livro( 2, "Revolu��o dos Bichos", 0, 0);
		livro[2] = new Livro( 3, "Inteligencia Artificial: Do Zero ao Metaverso", 0, 0);
		livro[3] = new Livro( 4, "Indom�vel", 0, 0);
		livro[4] = new Livro( 5, "Primo Alem�o", 0, 0);
		livro[5] = new Livro( 6, "Blink", 0, 0);
		livro[6] = new Livro( 7, "Antifr�gil", 0, 0);
		livro[7] = new Livro( 8, "POO - Conceitos e t�cnicas", 0, 0);
		livro[8] = new Livro( 9, "H�bitos at�micos", 0, 0);
		livro[9] = new Livro( 10, "Essencialismo", 0, 0);
		livro[10] = new Livro(11, "Como fazer amigos e influenciar pessoas", 0, 0);
		
		
		//Cadastrando Funcionarios
		funcionarios[0] = new Funcionarios(1,"Estagi�ria","Maria Madalena",1000);
		funcionarios[1] = new Funcionarios(2, "Gerente", "Pedro Sampaio",11500);
		funcionarios[2] = new Funcionarios(3,"Auxiliar de estoque","Carlos Miguel",2500);
		funcionarios[3] = new Funcionarios(4,"Limpeza","Rafael Veiga",1890);
		funcionarios[4] = new Funcionarios(5,"TI","Marcos Rodrigues",500);
		
		//Cadastrando Membros
		membros[0] = new Membros(1,"Joao Figueiredo",0);
		membros[1] = new Membros(1,"Carlos Macedo",1);
		
		
		getMenu();
		System.out.println("Digite um comando:");
		
		int comando = sc.nextInt();
		
		
		while(comando < 7) {
			
			switch (comando) {
			
			case 1:
				System.out.println("------------------1 - Lista de Livros: ------------------");
			// Imprimir lista de livros
				for(int i=0; i < qtdadeLivros;i++) {
					System.out.println("ID:"+ i +"|" +livro[i].getNome());
				}
				msg();
				comando = sc.nextInt();
			break;
	
			case 2:
				System.out.println("------------------2 - Informa��es sobre funcion�rios: ------------------");
			// Consultar um funcion�rio
				for(int i = 0; i < qtdadeFuncionarios;i++) {
			   System.out.println("ID: "+ funcionarios[i].getID() +" | "+ "Nome: " + funcionarios[i].getNome());
				}
			   
			   System.out.println("Digite o ID do funcion�rio a ser consultado:\n");
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
					
				livro[qtdadeLivros++] = new Livro(qtdadeLivros, nomeLivro, 0, 0);
				
				msg();
				comando = sc.nextInt();
			break;
			
			case 4:
				System.out.println("------------------4 - Empr�stimo de Livros: ------------------");
				System.out.println("Digite o ID do livro desejado.");
				id = sc.nextInt();
	
				if (livro[id].getEstado() == 0) {
					livro[id].setEstado(1);
					System.out.println("Empr�stimos realizado com sucesso!");
				} else {
					System.out.println("Livro Indispon�vel.");
				}
				
				msg();
				comando = sc.nextInt();
			break;
			
			case 5:
	
			// Realizar empr�stimo
				System.out.println("------------------5 - Devolu��o de Livros: ------------------");
				System.out.println("Digite o ID do livro desejado.");
				id = sc.nextInt();
	
				if (livro[id].getEstado() == 1) {
					livro[id].setEstado(0);
					System.out.println("Livro devolvido com sucesso!");
				} else {
					System.out.println("N�o h� empr�stimo relacionado a esse livro.");
				}
				
				msg();
				comando = sc.nextInt();
			break;
			
			case 6:
				
				getMenu();
				comando = sc.nextInt();
				
			break;
	
			default:
				System.out.println("Op��o Inv�lida. Digite novamente.");
				
				msg();
				comando = sc.nextInt();
			// bloco de c�digo que ser� executado se nenhum dos cases for aceito
	
			}
	
		}
		
		System.out.println("Obriado e volte sempre!");
		
		
	}
	
	public static void getMenu() {
		System.out.println("--------------MENU--------------");
		System.out.println("|  1: Lista de livros          |");
		System.out.println("|  2: Consultar um funcion�rio |");
		System.out.println("|  3: Cadastrar um novo livro  |");
		System.out.println("|  4: Realizar um empr�stimo   |");	
		System.out.println("|  5: Devolver um livro        |");	
		System.out.println("|  6: Abrir menu               |");
		System.out.println("|  9: Fechar o menu            |");
		System.out.println("--------------------------------");
	}
	
	public static void msg() {
		System.out.println("Em caso de d�vida, digite 6 para abrir o menu.");	
	}

}
