package aula008;

public abstract class Animal {
	// Atributos de Animal
	protected float peso;
	protected int idade;
	protected int membros;
	
	// M�todos de Animal
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	public float getPeso() {
		return peso;
	}
	public int getIdade() {
		return idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}

	
}
