package metodosComRetorno;

public class TestandoIMC {

	public static void main(String[] args) {

		Paciente  p  = new Paciente();
		p.peso = 63;
		p.altura = 1.77;
		
		IMC imc = p.calcularIndiceDeMassaCorporal();
		
		System.out.println("\nAbaixo do Peso ideal: " + imc.abaixoDoPesoIdeal);
		System.out.println("\nPeso ideal: " + imc.pesoIdeal);
		System.out.println("\nObeso: " + imc.obeso);
		System.out.println("\nGrau de Obesidade: " + imc.grauObesidade);

	}

}
