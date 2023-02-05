package aula008;

public class Cachorro extends Mamifero {

	public void locomover() {
		System.out.println("Andando");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Latindo");
		
	}
}
