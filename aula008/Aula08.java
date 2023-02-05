package aula008;

public class Aula08 {

	public static void main(String[] args) {

		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		Goldfish g = new Goldfish();
		Arara e = new Arara();
		
		m.setPeso(112f);
		m.setCorPelo("Laranja");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		a.locomover();
		
		p.emitirSom();
		
		r.alimentar();
		
		c.locomover();
		
		k.locomover();

	}

}
