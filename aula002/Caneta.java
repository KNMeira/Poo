package aula002;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor); // this=autorrefer�ncia
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Est� tampada? " + this.tampada);
	}
	
	public void rabiscar() { // metodo entre ()
		if (this.tampada == true) {
			System.out.println("ERRO! N�o posso rabiscar");
		} else {
			System.out.println("Estou Rabiscando");
		}
	}

	public void tampar() { // void = sem retorno
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada =  false;
		
		// na classe caneta temos 5 atributos e 3 metodos
	}
}
