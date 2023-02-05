package aula009;

public class Cachorro extends Lobo {
	
	@Override
	public void emitirSom() {
		System.out.println("Au! Au!");
	}

	public void reagir(String frase) {
		if(frase.equals("Hora de Passear") || frase.equals("Cheguei")) {
			System.out.println("Pular e Latir");
		} else {
			System.out.println("Rosnar");
		}
	}
	
	public void reagir(int hora, int min) { 
		if(hora < 12) {
			System.out.println("Brincar");
		} else if (hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Pular e Correr");
		}
	}
	
	public void reagir(boolean dono) {
		if (dono = true) {
			System.out.println("Feliz");
		} else {
			System.out.println("Triste");
		}
	}
	
	public void reagir(int idade, float peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Correr");
			} else {
				System.out.println("Latir");
			} 	
		} else {
			if (peso < 10) {
				System.out.println("Rosnar");
			} else {
				System.out.println("Ignorar");
			}
		}
	
	}
}