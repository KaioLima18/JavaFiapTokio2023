package logica.aulas.aula07;

import java.util.Scanner;

public class WhileLaco {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int i = 0;

		while (i < 11) {
			System.out.println("Ola mundo");
			i++;
		}
	

		String jogar = "sim";

		while (jogar == "sim");{
			
		{
			System.out.println("Repete ou inicia o jogo");

			System.out.print("Deseja jogar novamente?");
			jogar = entrada.nextLine();
	}

		System.out.println("OI");

		// MODIFICADORES DE LAÇO

		int f = 0;

		while (f < 10)
			;
		{
			i++;

			if (i == 3 || i == 5) {
				continue;
			}
			
			if (i == 7) {
				break;
			}
			}

			System.out.println("Cambalhota");

		}
	}

}

}