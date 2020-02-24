package Redes_sociais;

import java.io.IOException;

/**
 *
 * @author Rodrigo Drumond de Paula
 */
public class Redes_sociais {
    public static void main(String[] args) throws IOException {

        AbrirArquivo abrir = new AbrirArquivo("MatrixGrafo.csv");
        Grafo grafo = new Grafo();

        abrir.AbrirArquivoGrafo();//Abrindo o Arquivo

        String[][] auxMatriz = abrir.getMatrizGrafo();//Pegando a Matriz criada

        for (int i = 0; i < 428; i++) {
            grafo.addVertice(Integer.toString(i), 0);//Criando os vertices e seus IDs com peso 0
        }

        for (int i = 0; i < auxMatriz.length; i++) {
            for (int j = 0; j < auxMatriz.length; j++) {
                if (auxMatriz[i][j].equals("1")) {//Pegando a Matriz e comparando a Matriz[i][j]==1 se for crio um vértice aux com os ids 
                    Vertice aux = new Vertice((Integer.toString(i) + "->" + Integer.toString(j)), 0);

                    grafo.getV().get(i).addAdjacentes(aux);// E é adicionado lista de adjacentes do V[i]

                }

            }
        }

        grafo.Busca();//Acrescento os Graus utilizando utilizando busca e profundidade

        grafo.Ordenar();//faco a ordenacao decrescente usando Collections

        grafo.printGraph();// Impressao do grafo

    }
}
