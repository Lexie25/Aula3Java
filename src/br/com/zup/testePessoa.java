package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class testePessoa {

	public static void main(String[] args) {

	Pessoa vini = new Pessoa ("Vinicius", 1.75);
	Pessoa joao = new Pessoa ("Joao",1.78);
	List<Pessoa>arrayList = new ArrayList<Pessoa>();
	arrayList.add(vini);
	arrayList.add(joao);
	
	arrayList.remove(1);
	
	System.out.println(arrayList.get(1));
	System.out.println(arrayList.contains(joao));
	System.out.println(arrayList.isEmpty());
	System.out.println();
	
	for (Pessoa pessoa : arrayList) {
		System.out.println(pessoa);
		
	}
		
		
		
	}

}
