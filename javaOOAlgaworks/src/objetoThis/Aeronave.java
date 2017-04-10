package objetoThis;

public class Aeronave {

	int totalAssentos;
	int assentosReservados;
	
	void reservarAssentos(int numeroAssentos){
		
		assentosReservados += numeroAssentos;
	}
	
	int calcularAssentosDisponiveis(){
		
		return totalAssentos - assentosReservados;
	}
	
	void alterarTotalAssentos(int totalAssentos){
		
		this.totalAssentos = totalAssentos;
	}
}
