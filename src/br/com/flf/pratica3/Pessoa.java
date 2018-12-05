package br.com.flf.pratica3;

public class Pessoa {
	
	String nome;
	long cpf;
	String endereco;
	String email;

	public Pessoa(String nome, long cpf, String endereco, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", email=" + email + "]";
	}
}