package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {
	private double valor;
	private String titular;
	private int numeroApolice;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getTipo() {
		return "Seguro de Vida";
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 42 + this.valor * 0.02;	
	}
	
	
}
