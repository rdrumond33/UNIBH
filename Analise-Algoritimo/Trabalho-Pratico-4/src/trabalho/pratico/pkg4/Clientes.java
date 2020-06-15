package trabalho.pratico.pkg4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rdrumond
 */
public class Clientes {

    private String nome;
    private String cpf;
    private String rua;
    private int codigo_unico;
    private Vendas vendas;

    public Clientes(String nome, String cpf, String rua, int codigo_unico) {
        this.codigo_unico = codigo_unico;
        this.cpf = cpf;
        this.nome = nome;
        this.rua = rua;
        this.vendas = new Vendas();
    }


    @Override
    public String toString() {
        return "\nCodigo: "+this.getCodigo_unico()+ " Nome: " + this.getNome();
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
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
     * @return the vendas
     */
    public Vendas getVendas() {
        return vendas;
    }

    /**
     * @param vendas the vendas to set
     */
    public void setVendas(Vendas vendas) {
        this.vendas = vendas;
    }
    
    
    

}
