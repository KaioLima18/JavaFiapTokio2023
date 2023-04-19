package JavaFiap2023;

import java.util.Scanner;

public class segundo_program {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome ");
		String nome = entrada.nextLine();
		System.out.println("Bem Vindo, " + nome);
		System.out.println("Digite sua idade");
		System.out.println("Sua idade é: " + entrada.nextInt());
		
		
		entrada.close();
	}
}