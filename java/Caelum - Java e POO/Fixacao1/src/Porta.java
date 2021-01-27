
public class Porta {
	String cor;
	boolean aberta;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	 public void abrir() {
		 if(this.aberta == false) {
			 this.aberta = true;
		 }
		 
		}
	 
	 public void fechar() {
		 if(this.aberta == true) {
			 this.aberta = false;
		 }
	 }
	 
	 void pinta(String cor) {
		 this.cor = cor;
	 }
	 
	 String estaAberta() {
		 if(this.aberta == true) {
			   return "A porta está aberta";
		 }
		 else {
			   return "A porta está fechada";
		 } 
	 }
	 }

class TestePorta{
	public static void main(String[] args) {
		Porta portao = new Porta();
		portao.cor = "Azul";
		portao.dimensaoX = 0.5;
		portao.dimensaoY = 0.4;
		portao.dimensaoZ = 0.3;
		portao.abrir();
		portao.pinta("vermelho");
		portao.fechar();
		System.out.println(portao.estaAberta());
		System.out.println(portao.cor);
	}
}
	



