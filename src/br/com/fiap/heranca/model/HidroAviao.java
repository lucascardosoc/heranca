package br.com.fiap.heranca.model;

public class HidroAviao implements Aviao, Barco {

	@Override
	public void navegar() {
		System.out.println("Hidro avi�o navegando");
	}

	@Override
	public void voar() {
		System.out.println("Hidro avi�o voando");
	}

}
