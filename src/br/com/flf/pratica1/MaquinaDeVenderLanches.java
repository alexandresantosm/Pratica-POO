package br.com.flf.pratica1;

import java.util.ArrayList;
import java.util.List;

public class MaquinaDeVenderLanches {
	
	private List<Lanche> lanches = new ArrayList<>();
	private double valorTotal;
	
	public MaquinaDeVenderLanches() {
		
	}

	public MaquinaDeVenderLanches(Lanche lanche, double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Lanche> getLanches() {
		return lanches;
	}

	public void setLanches(List<Lanche> lanches) {
		this.lanches = lanches;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	/*public void venderLanche(double valor) {
		if(valor >= this.valorTotal) {
			System.out.println("Venda concluida com sucesso!");
		} else {
			System.out.println("Nao foi possivel efetuar a venda!");
		}
	}*/
	
	public double venderLanche(double valor) {
		double troco = 0;
		if (valor >= this.valorTotal) {
			troco = valor - this.valorTotal; 
		} else {
			troco = -1;
		}
		
		return troco;
	}
}