import java.util.GregorianCalendar;
import java.util.Scanner;

//classe responsável por executar as funções de renovação e reserva de um item multimidia
//altera o estado do item para 'emprestimo' ou 'reserva'
public class RenovacaoReserva {
	Scanner sc = new Scanner(System.in);
	
	public RenovacaoReserva() {
		
	}

	public void alterarEstado(Membros membro, ItemMultimidia item) {
		
		
		System.out.println("Digite o 1 para renovação e 2 para reserva.");
		int comando = sc.nextInt();

		switch(comando) {
		
		case 1:
			//if(membro.getID() == item.getIDMembro()) {
				//alterar data de entrega do livro
				GregorianCalendar gc=new GregorianCalendar();
				gc.add(item.getDate().MONTH, 4);
				item.setDate(gc);
				System.out.println("Item renovado com sucesso!");
			//}
		break;
		
		case 2:
			if(item.getEstado() == "disponivel") {
				item.setEstado("reservado");
				System.out.println("Item reservado com sucesso!");
			}else {
				System.out.println("Item não disponível.");	
				System.out.println("Status: " + item.getEstado());
			}
		break;
		}
			
		return;
	}
}
