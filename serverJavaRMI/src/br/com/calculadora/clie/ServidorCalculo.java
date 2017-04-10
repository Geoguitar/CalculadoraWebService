package br.com.calculadora.clie;

import java.rmi.Naming;

public class ServidorCalculo {

	public ServidorCalculo() {

		try {
			java.rmi.registry.LocateRegistry.createRegistry(1099);
			Calculadora c = new ImplCalculadora();
			Naming.rebind("rmi://localhost:1099/ServicoCalculo", c);
		} catch (Exception e) {
			System.out.println("Problema: " + e);
		}
	}

	public static void main(String args[]) {
		new ServidorCalculo();
	}
}