package aula01.pessoa;

public class Pessoa {
    // 4 atributos
    String nome;
    int idade;
    protected double altura; // nivel de pacote
    private char sexo;

    public Pessoa() { // default new contrutor
    }

    public Pessoa(String nome, int idade, double altura, char sexo) { // construtor com parametros
        this.altura = altura;
        this.idade = idade;
        this.sexo = sexo;
        this.nome = nome;
    }

    public void setPessoa(String nome, int idade, double altura, char sexo) { // construtor com parametros
        this.altura = altura;
        this.idade = idade;
        this.sexo = sexo;
        this.nome = nome;
    }

    public void setSexo(char c) { // setar um valor a um atributo privado
        this.sexo = c;
    }

    public char getSexo() { // obtem e retorna um atributo privado publicamente
        return this.sexo;
    }

    public void apresentacao() { // metodo pra apresentar nome e idade
        System.out.println("Meu nome é " + nome);
        System.out.println("Minha idade é " + idade);
    }

    public void adicional() { // metodo pra apresentar sexo e altura
        System.out.println("Sexo: " + sexo);
        System.out.println("Altura: " + altura + "m");
    }

}
