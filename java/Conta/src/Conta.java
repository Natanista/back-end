
public class Conta {
	String titular;
	int numero;
	String agencia;
	double saldo;
	Data dataDeAbertura = new Data();
	
	void sacar(double valor) {
		this.saldo -= valor;
	}
	
	void depositar(double valor) {
		this.saldo += valor;
	}
	
	double calcularRendimento() {
		return this.saldo = (double)this.saldo * 0.1;
	}
	
	 String retornarDadosImpressao(){
		String dados = "Titular:" + this.titular;
		dados += "\nNumero:" + this.numero;
		dados += "\nAgência:" + this.agencia;
		dados += "\nSaldo:" + this.saldo;
		dados += "data de abertura:" + this.dataDeAbertura.formatada();
		return dados;
	}
}

class ContaTestDrive{
	public static void main(String[] args) {
		Conta account1 = new Conta();
		account1.titular = "Natan";
		account1.numero = 1;
		account1.agencia = "102020-2";
		account1.saldo = 500;
		account1.dataDeAbertura = new Data();
		account1.depositar(100);
		System.out.println("saldo atual: " + account1.saldo);
		System.out.println("rendimento mensal: " + account1.calcularRendimento());
		
		Conta account2 = new Conta();
		account2.titular = "Bel";
		account2.saldo = 500;
		Conta account3 = new Conta();
		account2.titular = "Bel";
		account2.saldo = 500;
		
		//apontando pra mesma referencia na memoria!!!!
		account3 = account2;
		
		//são diferetes sem a linha de cima, pois apontam pra locais diferentes na memoria!!
		if(account2 == account3) {
			System.out.println("Iguais!");
		} else {
			System.out.println("Diferentes!");
		}
		
		System.out.println(account1.retornarDadosImpressao());
		
		
	}
}

class Data{
	int dia;
	int mes;
	int ano;
	
	String formatada(){
		return (dia + "/" + mes + "/" + ano);
	}
	
	
}