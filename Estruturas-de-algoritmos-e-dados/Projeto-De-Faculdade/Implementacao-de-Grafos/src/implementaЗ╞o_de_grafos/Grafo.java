/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementação_de_grafos;

import java.util.ArrayList;

public class Grafo {

    protected ArrayList<Vertice> V;
    protected ArrayList<Aresta> E;

    public Grafo() {
        this.V = new ArrayList<>();
        this.E = new ArrayList<>();
    }

    public Vertice searchVertice(String ID) {
        for (Vertice v : this.V) {
            if (v.getID().equals(ID)) {
                return v;
            }
        }
        return null;
    }

    public void imprimeArestasVertice(String ID) {

        if (this.sairVertice(ID)) {
            this.searchVertice(ID).listaAdjacentes.forEach(x -> System.out.printf(x.getID() + x.getPeso()));

        }
    }

    public boolean verifVerticesConectados(Vertice V1, Vertice V2) {
        return V1.listaAdjacentes.stream().anyMatch((v) -> (v.equals(V2)));
    }

    public boolean sairVertice(String ID) {
        for (Vertice v : this.V) {
            if (v.getID().equals(ID)) {
                return true;
            }
        }
        return false;
    }

    public boolean sairAresta(String ID) {
        for (Aresta e : this.E) {
            if (e.getID().equals(ID)) {
                return true;
            }
        }
        return false;
    }

    public void addVertice(String ID, float peso) {
        if (!this.sairAresta(ID)) {
            V.add(new Vertice(ID, peso));
        }
    }

    public void addAresta(float peso, String ID, String idV1, String idV2) {
        if (!this.sairAresta(ID) && !this.sairAresta(idV1) && !this.sairAresta(idV2)) {
            Vertice v1 = searchVertice(idV1);
            Vertice v2 = searchVertice(idV2);
            this.E.add(new Aresta(v1, v2, peso, ID, false));

            v1.addAdjacente(v2);
            v2.addAdjacente(v1);
        }
    }

    public void addAresta(float peso, String ID, String idV1, String idV2, boolean orientada) {

        //Busca o vértice V1
        Vertice v1 = searchVertice(idV1);
        //Busca o vértice V2
        Vertice v2 = searchVertice(idV2);
        this.E.add(new Aresta(v1, v2, peso, ID, orientada));
        if (orientada) {
            v1.addAdjacente(v2);
        } else {
            v1.addAdjacente(v2);
            v2.addAdjacente(v1);
        }
    }

    public void ImprimirGrafo() {
        System.out.printf("\nLista de Vértices: ");
        for (Vertice vertice : this.V) {
            System.out.println("\nID: " + vertice.getID() + " Peso: " + vertice.getPeso());
        }
        System.out.printf("\nLista de Arestas: ");
        for (Aresta aresta : E) {
            System.out.println("\nID: " + aresta.getID() + " Peso: " + aresta.getPeso());
        }
    }
    

}
