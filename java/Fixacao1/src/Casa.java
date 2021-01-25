
public class Casa{
	String cor;
	Porta porta1;
	Porta porta2;
	Porta porta3;
	
	void pintar(String cor) {
		this.cor = cor;
	}
	
	int openedDoors() {
		int quantidade = 0;
		if(porta1.aberta == true) {
			quantidade += 1;
		} 
		
		if(porta2.aberta == true) {
			quantidade += 1;
		} 
		
		if(porta3.aberta == true) {
			quantidade += 1;
		} 
		
		return quantidade;
		
		
	}
	
}


class TesteCasa{
	public static void main(String[] args) {
		Casa home1 = new Casa();
		home1.cor = "Amarela";
		home1.porta1 = new Porta();
		home1.porta2 = new Porta();
		home1.porta3 = new Porta();
		home1.pintar("Roxo");
		home1.porta1.abrir();
		home1.porta3.abrir();
		home1.porta2.abrir();
		System.out.println(home1.openedDoors());
		
		
	}
}
	





