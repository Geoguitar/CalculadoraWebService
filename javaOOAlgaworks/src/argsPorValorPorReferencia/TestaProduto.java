package argsPorValorPorReferencia;

public class TestaProduto {

	public static void main(String[] args) {

		Preco preco = new Preco();
		preco.valorCustos = 140;
		
		Produto produto = new Produto();
		produto.definirPreco(preco, 20, 15);
		
		System.out.println("\nValor custos: " + preco.valorCustos);
		System.out.println("Valor impostos: " + preco.valorImpostos);
		System.out.println("Valor lucro: " + preco.valorLucro);
		System.out.println("-----------\nPreço venda: R$" + preco.precoVenda);
	}

}
