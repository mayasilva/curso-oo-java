package br.com.caelum.contas.modelo;
/**
 * Class responsavel por moldar as contas do banco
 * 
 * @MayaraAlves
 * */
abstract public class Conta implements Comparable<Conta> {
	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar"+
												"um valor negativo");
		} else {
			this.saldo += valor;
		}
		
	}

	public void saca(double valor) {
		if (valor <0) {
			throw new IllegalArgumentException("Você não pode sacar"+
												"um valor negativo");
		} else {
			saldo -= valor;
		}
		
	}
	
	public void transfere(double valor,Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
		
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	abstract public String getTipo();
	/*{
		return "conta";
	}*/
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[titular="+titular+" , numero="+numero+" , agencia="+agencia+"]";
	}
	
//	public boolean equals(Object obj) {
//		if (obj == null) {
//			return false;
//		}
//		Conta outraConta = (Conta) obj;
//		
//		return this.numero == outraConta.numero && 
//				this.agencia.equals(outraConta.agencia);
//	}
	
	public int compareTo(Conta outraConta){
		return this.titular.compareTo(outraConta.titular);
	}

}
