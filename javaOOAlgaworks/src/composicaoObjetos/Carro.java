package composicaoObjetos;

public class Carro {

	String fabricante;
	String modelo;
	String cor;
	String tipoDeCombustivel;
	int anoDeFabricacao;
	double valorDeMercado;
	Proprietario dono = new Proprietario();
	
	void ligar(){
		
		if(modelo != null){
			System.out.println("Ligando :" + modelo);
		}
		
	}
}
