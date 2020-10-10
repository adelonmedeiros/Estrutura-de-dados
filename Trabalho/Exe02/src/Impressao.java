import java.util.Scanner;

public class Impressao{

    public Impressao(Object codigos) {
    }

    public static void main(String[]args) {

    System.out.println("Insira os códigos dos arquivos para impressão: ");
    Scanner sc = new Scanner(System.in);
    String codigos = sc.nextLine();

    System.out.println("Códigos: " + codigos);
    Impressao entrada = new Impressao(codigos);






    }

}