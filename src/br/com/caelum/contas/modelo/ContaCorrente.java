package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta{
	@Override
	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar valor negativo");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException();
		}
		this.saldo -= (valor + 0.10);
	}

	public String getTipo() {
		return "Conta Corrente";
	}
	
	public double getValorImposto() {
		return this.getSaldo() * 0.001;
	}

}
