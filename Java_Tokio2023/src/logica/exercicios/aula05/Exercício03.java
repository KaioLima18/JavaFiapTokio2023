package logica.exercicios.aula05;

import java.util.Scanner;


public class Exercício03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira seu nome: ");
		String pessoa = entrada.nextLine();
		System.out.println("Ola: " + pessoa);
		
		System.out.println(" ");
		System.out.println("Selecione algum dos generos abaixo em que voce se idenifica:");
		System.out.println("{F} Feminino");
		System.out.println("{M} Masculino");
		System.out.println("{O} Outro");
		System.out.println("{N} Nao Responder");
		
		
		char gen = entrada.nextLine().charAt(0);
		
		System.out.println("Ola, " + pessoa + " Seu genero: " + gen);
		
		
		
		

		
		
	}
}