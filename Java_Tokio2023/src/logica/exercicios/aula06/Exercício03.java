package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercício03 {

	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual a primeira nota? "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual a segunda nota? "));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual a terceira nota? "));
		int n4 = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual a quarta nota? "));

		int n5 = n1 + n2 + n3 + n4;
		int n6 = n5 / 4;

		if (n6 > 7) {
			JOptionPane.showMessageDialog(null, "Aprovado");
		} else if (n6 == 5 && n6 <= 7) {
			JOptionPane.showMessageDialog(null, "Recuperacao");
		} else {
			JOptionPane.showMessageDialog(null, "Reprovado");
		}

	}

}
