package br.com.natanista.contas;

public class Conta {
	private static int identificador;
	private static int totalDeContas;
	private String titular = "Natan";
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataDeAbertura;

	public void sacar(double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente!");
		} else {
			this.saldo -= valor;
		}

	}

	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Não é possível depositar o valor");
		} else {
			this.saldo += valor;
		}
	}

	double calcularRendimento() {
		return this.saldo = (double) this.saldo * 0.1;
	}

	String retornarDadosImpressao() {
		String dados = "Titular:" + this.titular;
		dados += "\nNumero:" + this.numero;
		dados += "\nAgência:" + this.agencia;
		dados += "\nSaldo:" + this.saldo;
		dados += "data de abertura:" + this.dataDeAbertura.formatada();
		return dados;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return this.titular;
	}

	public int getNumero() {
		return this.numero;
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

	// construtor
	Conta(int numero, String titular) {
		this.titular = titular;
		this.numero = numero;
		Conta.totalDeContas = Conta.totalDeContas + 1;
		Conta.identificador = Conta.totalDeContas;
	}

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}

	public static int getIdentificador() {
		return Conta.identificador;
	}

}

class ContaTestDrive {
	public static void main(String[] args) {
		Conta account1 = new Conta(10, "Natan");
		account1.setAgencia("102030");
		account1.setSaldo(2000);
		account1.setData(new Data(2, 10, 2021));
		account1.depositar(100);

		System.out.println(account1.getTitular());

		int total = Conta.getTotalDeContas();
		System.out.println("total de contas: " + total);
	}
}

class Data {
	int dia;
	int mes;
	int ano;
	int anoLimite = 2021;

	String formatada() {
		return (dia + "/" + mes + "/" + ano);
	}

	Data(int dia, int mes, int ano) {
		if (dia < 1 || dia > 31) {
			System.out.println("Dia inválido");
			this.dia = 0;
		}
		if (mes < 1 || mes > 12) {
			System.out.println("Mês inválido");
			this.mes = 0;
		}
		if (ano < 2021) {
			System.out.println("Ano inválido");
		}
		if (dia > 1 || dia <= 31 && mes > 1 || mes <= 12 && ano >= 2021) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
	}
}

class PessoaFisica {
	int cpf;

	PessoaFisica(int cpf) {
		this.cpf = cpf;
	}
}