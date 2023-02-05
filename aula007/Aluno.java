package aula007;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	public void pagarMensalidade() {
		System.out.println("Pagando Mensalidade do aluno " + this.getNome());
	}

	public int getMatricula() {
		return matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
