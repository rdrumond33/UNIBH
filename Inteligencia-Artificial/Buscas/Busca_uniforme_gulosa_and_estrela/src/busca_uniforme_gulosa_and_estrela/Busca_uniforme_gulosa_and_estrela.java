/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busca_uniforme_gulosa_and_estrela;

import java.util.*;
import java.util.stream.Collectors;

;

/**
 *
 * @author aluno
 */
public class Busca_uniforme_gulosa_and_estrela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] adj = {
            {-1, 10, 5, -1, 7, 3},
            {10, -1, 1, -1, -1, -1},
            {5, 1, -1, -1, 10, -1},
            {-1, -1, -1, -1, 9, 12},
            {7, -1, 10, 9, -1, 3},
            {3, -1, -1, 12, 3, -1}
        };

        int[] hx = {7, 5, 2, 0, 2, 5};

        System.out.println("\n---------------------CustoUniforme-------------------\n");
        NO custoUniforme = CustoUniforme(0, 3, adj);
        System.out.println("Resultado: " + custoUniforme.toString());
        System.out.println("\n---------------------FIM--CustoUniforme-------------------\n");

        System.out.println("\n---------------------Guloso-------------------\n");
        NO guloso = Guloso(0, 3, hx, adj);
        System.out.println("Resultado: " + guloso.toString());
        System.out.println("\n---------------------FIM--Guloso-------------------\n");

        System.out.println("\n---------------------Aestrela-------------------\n");
        NO estrela = AEstrela(0, 3, hx, adj);
        System.out.println("Resultado: " + estrela.toString());
        System.out.println("\n---------------------FIM--Aestrela-------------------\n");

    }

    public static int Custo(Integer a, Integer b, int[][] adj) {

        return adj[a][b];
    }

    public static int Custo(Integer fi, int[] hx) {

        return hx[fi];
    }

    public static NO CustoUniforme(int estadoInicial, int estadoFinal, int[][] adj) {
        NO no = new NO(estadoInicial, 0, null, 0);

        int altura = 0, k = 0, l = 0;

        Integer estado = 0;

        ArrayList<NO> listadeBusca = new ArrayList<NO>();

        listadeBusca.add(no);

        ArrayList<Integer> novosEstados;

        HashMap<Integer, Integer> Custos = new HashMap<Integer, Integer>();

        while ((!listadeBusca.isEmpty()) && no.getEstado() != estadoFinal) {
            l = 0;
            no = listadeBusca.get(0);
            listadeBusca.remove(0);

            novosEstados = FucaoSucessora(no.getEstado(), adj);

            for (int i = 0; i < novosEstados.size(); i++) {
                if (novosEstados.get(i) == estadoFinal) {

                    no = new NO(estadoFinal, (Integer) no.getCusto() + Custo(no.getEstado(), estado, adj), no, altura++);

                    return no;
                }
            }

            Integer estadomenor = 0;
            while (k < 1) {
                for (Integer e : novosEstados) {
                    Custos.put(e, (Integer) Custo(no.getEstado(), e, adj));
                }
//                Custos.sort(Comparator.naturalOrder());
                Map<Integer, Integer> ordenada = Custos.entrySet()
                        .stream()
                        .sorted(Map.Entry.<Integer, Integer>comparingByValue(Comparator.naturalOrder()))
                        .collect(Collectors.toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

                for (Integer key : ordenada.keySet()) {
                    while (l < 1) {
                        NO newNo = new NO(key, ordenada.get(key), no, altura++);

                        listadeBusca.add(newNo);
                        Custos.remove(key);

                        break;
                    }
                    break;
                }

                k++;
            }

            if (k == 1) {
                k++;
                continue;
            }

            for (Integer e : novosEstados) {
                if (Custos.containsKey(e)) {
                    if (Custos.get(e) < (Integer) no.getCusto() + Custo(no.getEstado(), e, adj)) {
                        continue;
                    }
                    Custos.put(e, (Integer) no.getCusto() + Custo(no.getEstado(), e, adj));

                } else {
                    Custos.put(e, (Integer) no.getCusto() + Custo(no.getEstado(), e, adj));

                }
            }

            Map<Integer, Integer> ordenada = Custos.entrySet()
                    .stream()
                    .sorted(Map.Entry.<Integer, Integer>comparingByValue(Comparator.naturalOrder()))
                    .collect(Collectors.toMap(
                                    Map.Entry::getKey,
                                    Map.Entry::getValue,
                                    (oldValue, newValue) -> oldValue, LinkedHashMap::new));

            for (Integer key : ordenada.keySet()) {
                while (l < 1) {
                    NO newNo = new NO(key, ordenada.get(key), no, altura++);
                    listadeBusca.add(newNo);
                    l++;
                    Custos.remove(key);
                    break;
                }

            }
        }
        return no;
    }

    public static NO Guloso(int estadoInicial, int estadoFinal, int[] hx, int[][] adj) {
        NO no = new NO(estadoInicial, 0, null, 0);

        int menorCusto = 0;
        int altura = 0;

        Integer estado = 0;

        ArrayList<NO> listadeBusca = new ArrayList<NO>();

        listadeBusca.add(no);

        ArrayList<Integer> novosEstados;

        while ((!listadeBusca.isEmpty()) && no.getEstado() != estadoFinal) {

            no = listadeBusca.get(0);
            listadeBusca.remove(0);

            novosEstados = FucaoSucessora(no.getEstado(), adj);

            for (int i = 0; i < novosEstados.size(); i++) {
                if (novosEstados.get(i) == estadoFinal) {

                    no = new NO(estadoFinal, Custo(estado, hx), no, altura++);

                    return no;
                }
            }

            Integer estadomenor = 0;

            menorCusto = 10000;

            for (Integer e : novosEstados) {

                if (Custo(e, hx) <= menorCusto) {
                    menorCusto = Custo(e, hx);
                    estadomenor = e;
                }

            }

            NO newNo = new NO(estadomenor, menorCusto, no, altura++);
            listadeBusca.add(newNo);

        }
        return no;

    }

    public static NO AEstrela(int estadoInicial, int estadoFinal, int[] hx, int[][] adj) {
        NO no = new NO(estadoInicial, 0, null, 0);

        int altura = 0, k = 0, l = 0;

        Integer estado = 0;

        ArrayList<NO> listadeBusca = new ArrayList<NO>();

        listadeBusca.add(no);

        ArrayList<Integer> novosEstados;

        HashMap<Integer, Integer> Custos = new HashMap<Integer, Integer>();

        while ((!listadeBusca.isEmpty()) && no.getEstado() != estadoFinal) {
            l = 0;
            no = listadeBusca.get(0);
            listadeBusca.remove(0);

            novosEstados = FucaoSucessora(no.getEstado(), adj);

            for (int i = 0; i < novosEstados.size(); i++) {
                if (novosEstados.get(i) == estadoFinal) {

                    no = new NO(estadoFinal, (Integer) no.getCusto() + Custo(no.getEstado(), estado, adj) + Custo(estado, hx), no, altura++);

                    return no;
                }
            }

            Integer estadomenor = 0;
            while (k < 1) {
                for (Integer e : novosEstados) {
                    Custos.put(e, (Integer) Custo(no.getEstado(), e, adj) + Custo(e, hx));
                }
//                Custos.sort(Comparator.naturalOrder());
                Map<Integer, Integer> ordenada = Custos.entrySet()
                        .stream()
                        .sorted(Map.Entry.<Integer, Integer>comparingByValue(Comparator.naturalOrder()))
                        .collect(Collectors.toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

                for (Integer key : ordenada.keySet()) {
                    while (l < 1) {
                        NO newNo = new NO(key, ordenada.get(key), no, altura++);

                        listadeBusca.add(newNo);
                        Custos.remove(key);

                        break;
                    }
                    break;
                }

                k++;
            }

            if (k == 1) {
                k++;
                continue;
            }

            for (Integer e : novosEstados) {
                if (Custos.containsKey(e)) {
                    if (Custos.get(e) < (Integer) no.getCusto() + Custo(no.getEstado(), e, adj) + Custo(e, hx)) {
                        continue;
                    }
                    Custos.put(e, (Integer) no.getCusto() + Custo(no.getEstado(), e, adj) + Custo(e, hx));

                } else {
                    Custos.put(e, (Integer) no.getCusto() + Custo(no.getEstado(), e, adj) + Custo(e, hx));

                }
            }

            Map<Integer, Integer> ordenada = Custos.entrySet()
                    .stream()
                    .sorted(Map.Entry.<Integer, Integer>comparingByValue(Comparator.naturalOrder()))
                    .collect(Collectors.toMap(
                                    Map.Entry::getKey,
                                    Map.Entry::getValue,
                                    (oldValue, newValue) -> oldValue, LinkedHashMap::new));

            for (Integer key : ordenada.keySet()) {
                while (l < 1) {
                    NO newNo = new NO(key, ordenada.get(key), no, altura++);
                    listadeBusca.add(newNo);
                    l++;
                    Custos.remove(key);
                    break;
                }

            }
        }
        return no;
    }

    public static ArrayList<Integer> FucaoSucessora(int estado, int[][] adj) {
        ArrayList<Integer> estados = new ArrayList<Integer>();

        for (int i = 0; i < adj[estado].length; i++) {
            if (adj[estado][i] != -1) {
                estados.add(i);
            }
        }
        return estados;
    }

}
