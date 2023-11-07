package biblioteca.controllers;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import biblioteca.models.ItemMultimidiaImpl;
import biblioteca.models.MembroImpl;

//imprimir os atributos de cada Membro e Item Multimidia
//Imprimir os métodos de cada Membro e Item Multimidia
//Imprimir informações de uma lista qualquer: Deve aceitar listas de membros, item multimidia
//sala de estudos e emprestimos
//usar getMethods(), usar invoke(), usar try catch

public class CReflection {

	public void printItem() {

		Object itemMultimidia = new ItemMultimidiaImpl(null, 0);
		Class<?> classe = itemMultimidia.getClass();
		{

			for (Field atributo : classe.getDeclaredFields()) {
				atributo.setAccessible(true);
				try {
					System.out.println(atributo.getName() + ":" + atributo.getByte(itemMultimidia));
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			Method[] methodClass = classe.getMethods();

			for (Method method : methodClass) {
				System.out.println("Nome do método :" + method.getName());
				System.out.println("Tipo do método :" + method.getReturnType());
			}
		}
	}

	public void printMembro() {

		Object membro = new MembroImpl(null, null, null);
		Class<?> classe = membro.getClass();
		{

			for (Field atributo : classe.getDeclaredFields()) {
				atributo.setAccessible(true);
				try {
					System.out.println(atributo.getName() + ":" + atributo.getByte(membro));
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			Method[] methodClass = classe.getMethods();

			for (Method method : methodClass) {
				System.out.println("Nome do método :" + method.getName());
				System.out.println("Tipo do método :" + method.getReturnType());
			}
		}
	}
}
