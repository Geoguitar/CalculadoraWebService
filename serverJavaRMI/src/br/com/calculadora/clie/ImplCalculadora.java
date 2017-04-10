package br.com.calculadora.clie;

import java.rmi.RemoteException;

public class ImplCalculadora extends java.rmi.server.UnicastRemoteObject
		implements Calculadora {

	public ImplCalculadora() throws RemoteException {
		super();
	}

	public long add(long a, long b) throws RemoteException {
		return a + b;
	}

	public long sub(long a, long b) throws RemoteException {
		return a - b;
	}

	public long mul(long a, long b) throws RemoteException {
		return a * b;
	}

	public long div(long a, long b) throws RemoteException {
		return a / b;
	}
}