package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {
	
	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		double media;
		double x = 0;
		
		for(int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100);
			contas[i]= conta;
		}
		
		for(Conta n:contas) {
			x += n.getSaldo();
		}
		
		media = (x / contas.length);
		
		System.out.println(media);
		
				
	}
	
}
