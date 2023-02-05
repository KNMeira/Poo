package aula001;

public class Aula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caneta c1 = new Caneta(); // criaçao de um objeto c1 que é uma caneta instanciada 
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampar(); //referencia a atributo
		
		c1.status();// referencia a metodo
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.ponta = 0.7f; 
		c2.modelo = "BIC";
		c2.cor = "Preta";
		c2.destampar();
		c2.status();
		c2.rabiscar();
	}

}
