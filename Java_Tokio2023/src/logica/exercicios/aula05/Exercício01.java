package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Ola: " + nome);

		System.out.println(" ");
		System.out.println("Insira seu endereco: ");
		String endereco = entrada.nextLine();
		System.out.println("Seu endereco: " + endereco);

		System.out.println(" ");
		System.out.println("Insira seu CEP: ");
		String cep = entrada.nextLine();
		System.out.println("Seu CEP: " + cep);

		System.out.println(" ");
		System.out.println("Insira seu telefone: ");
		String telefone = entrada.nextLine();
		System.out.println("Seu telefone: " + telefone);

		System.out.println(" ");
		System.out.println("Obrigado pelos seus dados");

	}

}
