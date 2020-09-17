package aula01.fibonacci;

public class FibonacciExe {

    /*
     * Dever de casa: implementar a função recursiva e iterativa da sequencia de
     * Fibonacci
     */

    static int sequencia_fibonacci(final int n) { // solução recursiva (pilha de execução)
        System.out.print(n + " ");

        if (n == 1) { // para o codigo em 1 sequencia é finita e terminada em 1
            return 1;
        }

        if (n % 2 == 0) { // valida se o numero n é par
            return sequencia_fibonacci(n / 2);
        } else { // impar
            return sequencia_fibonacci(3 * n + 1);
        }
    }

    static int sequencia_fibonacciI(final int n) { // solução recursiva (pilha de execução)

        if (n == 1) { // para o codigo em 1 sequencia é finita e terminada em 1
            return 1;
        }

        if (n % 2 == 0) { // valida se o numero n é par
            return (n / 2);
        } else { // impar
            return (3 * n + 1);
        }
    }

    public static void main(final String[] args) {
        int i = 1000;

        sequencia_fibonacci(i);

        System.out.print("\n------------------------\n");

        System.out.print(i + " ");
        while (i > 1) {
            i = sequencia_fibonacciI(i);
            System.out.print(i + " ");
        }

    }

}
