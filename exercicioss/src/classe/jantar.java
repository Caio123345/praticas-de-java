package classe;

public class jantar {
	public static void main(String[] args) {
		
		comida c1 = new comida("Arroz", 0.3);
		comida c2 = new comida("Feijão", 0.5);
		pessoa p = new pessoa("Marianna", 54.9);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
		
	}
}
