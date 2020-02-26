/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao_de_grafos;

/**
 *
 * @author Rodrigo Drumond
 */
public class Implementacao_de_Grafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Grafo GrafoA = new Grafo();
        GrafoA.addVertice("A", 0);
        GrafoA.addVertice("B", 0);
        GrafoA.addVertice("C", 0);
        GrafoA.addVertice("D", 0);
        GrafoA.addVertice("E", 0);
        GrafoA.addVertice("F", 0);
        GrafoA.addVertice("G", 0);
        GrafoA.addVertice("H", 0);
        
        GrafoA.addAresta(10, "AH", "A", "H");
        GrafoA.addAresta(2, "AD", "A", "D");
        GrafoA.addAresta(3, "AB", "A", "B");
        GrafoA.addAresta(5, "AC", "A", "C");
        GrafoA.addAresta(5, "BC", "B", "C");
        GrafoA.addAresta(8, "BD", "B", "D");
        GrafoA.addAresta(6, "BG", "B", "G");
        GrafoA.addAresta(7, "CF", "C", "F");
        GrafoA.addAresta(9, "CG", "C", "G");
        GrafoA.addAresta(1, "CE", "C", "E");
        GrafoA.addAresta(14, "DH", "D", "H");
        GrafoA.addAresta(12, "DE", "D", "E");
        GrafoA.addAresta(9, "FH", "F", "H");
        GrafoA.addAresta(3, "GH", "G", "H");
        
        Grafo GrafoB = new Grafo();
        GrafoB.addVertice("x", 0);
        GrafoB.addVertice("z", 0);
        GrafoB.addVertice("t", 0);
        GrafoB.addVertice("u", 0);
        GrafoB.addVertice("v", 0);
        
        GrafoB.addAresta(10, "tx", "t", "x",true);
        GrafoB.addAresta(9, "xz", "x", "z",true);
        GrafoB.addAresta(7, "tu", "t", "u",true);
        GrafoB.addAresta(8, "uv", "u", "v",true);
        GrafoB.addAresta(11, "uz", "u", "z",true);
        GrafoB.addAresta(2, "ux", "u", "x",true);
        GrafoB.addAresta(-10, "vu", "v", "u",true);
        GrafoB.addAresta(1, "vx", "v", "x",true);
        GrafoB.addAresta(2, "vz", "v", "z",true);
 
        GrafoA.ImprimirGrafo();
        
        GrafoB.ImprimirGrafo();
        
        
    }
    
}
