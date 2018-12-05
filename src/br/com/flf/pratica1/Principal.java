package br.com.flf.pratica1;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Lanche l1 = new Lanche(1.5);
		Lanche l2 = new Lanche(3);
		Lanche l3 = new Lanche(5.35);
		
		MaquinaDeVenderLanches mvl = new MaquinaDeVenderLanches();
		mvl.setLanches(Arrays.asList(l1, l2, l3));
		
		double valorTotal = 0;
		
		for (Lanche lanche : mvl.getLanches()) {
			valorTotal += lanche.getPreco();
		}
		
		mvl.setValorTotal(valorTotal);
		
		
		System.out.println("===== CUPOM=====");
		
		System.out.println("LANCHE | VALOR");
		
		for (Lanche lanche : mvl.getLanches()) {
			System.out.println("Preco = " + lanche.getPreco());
		}
		
		System.out.println("");
		
		System.out.println("Total = " + mvl.getValorTotal());
		
		System.out.println("");
		
		double valorPago = 1;
		
		if(mvl.venderLanche(valorPago) == -1) {
			System.out.println("Nao foi possivel efetuar a venda!");
		} else {
			System.out.println("Troco = " + mvl.venderLanche(valorPago));
			System.out.println("Venda concluida com sucesso!");
		}
		
		System.out.println("===== CUPOM=====");
	}

}
