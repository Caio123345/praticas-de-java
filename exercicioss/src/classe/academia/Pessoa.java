package classe.academia;



public class Pessoa {
	String nome;
	double peso;
	int dia = 1;
	
	
	Pessoa(String nome, double peso, int dia ){
		this.nome = nome;
		this.peso = peso;
		this.dia = dia;
		dia++;
				
	}
	
	void comer(Dieta Dieta ) {
		if(Dieta != null) {
			this.peso += Dieta.peso;
			}
		}
		
	void treinar(AcademiaExercicios AcademiaExercicios) {
		if(AcademiaExercicios != null) {
			this.peso -= AcademiaExercicios.peso;
		}
	}
		
		void cardio(AcademiaCardio AcademiaCardio) {
		if(AcademiaCardio != null) {
			this.peso -= AcademiaCardio.peso;
		}
	}
	String apresentar(){
			return "Olá, eu sou o " + nome + ". Hoje é o dia " +dia+" e estou com " + peso + " kgs." ;
		}
}
