package atividade_forca;

public class nodo {

    private Jogador J;
    private nodo prox;

    public nodo(Jogador Jo) {
        this.J = Jo;
        this.prox = null;

    }

    /**
     * @return the J
     */
    public Jogador getJ() {
        return J;
    }

    /**
     * @param J the J to set
     */
    public void setJ(Jogador J) {
        this.J = J;
    }

    /**
     * @return the prox
     */
    public nodo getProx() {
        return prox;
    }

    /**
     * @param prox the prox to set
     */
    public void setProx(nodo prox) {
        this.prox = prox;
    }

}
