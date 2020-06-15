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
public class Vendas {

    private ArvoreBinariaProdutos carrinho;

    public Vendas() {
        this.carrinho = new ArvoreBinariaProdutos();
    }

    
    public void ordenar(){
        this.carrinho = this.carrinho.ordenarQuickShort();
    }
    
//    public ArvoreBinariaProdutos finalizar(ArvoreBinariaProdutos a){
//  
//    }
//    
    /**
     * @return the carrinho
     */
    public ArvoreBinariaProdutos getCarrinho() {
        return carrinho;
    }

    /**
     * @param carrinho the carrinho to set
     */
    public void setCarrinho(ArvoreBinariaProdutos carrinho) {
        this.carrinho = carrinho;
    }

}
