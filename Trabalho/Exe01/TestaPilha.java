import java.util.Scanner;

public class TestaPilha {

    public static void main(String[] args) {

        System.out.println("Digite uma equação: ");
        Scanner sc = new Scanner(System.in);
        String expressao = sc.nextLine();

        System.out.println("Equação: " + expressao);
        Entrada entrada = new Entrada(expressao);

        if (entrada.validarFormacao()) {
            System.out.println("Equação bem formada");
        } else {
            System.out.println("Equação mal formada");
        }
    }
}




