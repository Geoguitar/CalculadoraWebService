package sobrecargaDeMetodos;

public class Aeronave {

	int totalAssentosNormais;
	int totalAssentosEspeciais;
	int assentosNormaisReservados;
	int assentosEspeciaisReservados;
	
	
	void reservarAssentos(int numeroAssentos){
		
		this.assentosNormaisReservados += numeroAssentos;
	}
	
	int calcularAssentosDisponiveis(){
		
		return totalAssentosNormais - assentosNormaisReservados 
				+ totalAssentosEspeciais - assentosEspeciaisReservados;
	}
	
	void resevarAssentos(int assentosNormais, int assentosEspeciais){
		
		this.assentosNormaisReservados += assentosNormais;
		this.assentosEspeciaisReservados += assentosEspeciais;
	}
	
	void alterarTotalAssentos(int totalAssentos){
		
		this.totalAssentosEspeciais = totalAssentos;
		this.totalAssentosNormais = totalAssentos;
	}
}
