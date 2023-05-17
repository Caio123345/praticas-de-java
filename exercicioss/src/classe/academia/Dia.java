package classe.academia;

public class Dia {
	public static void main(String[] args) {
		
		Dieta ref1 = new Dieta("Arroz, frango e legumes", 1.20);
		Dieta ref2 = new Dieta("Batata, tilapia e legumes", 1.50);
		Dieta ref3 = new Dieta("Macarrão, carne e legumes", 1.60);
		Dieta ref4 = new Dieta("Arroz, carne e legumes", 1.30);
		Dieta ref5 = new Dieta("Macarrão, frango e legumes", 1.40);
		AcademiaExercicios treineiPerna = new AcademiaExercicios("Treino de perna", 1.5);
		AcademiaExercicios treineiPeito = new AcademiaExercicios("Treino de peito", 0.9);
		AcademiaExercicios treineiCostas = new AcademiaExercicios("Treino de costas", 1.3);
		AcademiaExercicios treineiOmbro = new AcademiaExercicios("Treino de ombro", 0.6);
		AcademiaCardio esteira = new AcademiaCardio("esteira", 30, 0.2);
		AcademiaCardio bicicleta = new AcademiaCardio("bicicleta", 30, 0.4);
		AcademiaCardio escada = new AcademiaCardio("escada", 30, 0.8);
		
		Pessoa p = new Pessoa("Caio", 70.0, 1);
		
		System.out.println(p.apresentar());
		p.treinar(treineiPerna);
		p.comer(ref1);
		p.cardio(bicicleta);
		p.dia++;
		System.out.println(p.apresentar());
		p.comer(ref2);
		p.treinar(treineiPeito);
		p.cardio(esteira);
		p.dia++;
		System.out.println(p.apresentar());
		p.treinar(treineiCostas);
		p.comer(ref3);
		p.cardio(escada);
		p.dia++;
		System.out.println(p.apresentar());
		p.comer(ref4);
		p.treinar(treineiOmbro);
		p.cardio(escada);
		p.dia++;
		System.out.println(p.apresentar());
		p.comer(ref5);
		p.treinar(treineiPerna);
		p.cardio(bicicleta);
		p.dia++;
	}
}
