package br.com.flf.pratica3;

public class Principal {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Maria", 1236479, "Rua da Maria", "maria@email.com.br");
		
		System.out.println("PESSOA 1");
		System.out.println("nome = " + pessoa1.nome);
		System.out.println("cpf = " + pessoa1.cpf);
		System.out.println("end = " + pessoa1.endereco);
		System.out.println("email = " + pessoa1.email);
		
		Pessoa2 pessoa2 = new Pessoa2();
		pessoa2.setNome("Joao");
		pessoa2.setCpf(154987);
		pessoa2.setEndereco("Rua do Joao");
		pessoa2.setEmail("joao@email.com.br");
		System.out.println(pessoa1.toString()); // retorno padrao = caminho da classe + nome da classe + @ + endereco
		System.out.println("");
		
		System.out.println("PESSOA 2");
		System.out.println("nome = " + pessoa2.getNome());
		System.out.println("cpf = " + pessoa2.getCpf());
		System.out.println("end = " + pessoa2.getEndereco());
		System.out.println("email = " + pessoa2.getEmail());
		System.out.println(pessoa2.toString()); // retorno padrao = caminho da classe + nome da classe + @ + endereco
	}
}
