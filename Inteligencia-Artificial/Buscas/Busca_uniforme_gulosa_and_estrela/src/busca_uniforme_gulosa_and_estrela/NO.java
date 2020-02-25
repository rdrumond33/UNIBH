/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busca_uniforme_gulosa_and_estrela;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class NO {

    private Integer estado;
    private int custo;
    private NO pai;
    private int altura;

    public NO(Integer estado, int custo, NO pai, int altura) {
        this.estado = estado;
        this.custo = custo;
        this.pai = pai;
        this.altura = altura;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public NO getPai() {
        return pai;
    }

    public void setPai(NO pai) {
        this.pai = pai;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        String msg = "{Altura->"+this.altura+" Custo->"+this.custo+" Estado->"+this.estado+" Pai->[ "+this.pai+" ]"+" } ";
        return msg; //To change body of generated methods, choose Tools | Templates.
    }
    

}
