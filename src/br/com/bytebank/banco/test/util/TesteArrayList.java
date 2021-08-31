package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//generics
		List<Conta> lista = new ArrayList<Conta>(); 
								// Vector - thread safe
		
		//ArrayList<String> nomes = new ArrayList<String>();
		
		Conta cc = new ContaCorrente(22, 333);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(44, 555);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		
		
		Conta cc3 = new ContaCorrente(66, 777);
		lista.add(cc3);
		Conta cc4 = new ContaCorrente(88, 999);
		lista.add(cc4);
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
			
		}
		
		System.out.println("------------------------------");
		
		for(Conta conta : lista) {
			System.out.println(conta);
			
		}

	}

}
