package aula02;

public class Aluno {
    //atributos da classe aluno, que abstrai toda informação para o objeto aluno
    String nome;
    int idade;
    double [] notas;
    String [] disciplinas;
    Faculdade atual = new Faculdade(); // create the dependency object of this class
    
    void apresentacao(){
        System.out.println("Meu nome é "+ nome);
        System.out.println("Idade: "+idade+ " anos");
    }
    
    public Aluno (){
        
    }
    
    public Aluno (String nome, int idade ,double [] n, String [] d){
        this.nome = nome;
        this.idade = idade;
        this.notas = n;
        this.disciplinas = d;
    }
    
    void exibe_nota(){
        for (int i=0; i<this.notas.length; i++){
            System.out.println(this.disciplinas[i] + " "+ this.notas[i]);
        }
    }
    
}
