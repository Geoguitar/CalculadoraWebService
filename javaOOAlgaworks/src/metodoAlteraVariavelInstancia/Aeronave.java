package metodoAlteraVariavelInstancia;

public class Aeronave {

	int totalAssentos;
	int assentosReservados;
	
	void reservarAssentos(int numeroAssentos){
		
		assentosReservados += numeroAssentos;
	}
	
	int calcularAssentosDisponiveis(){
		
		return totalAssentos - assentosReservados;
	}
}
