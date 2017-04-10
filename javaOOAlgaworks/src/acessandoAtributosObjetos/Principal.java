package acessandoAtributosObjetos;

public class Principal {

	public static void main(String[] args) {

		Carro meuCarro = new Carro();
		meuCarro.anoDeFabricacao = 2015;
		meuCarro.cor = "Preta";
		meuCarro.fabricante = "Honda";
		meuCarro.modelo = "XRE300";
		meuCarro.tipoDeCombustivel = "Flex";
		meuCarro.valorDeMercado = 15000;
		
		System.out.println("Modelo:" + meuCarro.modelo);
		System.out.println("Ano:" + meuCarro.anoDeFabricacao);
		System.out.println("Cor:" + meuCarro.cor);
		System.out.println("Fabricante:" + meuCarro.fabricante);
		System.out.println("Combustível:" + meuCarro.tipoDeCombustivel);
		System.out.println("Preço: R$" + meuCarro.valorDeMercado);

		System.out.println("\n------------------------------------------");
		
		Carro seuCarro = new Carro();
		System.out.println("Modelo:" + seuCarro.modelo);
		System.out.println("Ano:" + seuCarro.anoDeFabricacao);
		System.out.println("Cor:" + seuCarro.cor);
		System.out.println("Fabricante:" + seuCarro.fabricante);
		System.out.println("Combustível:" + seuCarro.tipoDeCombustivel);
		System.out.println("Preço: R$" + seuCarro.valorDeMercado);
		
		System.out.println("\n------------------------------------------");
		
		
		
		Carro minhaMoto = new Carro();
		minhaMoto.anoDeFabricacao = 2015;
		minhaMoto.cor = "Preta";
		minhaMoto.fabricante = "Honda";
		minhaMoto.modelo = "XRE300";
		minhaMoto.tipoDeCombustivel = "Flex";
		minhaMoto.valorDeMercado = 15000;
		
		System.out.println("Modelo:" + minhaMoto.modelo);
		System.out.println("Ano:" + minhaMoto.anoDeFabricacao);
		System.out.println("Cor:" + minhaMoto.cor);
		System.out.println("Fabricante:" + minhaMoto.fabricante);
		System.out.println("Combustível:" + minhaMoto.tipoDeCombustivel);
		System.out.println("Preço: R$" + minhaMoto.valorDeMercado);

		System.out.println("\n------------------------------------------");

		
	}

}
