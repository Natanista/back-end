
public class Conta {
	private String titular = "Natan";
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataDeAbertura = new Data();
	
	public void sacar(double valor) {
		if(valor > this.saldo) {
			System.out.println("Saldo insuficiente!");
		} else {
			this.saldo -= valor;
		}
		
	}
	
	public void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("Não é possível depositar o valor");
		}else {
			this.saldo += valor;
		}
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
	 public double getSaldo() {
		 return  this.saldo;
	 }
	 
	 public void setSaldo(double saldo) {
		 this.saldo = saldo;
	 }
	 
	 public String getTitular() {
		 return this.titular;
	 }
	 
	 public void setTitular(String titular) {
		 this.titular = titular;
	 }
	 
	 public int getNumero() {
		 return this.numero;
	 }
	 
	 public void setNumero(int numero) {
		 this.numero = numero;
	 }
	 
	 public String getAgencia() {
		 return this.agencia;
	 }
	 
	 public void setAgencia(String agencia) {
		 this.agencia = agencia;
	 }
	 
	public Data getData() {
		return this.dataDeAbertura;
	}
	
	public void setData(Data data) {
		this.dataDeAbertura = data;
	}
	
	//construtor
	Conta(String titular){
		this.titular = titular;
	}
	//construtor
	 Conta(int numero, String titular) {
	this(titular);
	this.numero = numero;
	}
	 
	 
	 
}

class ContaTestDrive{
	public static void main(String[] args) {
		Conta account1 = new Conta("Natan");
		account1.setTitular("Natan");
		account1.setNumero(10);;
		account1.setAgencia("102030");
		account1.setSaldo(2000);
		account1.setData(new Data());
		account1.depositar(100);
		
		System.out.println(account1.getTitular());
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