/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao_de_grafos;

public class Aresta {

    private float peso;
    private String ID;
    private Vertice v1, v2;
    private boolean orientada;

    public Aresta(Vertice v1, Vertice v2, float peso, String ID, boolean orientada) {
        this.peso = peso;
        this.ID = ID;
        this.v1 = v1;
        this.v2 = v2;
        this.orientada = orientada;
    }

    public float getPeso() {
        return peso;
    }

    public String getID() {
        return ID;
    }

    public Vertice getV1() {
        return v1;
    }

    public Vertice getV2() {
        return v2;
    }

    public boolean isOrientada() {
        return orientada;
    }

    public void imprimeAresta() {
        System.out.printf("ID Aresta: %s\nVértice Origem: %s\nVértice Destino: %s\nPeso: %f\nOrientada: ", this.getID(), this.getV1(), this.getV2(), this.getPeso());
        if (this.isOrientada()) {
            System.out.printf("Sim\n");
        } else {
            System.out.printf("Não\n");
        }
    }
}
