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
public class Produtos {

    private String nome;
    private int codigo_unico;
    private double valor;
    private String setor;
    private int qtd;

    public Produtos(String nome, double valor, String setor, int codigo_unico, int qtd) {
        this.codigo_unico = codigo_unico;
        this.valor = valor;
        this.nome = nome;
        this.setor = setor;
        this.qtd = qtd;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the codigo_unico
     */
    public int getCodigo_unico() {
        return codigo_unico;
    }

    /**
     * @param codigo_unico the codigo_unico to set
     */
    public void setCodigo_unico(int codigo_unico) {
        this.codigo_unico = codigo_unico;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the setor
     */
    public String getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }

    /**
     * @return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

}
