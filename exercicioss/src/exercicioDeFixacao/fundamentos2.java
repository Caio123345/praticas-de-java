package exercicioDeFixacao;

import java.util.Scanner;

public class fundamentos2 {
	public static void main(String[] args) {
		//	Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		
		double conversao = (fahrenheit - 32) / 1.8;
	
		System.out.print("Valor em Celsius: " + conversao);
		
		scanner.close();
	}
}
