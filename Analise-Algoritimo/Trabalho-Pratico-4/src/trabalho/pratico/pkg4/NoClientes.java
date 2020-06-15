/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.pratico.pkg4;

/**
 *
 * @author rdrumond
 */
public class NoClientes {
      private Clientes cliente;
    private NoClientes esquerda, direita;

    public NoClientes(Clientes cliente) {
        super();
        this.cliente = cliente;
        this.esquerda = null;
        this.direita = null;
    }

    /**
     * @return the cliente
     */
    public Clientes getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the esquerda
     */
    public NoClientes getEsquerda() {
        return esquerda;
    }

    /**
     * @param esquerda the esquerda to set
     */
    public void setEsquerda(NoClientes esquerda) {
        this.esquerda = esquerda;
    }

    /**
     * @return the direita
     */
    public NoClientes getDireita() {
        return direita;
    }

    /**
     * @param direita the direita to set
     */
    public void setDireita(NoClientes direita) {
        this.direita = direita;
    }

    
    
    
}
