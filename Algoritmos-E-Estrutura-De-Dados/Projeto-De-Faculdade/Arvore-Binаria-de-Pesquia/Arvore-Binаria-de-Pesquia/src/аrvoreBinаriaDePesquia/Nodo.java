package аrvoreBinаriaDePesquia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Drumond
 */
public class Nodo {
    private Aluno aluno;
    private Nodo esquerda;
    private Nodo direita;
    
    public Nodo(Aluno aluno){
        this.aluno=aluno;
        this.direita=null;
        this.esquerda=null;
    
    
    
    }

    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * @return the esquerda
     */
    public Nodo getEsquerda() {
        return esquerda;
    }

    /**
     * @param esquerda the esquerda to set
     */
    public void setEsquerda(Nodo esquerda) {
        this.esquerda = esquerda;
    }

    /**
     * @return the direita
     */
    public Nodo getDireita() {
        return direita;
    }

    /**
     * @param direita the direita to set
     */
    public void setDireita(Nodo direita) {
        this.direita = direita;
    }
    
    
    
    
    
    
}
