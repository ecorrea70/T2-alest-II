public class NodeCaixa {
    private int largura;
    private int altura;
    private int comprimento;

    public NodeCaixa(int largura, int altura, int comprimento) {
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public boolean contem(NodeCaixa other) {
        return this.largura > other.largura && this.altura > other.altura && this.comprimento > other.comprimento;
    }

    public String toString() {
        return "[(" + largura + "), (" + altura + "), (" + comprimento + ")]";
    }}