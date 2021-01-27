

package br.com.natanista.Conta;
/**
 * Classe responsável por testar
 * 
 * @author Natan silva
*/
public class Conta {

	private double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public void depositar(double valor) {
		this.saldo += valor;
	}
	/**
	 * método responsável por sacar dinheiro
	 * 
	 * @author Natan silva
	*/
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	

}
