package classe;



public class produtoTeste {

	public static void main(String[] args) {
			
		
		produto p1 = new produto("Notebook", 4600.00);
		
		var p2 = new produto();
		p2.nome = "Celular";
		p2.preco = 2600.00;
		
		produto.desconto = 0.10;
		
		
	
		System.out.println(p1.nome + " -> " + p1.precoComDesconto());
		System.out.println(p2.nome + " -> " + p2.precoComDesconto());
		
		double ValorFinal1 = p1.precoComDesconto();
		double ValorFinal2 = p2.precoComDesconto(0.1);
		double MediaDoCarrinho = (ValorFinal1 + ValorFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", MediaDoCarrinho);
		
	}
}
