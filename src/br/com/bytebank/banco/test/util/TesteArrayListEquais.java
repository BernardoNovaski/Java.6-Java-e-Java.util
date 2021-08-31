package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquais {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 333);
//		Conta cc2 = new ContaCorrente(44, 555);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);

		
		//generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 333);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(44, 555);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(44, 555);
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe? " + existe);
		
		for(Conta conta : lista) {
			System.out.println(conta);
			
		}

	}

}
