package sobrecargaDeMetodos;

public class testaAeronave {

	public static void main(String[] args) {

		Aeronave aviaoGol = new Aeronave();
		aviaoGol.totalAssentos = 100;
		
		Aeronave aviaoLatam = new Aeronave();
		aviaoLatam.totalAssentos = 130;
		
		aviaoGol.reservarAssentos(10);
		aviaoLatam.reservarAssentos(5);
		
		int assentosGol = aviaoGol.calcularAssentosDisponiveis();
		int assentosLatam = aviaoLatam.calcularAssentosDisponiveis();
		
		System.out.println("\nAssentos disponíveis - Gol: " + assentosGol);
		System.out.println("Assentons disponíveis - Latam: " + assentosLatam);
	}

}
