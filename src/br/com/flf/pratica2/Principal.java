package br.com.flf.pratica2;

public class Principal {
	
	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		double resultado =0;
		
		resultado = c1.somar(3.3, 4.5);
		System.out.println("Soma = " + resultado);
		
		resultado = c1.somar(3, 4);
		System.out.println("Soma c/ sobrecarga = " + resultado);
		
		resultado = c1.subtrair(3.3, 4.5);
		System.out.println("Subtracao = " + resultado);
		
		resultado = c1.subtrair(3, 4);
		System.out.println("Subtracao c/ sobrecarga = " + resultado);
		
		resultado = c1.multiplicar(3.3, 4.5);
		System.out.println("Multiplicacao = " + resultado);
		
		resultado = c1.dividir(3.3, 4.5); 
		if(resultado == -1) {
			System.out.println("Divisao nao possivel!");
		} else {
			System.out.println("Divisao = " + resultado);
		}
		
		double[] array = {2.3, 3.5, 5.8, 5.4, 10};
		
		System.out.println("Media = " + c1.media(array));
	}
}