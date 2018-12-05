package br.com.flf.pratica2;

public class Calculadora {
	
	public double somar(double a, double b){
		return a + b;
	}
	
	public double subtrair(double a, double b){
		return a - b;
	}
	
	public double multiplicar(double a, double b){
		return a * b;
	}
	
	public double dividir(double a, double b){
		double resultado = 0;
		if(b == 0) {
			resultado = -1;
		} else {
			resultado = a / b;
		}
		return resultado;
	}
	
	public int somar(int a, int b){
		return a + b;
	}
	
	public int subtrair(int a, int b){
		return a - b;
	}
	
	public double media(double[] array) {
		double total = 0;
		
		for(int i = 0; i< array.length; i++) {
			total += array[i];
		}
		return total / array.length;
	}
}