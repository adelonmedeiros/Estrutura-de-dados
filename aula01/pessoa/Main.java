package aula01.pessoa;

public class Main {

    public static void main(final String[] args) {

        final Pessoa[] p = new Pessoa[3];// vetor de objetos
        for (int i = 0; i < p.length; i++) {
            p[i] = new Pessoa(); // chamar o construtor pra cada ponteiro de Pessoa do array
        }

        p[0].setPessoa("Igor Borges", 26, 1.79, 'M');
        p[1].setPessoa("Jack Chan", 50, 1.5, 'M');
        p[2].setPessoa("Mary", 24, 1.5, 'X');

        for (int i = 0; i < p.length; i++) {
            p[i].apresentacao();
            p[i].adicional();
        }

        final Pessoa joao = new Pessoa(); // criando objeto joao do tipo pessoa

        joao.idade = 25;

        joao.nome = "João mateus";

        joao.altura = 2.1;

        joao.setSexo('M');

        final Pessoa paty = new Pessoa("Patricia Abravanel", 18, 1.7, 'F');

        joao.apresentacao();
        joao.adicional();

        paty.apresentacao();
        paty.adicional();

    }

}
