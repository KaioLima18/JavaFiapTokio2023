package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercício06 {

	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu ano de nascimento: "));
		int idade = 2023-n1;
		if(idade<16) {
			JOptionPane.showMessageDialog(null, "Sua idade é:"+idade+"\n voto não é acessivel para você esse ano");
		}else if(idade>16 && idade<=18) {
			JOptionPane.showMessageDialog(null, "Sua idade é: "+idade+"\n voto é opcional esse ano");
		}else {
			JOptionPane.showMessageDialog(null, "Sua idade é: "+idade+"\n voto é obrigatório esse ano");
		}
		
		
	}

}
