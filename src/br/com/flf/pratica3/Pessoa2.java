package br.com.flf.pratica3;

public class Pessoa2 {
	
	private String nome;
	private long cpf;
	private String endereco;
	private String email;
	
	public Pessoa2() {
		
	}
	
	public Pessoa2(String nome, long cpf, String endereco, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa2 [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", email=" + email + "]";
	}
}