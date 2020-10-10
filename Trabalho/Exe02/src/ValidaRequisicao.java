public class ValidaRequisicao {

    private int codigo;

    public void validarArquivo(){

        Fila fila = new Fila();

        for (int i = 0; i < 1000; i++) {
        if (this.codigo >= 1000) {
            System.out.println("Arquivo corrompido!");
            }
        }
    }
}