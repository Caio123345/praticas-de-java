package exercicioDeFixacao;

import java.util.Scanner;

public class fundamentos3 {
	public static void main(String[] args) {
//		Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a sua altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		double imc = peso/ (altura * altura);
		
		if(imc <= 18.5) {
			System.out.println("Seu IMC é: "+imc);
			System.out.println("Abaixo do Peso");
		}else if(imc <= 24.9) {
			System.out.println("Seu IMC é: "+imc);
			System.out.println("Peso Normal");
		}else if(imc <= 29.9) {
			System.out.println("Seu IMC é: "+imc);
			System.out.println("Acima do peso (sobrepeso)");
		}else if(imc <= 34.9) {
			System.out.println("Seu IMC é: "+imc);
			System.out.println("Obesidade I");
		}else if(imc <= 39.9) {
			System.out.println("Seu IMC é: "+imc);
			System.out.println("Obesidade II");
		}else if(imc > 40) {
			System.out.println("Seu IMC é: "+imc);
			System.out.println("Obesidade III");
		}
		
		
		entrada.close();
	}
}
