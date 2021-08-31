package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		
//		int[] idades = new int[5];
		Object[] referencias = new Object[5];
		
		System.out.println(referencias.length);
		
		
		ContaCorrente cc1 = new ContaCorrente(12, 34);
		referencias[0] = cc1;
		
		ContaPoupanca cp2 = new ContaPoupanca(56, 78);
		referencias[1] = cp2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		
		//System.out.println(cc2.getNumero());
		
//		Object referenciaGenerica = contas[1];
//		System.out.println(  referenciaGenerica.getNumero()  );
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast
		
		System.out.println(cp2.getNumero());
		System.out.println("CP agência: " + cp2.getAgencia());
		System.out.println("CP número: " + ref.getNumero());
		
	}

}
