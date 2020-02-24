package fila_pilha;

/*
Considere as TADs Pilha e Fila e suas respectivas funções Empilha e Desempilha,
Enfileira e Desenfileira. Crie uma função que recebe uma fila e que retorne essa fila
invertida utilizando somente as funções acima.

 */
public class Fila {

    private Nodo inicio, fim;
    private int tamanho;

    public Fila() {
        this.inicio = this.fim;
        this.tamanho = 0;

    }

    public void Enfileirar(String s) {
        Nodo n = new Nodo(s, null);
        if (vazia()) {
            this.fim = this.inicio = n;
        } else {
            this.getFim().setNext(n);
            this.fim = n;
            this.tamanho++;

        }

    }

    public String Desenfileira() {
        Nodo aux = this.getInicio();
        this.inicio = this.getInicio().getNext();
        this.tamanho--;
        return aux.getElement();

    }

    public boolean vazia() {
        return this.getInicio() == null;

    }

    public int tamanho() {
        return this.getTamanho();
    }

    public String frente() {
        return this.getInicio().getElement();
    }

    public void fila_invertida() {
        /*Considere as TADs Pilha e Fila e suas respectivas funções Empilha e Desempilha,
    Enfileira e Desenfileira. Crie uma função que recebe uma fila e que retorne essa fila
    invertida utilizando somente as funções acima*/

        Pilha p = new Pilha();
        Nodo aux = this.getInicio();
        String aux1;
        while (this.tamanho > 0) {
            aux1 = Desenfileira();
            p.Empilhar(aux1);
        }
        while (p.getTamanho() > 0) {
            Enfileirar(p.Desempilhar());

        }
        imprimeFila();

    }

    public void imprimeFila() {
        System.out.println("Fila: ");
        Nodo aux = this.getInicio();
        while (aux != null) {
            System.out.println(aux.getElement());
            aux = aux.getNext();
        }
    }

    /**
     * @return the inicio
     */
    public Nodo getInicio() {
        return inicio;
    }

    /**
     * @return the fim
     */
    public Nodo getFim() {
        return fim;
    }

    /**
     * @return the tamanho
     */
    public int getTamanho() {
        return tamanho;
    }

}
