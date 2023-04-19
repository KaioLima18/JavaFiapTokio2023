package logica.aulas.aula06;

public class IntroducaoCondicionais {

	public static void main(String[] args) {

		// ESTRUTURA CONDICIONAL SIMPLES

		float nota = 7;

		if (nota < 6) {
			System.out.println("Sua nota e: " + nota);
		}

		System.out.println("FIM");

		// ________________
		// ESTRUTUTA CONDICINAL COMPOSTA
		// _________________

		float notafinal = 8;

		if (notafinal < 6) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado");
		}

		// --------------
		// ESTRUTURA CONDICIONAL ENCADEADA
		// --------------

		float notaFinal = 10;
		if (notaFinal < 4) {
			System.out.println("Reprovado");
		} else {
			if (notaFinal < 6) {
				System.out.println("Recuperacao");
			} else {
				System.out.println("Aprovado");
			}
		}

		float notaFinal2 =5;
		if (notaFinal2 < 4) {
			System.out.println("Reprovado");
		} else if (notaFinal < 6) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Aprovado");
		}

	}

}
