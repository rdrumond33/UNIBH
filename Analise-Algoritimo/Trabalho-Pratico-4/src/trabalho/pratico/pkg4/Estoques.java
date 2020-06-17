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
public class Estoques {

    private ArvoreBinariaProdutos estoque;

    Estoques() {
        this.estoque = new ArvoreBinariaProdutos();
    }

    public Estoques(ArvoreBinariaProdutos estoque) {
        this.estoque = estoque;
    }

    
    public void ordenar(){
        this.estoque = this.estoque.ordenarQuickShort();
    }
        
    /**
     * @return the estoque
     */
    public ArvoreBinariaProdutos getEstoque() {
        return estoque;
    }

    public Estoques Clone() {
        ArvoreBinariaProdutos ap = new ArvoreBinariaProdutos();
        for (Produtos p : this.estoque.clone()) {
            ap.Insere(p);
        }
        return new Estoques(ap); 
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(ArvoreBinariaProdutos estoque) {
        this.estoque = estoque;
    }

}
