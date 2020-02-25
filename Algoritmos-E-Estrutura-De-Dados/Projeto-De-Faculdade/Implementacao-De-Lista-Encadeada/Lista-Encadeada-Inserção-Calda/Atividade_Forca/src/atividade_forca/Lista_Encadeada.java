package atividade_forca;

public class Lista_Encadeada {

    private nodo cabeça;

    private nodo calda;

    private long tamanho;

    public Lista_Encadeada() {

        this.cabeça = null;

        this.calda = null;

        this.tamanho = 0;

    }

    public void inserirPrimeiro(Jogador Je) {

        nodo novoNo = new nodo(Je);
        if (this.verificar()) {

            this.calda = novoNo;

        }
        novoNo.setProx(this.cabeça);
        this.cabeça = novoNo;
        this.tamanho++;

    }

    public void inserirUltimo(Jogador Je) {

        nodo novoNo = new nodo(Je);

        if (this.verificar()) {

            this.cabeça = novoNo;

        } else {
            this.calda.setProx(novoNo);

        }
        this.calda = novoNo;
        this.tamanho++;

    }

    public boolean removerNodo(String nome) {
        nodo atual = this.cabeça;
        nodo anterior = null;
        if (verificar()) {
            return false;

        } else {
            while (atual != null && (!atual.getJ().getNome_jogador().equalsIgnoreCase(nome))) {
                anterior = atual;
                atual = atual.getProx();

            }
        }
        if (atual == this.cabeça) {
            if (this.cabeça == this.calda) {
                this.calda = null;

            }
            this.cabeça = this.cabeça.getProx();
        } else {
            if (atual == this.calda) {
                this.calda = anterior;

            }
            anterior.setProx(atual.getProx());
        }
        this.tamanho--;
        return true;
    }

    public String imprimirLista() {
        String msg = "";
        if (verificar()) {
            msg = "A lista esta vazia";
        } else {
            nodo atual = this.cabeça;
            while (atual != null) {
                msg += atual.getJ().getNome_jogador() + " -> ";
                atual = atual.getProx();
            }
        }
        return msg;
    }

    public boolean verificar() {//verificar se e vazia

        return (this.cabeça == null);

    }

    /**
     * @return the cabeça
     */
    public nodo getCabeça() {
        return cabeça;
    }

    /**
     * @param cabeça the cabeça to set
     */
    public void setCabeça(nodo cabeça) {
        this.cabeça = cabeça;
    }

    /**
     * @return the calda
     */
    public nodo getCalda() {
        return calda;
    }

    /**
     * @param calda the calda to set
     */
    public void setCalda(nodo calda) {
        this.calda = calda;
    }

    /**
     * @return the tamanho
     */
    public long getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(long tamanho) {
        this.tamanho = tamanho;
    }

}
