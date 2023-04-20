package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercício02 {

	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite um número"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite o segundo numero"));
		if (n1 > n2) {
			JOptionPane.showMessageDialog(null, "O maior numero é: " + n1);
		} else if (n1 < n2) {
			JOptionPane.showMessageDialog(null, "O maior numero é: " + n2);

		} else {
			JOptionPane.showMessageDialog(null, "Os numeros são iguais");

		}

	}

}
