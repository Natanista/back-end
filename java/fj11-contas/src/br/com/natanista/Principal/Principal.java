package br.com.natanista.Principal;
import br.com.natanista.Conta.*;

class Principal {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.depositar(100);
		System.out.println(conta.getSaldo());
	
	}
}