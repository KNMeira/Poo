package aula007;

public class Aula07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitante v1 = new Visitante();
		v1.setNome("Maria");
		v1.setIdade(115);
		v1.setSexo("F");
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno(); //Objeto classe aluno
		a1.setNome("Juscelino");
		a1.setMatricula(1111);
		a1.setCurso("Artes");
		a1.setIdade(89);
		a1.setSexo("M");
		a1.pagarMensalidade();
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1112);
		b1.setNome("Maxine");
		b1.setBolsa(82f);
		b1.setSexo("F");
		b1.pagarMensalidade();
	}

}
