package br.com.caelum.contas.main;

public class Calculadora {

		public static void main(String[] args) {
			double valor1=0;
			double valor2=0;
			Integer i; 
			
			try {valor1 = Double.parseDouble(args[0]);
				valor2 = Double.parseDouble(args[1]);
				System.out.println("Somando: "+Operacao.somar(valor1,valor2));
				System.out.println("Dividindo: "+Operacao.dividir(valor1,valor2));
				System.out.println("Multiplicando: "+Operacao.multiplicar(valor1,valor2));
				System.out.println("Subtraindo: "+Operacao.subtrair(valor1,valor2));
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Digite um numero valido");
			}catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("passe doius valores");
			}
			
			
		}
	
}
