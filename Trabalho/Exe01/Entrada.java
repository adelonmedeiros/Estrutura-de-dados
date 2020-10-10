public class Entrada {

    private String expressao;

    public Entrada(String pExpressao) {
        this.expressao = pExpressao;
    }

    public boolean validarFormacao() {

        Pilha controle = new Pilha();

        for (int i = 0; i < this.expressao.length(); i++) {
            if (this.expressao.charAt(i) == '(') {
                controle.push(this.expressao.charAt(i));
            } else if (this.expressao.charAt(i) == ')') {
                if (controle.isEmpty()) {
                    return false;
                } else if (this.expressao.charAt(i) == ')' && controle.topo() == '(') {
                    controle.pop();
                    continue;
                }
                return false;
            }
        }
        if (controle.isEmpty()) return true;
        return false;
    }

    public String getExpressao() {
        return expressao;
    }
}