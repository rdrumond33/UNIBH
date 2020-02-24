package fila_pilha;

public class Pilha {

    private Nodo topo;
    private int tamanho;

    public Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    public void Empilhar(String s) {
        Nodo n = new Nodo(s, this.topo);
        this.topo = n;
        this.tamanho++;

    }

    public String Desempilhar() {
        Nodo aux = this.topo;
        this.topo = this.topo.getNext();
        this.tamanho--;
        return aux.getElement();
    }

    public boolean vazia() {

        return this.topo == null;

    }

    public int tamanho() {
        return this.getTamanho();

    }

    public String topo() {
        return this.topo.getElement();

    }

    public void excluir(String s) {
        /*
        . Utilizando somente operações de empilhar e desempilhar, escreva um programa que
remove um item com chave c fornecida pelo usuário da pilha. Ao final da execução
da função, a pilha deve ser igual à original, exceto pela ausência do item removido.
         */
        Pilha p = new Pilha();
        while (this.getTamanho() > 0) {
            String aux = Desempilhar();
            if (aux.equals(s)) {

            } else {
                p.Empilhar(aux);
            }
        }
        while (p.getTamanho() > 0) {
            Empilhar(p.Desempilhar());

        }

    }

    public void imprimePilha() {
        System.out.println("pilha: ");
        Nodo aux = this.topo;
        while (aux != null) {
            System.out.println(aux.getElement());
            aux = aux.getNext();
        }
    }

    public void imprimeFilhaInvertida() {
        System.out.println("Fila Invertida: ");
        Nodo aux = this.topo;
        while (aux != null) {
            System.out.println(aux.getElement());
            aux = aux.getNext();
        }
    }

    /**
     * @return the tamanho
     */
    public int getTamanho() {
        return tamanho;
    }

}
