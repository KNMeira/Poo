package aula006;

public class Aula06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lutador l[] = new Lutador[4];
		
		l[0] = new Lutador("Pretty Boy", "Fran�a", 31, 1.75f, 68.9f, 11, 2, 1 );
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2] = new Lutador("Snapshadow","EUA", 35, 1.65f, 80.9f, 12, 2, 1 );
		l[3] = new Lutador("Dead Code", "Austr�lia", 28, 1.93f, 81.6f, 13, 0, 2);
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.lutar();
		l[1].status();
		
		/*l[3].empatarLuta();
		l[3].apresentar();
		l[3].status();*/
	}

}
