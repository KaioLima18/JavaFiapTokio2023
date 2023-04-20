package logica.exercicios.aula06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Excercício01 {

	public static void main(String[] args) {
	
		int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite um número para saber se ele é par ou impar\n Digite um número"));
		int n2 = n1%2;
		if (n2==0) {
			JOptionPane.showMessageDialog(null, "O nuemro é par");
		}else {
			JOptionPane.showMessageDialog(null, "O numero é impar");
			
		}

		


	}

}
