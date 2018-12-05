# Pratica-POO
Atividade prática 1

Contexto:
Você foi selecionado para implementar um programa para uma máquina que
vende lanches naturais. O usuário deve inserir uma quantia em dinheiro e
máquina devolve o lanche para o usuário. Por hora, considere que a máquina
trabalha apenas com um único tipo de lanche.
1. Criar as classes que representam as entidades do sistema.
a. Classe ​Lanche​.
i. campos

1. private double preco;

ii.
iii. métodos

1. get e set dos campos
b. Classe ​MaquinaDeVenderLanches.
i. campos

1. private Lanche lanche;
2. private double valorTotal;

ii. métodos

1. get e set dos campos
2. public void venderLanche(double valor)
a. O método recebe um valor, verifica se o valor é
igual ou maior do que o preço do lanche.
i. se sim, a máquina deve imprimir na tela
“Venda concluída com sucesso!”
ii. se não, a máquina deve imprimir na tela
2. Crie uma classe Principal que contenha apenas o método main() para
testar a sua implementação.
a. Criar a classe Principal;
b. Declarar apenas o método main();
i. public static void main(String[] args) {

//instanciar um objeto da classe
MaquinaDeVenderLanches...
//chamar o método venderLanche...
}

3. Agora modifique o método venderLanche para que ele retorne um troco
caso o valor inserido seja maior que o preço do lanche.
4. Agora modifique o método venderLanche para que o valor das vendas
seja contabilizado no campo valorTotal.

Atividade prática II
1. Crie uma classe chamada Calculadora.
a. Esta classe deve oferecer os seguintes métodos:
i. somar
ii. subtrair
iii. multiplicar
iv. dividir
b. Cada método deve receber dois parâmetros formais do tipo double.
c. O método retorna um double que é o resultado da operação de cada
método.
d. OBS> Esta classe não possui campos e nem construtor, apenas os métodos
descritos acima!

2. Criar uma classe principal com um método main()
a. Exemplo public static void main(String[] args) { implementação.. }
b. Dentro do método main()
i. instancie um objeto da classe calculadora;
1. Exemplo: Calculadora c1 = new calculadora;

ii. efetuar uma chamada de cada método da classe Calculadora e passe
os parâmetros reais durante a chamada
1. Exemplo c1.somar(3.3,4.5);

c. Utilize o comando System.out.println() para mostrar o resultado na
tela.

3. Fazer a SOBRECARGA dos métodos.
a. Na classe Calculadora declare uma nova versão do método somar() e
subtrair()
i. o deve receber um par de inteiros e retorna um inteiro.a nova
versã

4. Fazer a chamada dos métodos sobrecarregados na classe Principal.
a. Basicamente você deve repetir as ações do passo 2 desta prática para
os métodos sobrecarregados.

5. Na classe calculadora, crie um método que calcule e retorne a média dos
valores contidos em um array de números.
a. o método deve receber como parâmetro um array de doubles
b. DICAS:
i. Dentro da implementação do método deve haver um laço que percorre
todo o array.
ii. A cada iteração do laço uma variável auxiliar deve ser
incrementada com o valor correspondente.
1. exemplo total = total + array[i];

iii. Ao final do laço basta dividir a variável auxiliar total pelo
tamanho do array.

6. Na classe Principal você deve declarar um vetor de doubles com valores.
a. double[] array = {2.3,3.5,5.8,5.4,10};
7. Faça uma chamada do método média passando o array como parâmetro.
a. exemplo: c1.media(array);
b. Use um System.out.println(); para ver o resultado.

Prática 3

ETAPA 1
1. Crie uma classe principal com apenas o método main( );
a. Exemplo public static void main(Strings args[ ]) { código.. }

ETAPA 2
1. Crie uma classe Pessoa com os seguintes atributos (OBS: declare todos do tipo público):
a. String nome, long cpf, String endereco, String email.
2. Crie um construtor na classe Pessoa com todos parâmetros.
a. Exemplo: public Construtor( String nome, long cpf, String endereco, String
email) { código... }

ETAPA 3
1. Na classe principal crie uma instância chamada pessoa1 da classe Pessoa. Passe os parâmetros de
configuração da classe para o construtor.
a. Exemplo: Nome_da_Classe objeto = new Nome_da_Classe (“valor_string” ,
valor_numérico...);

2. Na classe principal mostre o conteúdo de cada atributo do objeto que você acabou de instanciar, utilizando
System.out.println();
ETAPA 4
1. Crie uma classe chamada Pessoa2 contendo exatamente os mesmo atributos da classe Pessoa, porém
com visibilidade private.
2. Crie um construtor vazio.
3. Crie os métodos get e set para cada atributo da classe Pessoa2.
4. Na classe principal, crie um objeto da classe Pessoa2 chamado pessoa2. OBS: Use o construtor sem
parâmetros!
5. Utilize os métodos sets para configurar os valores de cada atributo do seu objeto pessoa2.
a. Exemplo: objeto.setNome(“João”);
6. Ainda na classe principal utilize os métodos get para mostrar o valor de cada atributo de pessoa2.
ETAPA5
1. Todas as classes em java herdam da classe Objetc de maneira implícita. Com isso qualquer classe criada
herda alguns métodos de Object. Entre esses métodos podemos citar o toString(). Ele retorna a conversão
do objeto que o invoca em String.
2. Vamos testar o método toString.
a. Na classe principal realize uma chamada do método toString por um dos objetos que você criou de
Pessoa ou Pessoa2. exemplo: objeto.toString() OBS: Use o comando System.out.println() para ver
o resultado!
b. Qual foi o resultado? Deve ter sido algo do tipo Teste@adaa7
c. O método toString é chamada de maneira implícita quando tentamos imprimir um objeto.
d. Realize uma chamada do System.out.println passando como parâmetro um dos objetos
instanciados e configurados até agora.
3. Vamos sobrescrever o método toString().
a. Como o método toString() é herdado via herança de classes, podemos sobrescrevê-lo.
b. Na classe pessoa, faça a sobrescrita do método toString(), fazendo com que ele retorne todos os
campos do tipo string que a sua classe possui.
i. EXEMPLO: toString(){ return lista_de_campos_do_tipo_String; }
ii. Lembre-se que a assinatura de um métod sobrescrito deve ser igual a do original.
4. Realize uma chamada do System.out.println(); passando como parâmetro um objeto da classe Pessoa,
devidamente configurado.
