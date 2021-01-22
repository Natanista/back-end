
public class BalancoTrimestral {
public static void main(String[] args) {
	int gastoJaneiro = 15000;
	int gastoFevereiro = 25000;
	int gastoMarco = 17000;
	int gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
	System.out.println(gastoTrimestre);
	int mediaMes = gastoTrimestre / 3;
	System.out.println("A média de gasto mês é de: R$" + mediaMes);
}
}
