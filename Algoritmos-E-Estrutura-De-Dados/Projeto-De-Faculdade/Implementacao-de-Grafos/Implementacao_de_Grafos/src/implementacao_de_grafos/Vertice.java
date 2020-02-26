/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao_de_grafos;

import java.util.ArrayList;

public class Vertice {

    protected String ID;
    protected float peso;
    ArrayList<Vertice> listaAdjacentes;

    public Vertice(String ID, float peso) {
        this.ID = ID;
        this.peso = peso;
        this.listaAdjacentes = new ArrayList<>();
    }

    public String getID() {
        return ID;
    }

    public float getPeso() {
        return peso;
    }

    public ArrayList<Vertice> getListaAdjacentes() {
        return listaAdjacentes;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void addAdjacente(Vertice n) {
        this.listaAdjacentes.add(n);
    }

    public void removeAdjacente(Vertice n) {
        this.listaAdjacentes.remove(n);
    }
}
