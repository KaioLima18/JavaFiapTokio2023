package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// PEÇA 1

		System.out.println("Digite o nome da peca 1: ");
		String nomePeca1 = entrada.nextLine();

		System.out.println("Digite o numero de pecas1: ");
		int numPecas1 = Integer.parseInt(entrada.nextLine());

		System.out.println("Digite o valor unitario das pecas1: ");
		double precoPecas1 = entrada.nextDouble();

		System.out.println("Nome da peca 1: " + nomePeca1);
		System.out.println("Num da peca 1: " + numPecas1);
		System.out.println("Preco da peca 1: " + precoPecas1);
		
		System.out.println(" ");

		// PEÇA 2

		Scanner pcs2 = new Scanner(System.in);
		System.out.println("Digite o nome da peca 2: ");
		String nomePeca2 = pcs2.nextLine();

		System.out.println("Digite o numero de pecas2: ");
		int numPecas2 = Integer.parseInt(pcs2.nextLine());

		System.out.println("Digite o valor unitario das pecas2: ");
		double precoPecas2 = pcs2.nextDouble();

		System.out.println("Nome da peca 2: " + nomePeca2);
		System.out.println("Num da peca 2: " + numPecas2);
		System.out.println("Preco da peca 2: " + precoPecas2);

		System.out.println(" ");

		// TODAS AS PEÇAS

		System.out.println("O preco total de 1 deu: " + precoPecas1 * numPecas1);
		System.out.println("O preco total de 2 deu: " + precoPecas2 * numPecas2);
		System.out.println("Tudo: " );

	}

}
