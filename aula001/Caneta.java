package aula001;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor); // this=autorreferência
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	void rabiscar() { // metodo entre ()
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar");
		} else {
			System.out.println("Estou Rabiscando");
		}
	}

	void tampar() { // void = sem retorno
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada =  false;
		
		// na classe caneta temos 5 atributos e 3 metodos
	}
}
