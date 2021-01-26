
public class Conta {

	private double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	

}
