package exercicioDeFixacao;

import java.util.Scanner;

public class fundamentos5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		double a, b, c; // valores dos coeficientes da equação
	    double delta, x1, x2;
	    
	    System.out.print("Digite o valor de a: ");
	    a = entrada.nextDouble();
	    System.out.print("Digite o valor de b: ");
	    b = entrada.nextDouble();
	    System.out.print("Digite o valor de c: ");
	    c = entrada.nextDouble();
		
	    delta = Math.pow(b, 2) - 4 * a * c;
	    
	    // verifica se a equação tem raízes reais
	    if (delta < 0) {
	      System.out.println("A equação não possui raízes reais.");
	    } else if (delta == 0) {
	      x1 = -b / (2 * a);
	      System.out.println("A equação possui apenas uma raiz real: x = " + x1);
	    } else {
	      x1 = (-b + Math.sqrt(delta)) / (2 * a);
	      x2 = (-b - Math.sqrt(delta)) / (2 * a);
	      System.out.println("A equação possui duas raízes reais: x1 = " + x1 + " e x2 = " + x2);
	    }
	    
		entrada.close();
	}
}
