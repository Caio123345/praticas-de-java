package controle.While;

import java.util.Scanner;

public class dessafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadesDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Iforme a nota (ou -1 para sair):");
			nota = entrada.nextDouble();
			
			if(nota <=10 && nota >= 0) {
				total += nota;
				quantidadesDeNotas++;
			}else if(nota != -1){
				System.out.println("Nota invalida!!!");
			}
		}
		//calcular a média
		double media = total / quantidadesDeNotas;
		System.out.println("Média = "+ media);
		entrada.close();
		
	}
	}

