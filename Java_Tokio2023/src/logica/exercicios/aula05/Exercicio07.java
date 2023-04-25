package logica.exercicios.aula05;

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		double valorpago;
		double valorproduto;
		double troco;
		
		System.out.println("Informe o valor Pago");
		valorpago = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que foi pago"));
		
		System.out.println("Informe o valor do produto");
		valorproduto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
		
		troco = valorpago - valorproduto;
		
	if (troco > 0) {
		
		System.out.println("O troco a ser dado é de: " + troco + "Reais");
		
	}else {
		System.out.println("Não é troco");
		
	}


	}

}
