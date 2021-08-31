package br.com.bytebank.banco.test;

//import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;
//import br.com.bytebank.banco.modelo.*;


//br.com.bytebank.banco.test.TesteContas
public class TesteContas {
	
	
	//java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException {

		
		//Full Qualified Name FQN
		ContaCorrente cc = new ContaCorrente(222, 222);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(333, 333);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());
	}

}
