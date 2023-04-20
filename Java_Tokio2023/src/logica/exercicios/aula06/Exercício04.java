package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercício04 {

	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite um número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite o segudo número: "));
		int n3 = n1 / n2;
		int n4 = n3 % n1 / n2;
		if (n4 == 0) {
			JOptionPane.showMessageDialog(null, "O números são múltiplos");
		} else {
			JOptionPane.showMessageDialog(null, "Eles não são múltiplos");
		}

	}

}
