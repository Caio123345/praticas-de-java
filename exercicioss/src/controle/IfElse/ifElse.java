package controle.IfElse;

import javax.swing.JOptionPane;

public class ifElse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("informe o número: ");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) 
		{
			System.out.println("Número par!");
		}
		else
		{
			System.out.println("Número ímpar!");
		}
	}
}
