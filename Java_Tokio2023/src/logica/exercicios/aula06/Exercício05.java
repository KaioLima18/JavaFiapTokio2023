package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercício05 {

	public static void main(String[] args) {

		double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um numero"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro numero"));
		String n3 = JOptionPane.showInputDialog(null, "Qual a operação deseja fazer?\n+\n-\n*\n/\n");

		switch (n3) {
		case "+":
			JOptionPane.showMessageDialog(null, "A soma dos números é: " + (n1 + n2));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, "A subtração dos números é: " + (n1 - n2));
			break;
		case "*":
			JOptionPane.showMessageDialog(null, "A multiplicação dos números é: " + ( n1* n2));
			break;
		case "/":
			JOptionPane.showMessageDialog(null, "A divisão dos números é: " + (n1 / n2));
			break;
		default:
			System.out.println("OI");

		}

	}

}
