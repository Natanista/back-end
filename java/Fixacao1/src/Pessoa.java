
public class Pessoa {
	String nome;
	int idade;
	
	int fazAniversario() {
		return idade += 1;
	}
}

class TestePessoa{
	public static void main(String[] args) {
		Pessoa person = new Pessoa();
		person.nome = "Natan";
		person.idade = 21;
		person.fazAniversario();
		System.out.println(person.idade);
	}
}


