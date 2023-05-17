package exercicioDeFixacao;

import java.util.Scanner;

public class fundamentos1 {
	public static void main(String[] args) {
		//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		 
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite a temperatura em Fahrenheit: ");
			double celsius = scanner.nextDouble();

			double conversao = ( celsius - 32 ) / 1.8;

			System.out.print("Valor em Celsius: " + conversao);

			scanner.close();
	
}}
