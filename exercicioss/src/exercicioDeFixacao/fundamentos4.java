package exercicioDeFixacao;

import java.util.Scanner;

public class fundamentos4 {
	public static void main(String[] args) {
//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com qualquer numero: ");
		double num = entrada.nextDouble();
		
		System.out.println("qual multiplicação deseja fazer:\n1-Cubo\n2-Quadrado ");
		double mult = entrada.nextDouble();
		
		
		
		if(mult == 1 ) {
			double resultado1 = num * num;
			System.out.println("Resultado "+ resultado1);
		}else {
			 double resultado2 = Math.pow(num, 3);
			 System.out.println("Resultado "+ resultado2);
		}
		
		
		entrada.close();
	}
}
