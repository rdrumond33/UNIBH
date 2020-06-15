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
public class NoProdutos {
    private Produtos produto;
    private NoProdutos esquerda, direita;

    public NoProdutos(Produtos produto) {
        super();
        this.produto = produto;
        this.esquerda = null;
        this.direita = null;
    }

    /**
     * @return the produto
     */
    public Produtos getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produtos produto) {
        this.produto = produto;
    }

    /**
     * @return the esquerda
     */
    public NoProdutos getEsquerda() {
        return esquerda;
    }

    /**
     * @param esquerda the esquerda to set
     */
    public void setEsquerda(NoProdutos esquerda) {
        this.esquerda = esquerda;
    }

    /**
     * @return the direita
     */
    public NoProdutos getDireita() {
        return direita;
    }

    /**
     * @param direita the direita to set
     */
    public void setDireita(NoProdutos direita) {
        this.direita = direita;
    }

    
        
}
