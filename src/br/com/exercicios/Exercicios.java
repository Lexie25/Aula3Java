package br.com.exercicios;
import java.util.Scanner;

import br.com.zup.Pessoa;

import java.util.ArrayList;
import java.util.List;
public class Exercicios {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		List<String> personagens = new ArrayList<String>();
		
		String person = "";
		
		while (!person.equalsIgnoreCase("Homem de Ferro") ) {
			System.out.println(person);
			System.out.println("Qual o nome do personagem da Malvel?");
			person = scan.nextLine();
			personagens.add(person);
		}
		
		System.out.println("Listas de personagens:"+personagens);
		System.out.println("Deseja remover o nome de algum personagem?" 
		+ "Se sim digite 1 Se não 0");
		int retirar = scan.nextInt();
		
		if(retirar>0) {
			
			System.out.println("Digite o nome do personagemque você gostaria de retirar");
			String removendo = scan.nextLine();
			personagens.remove(removendo);
			
			
		System.out.println("Deseja verificar se o nome de algum personagem da lista ? "
				+ "Se sim digite 2 se não digite 3");
		int verificar = scan.nextInt();
		
		if(verificar>1) {
			
			System.out.println("Digite o nome do personagem que você gostaria de verificar se existe na lista");
			String existe = scan.nextLine();
			System.out.println(personagens.contains(existe));
		}
			
		System.out.println("Deseja alterar o nome de algum personagem?" + 
		"Se sim digite 3 se não digite 0 ");
		int alterar = scan.nextInt();
		
		if(alterar > 2) {
			
			System.out.println("digite o nome do personagem que você gostaria de alterar na lista ");
			String exclui = scan.nextLine();
			personagens.remove(exclui);
			
		System.out.println("Digite o novo nome");
		String novo = scan.nextLine();
		personagens.add(novo);
		scan.close();		
		
	
		}
		
		
		}
		
	}

}
