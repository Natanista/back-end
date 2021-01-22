
public class ContaBancaria {
	int numero;
	String titular;
	double saldo;
	
	void saque(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	
	void deposito(double quantidade) {
		this.saldo += quantidade;
	}
}

class Programa {
	public static void main(String[] args) {
		ContaBancaria minhaConta = new ContaBancaria();
		minhaConta.titular = "Natan";
		minhaConta.saldo = 20000;
		minhaConta.numero = 972564;
		System.out.println("Saldo atual: R$" + minhaConta.saldo);
		
		minhaConta.saque(10000);
		System.out.println(minhaConta.saldo);
		
		ContaBancaria c1 = new ContaBancaria();
		c1.deposito(100);
		ContaBancaria c2 = c1; 
		c2.deposito(200);
		System.out.println("saldo c1: " + c1.saldo);
		System.out.println("saldo c2: " + c2.saldo);
		
	}
}

