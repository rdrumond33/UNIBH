/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_forca;

import java.util.*;

/**
 *
 * @author Rodrigo Drumond
 */

public class Ranking {

    private int indice;
    private Jogador[] Vetor_jogador = new Jogador[15];
    private Jogador[] vetor_aux = new Jogador[1];
    private boolean controle;

    public Ranking() {
        this.indice = 0;
        for (int i = 0; i < Vetor_jogador.length; i++) {
            Vetor_jogador[i] = new Jogador();
            Vetor_jogador[i].setNome_jogador(" ");
            Vetor_jogador[i].setCodigo_jogador(" ");
            Vetor_jogador[i].setPontuacao_jogador(0);

        }
        for (int j = 0; j < vetor_aux.length; j++) {
            vetor_aux[j] = new Jogador();
            vetor_aux[j].setNome_jogador(" ");
            vetor_aux[j].setCodigo_jogador(" ");
            vetor_aux[j].setPontuacao_jogador(0);
        }
    }

    public void Adicao_jogador(String Nome, String codigo, int pontuacao) {

        //Vetor_jogador[indice] = new Jogador();
        Vetor_jogador[indice].setNome_jogador(Nome);
        Vetor_jogador[indice].setCodigo_jogador(codigo);
        Vetor_jogador[indice].setPontuacao_jogador(pontuacao);
        this.indice++;
        ordenar();

    }

    public void ordenar() {

        for (int i = 0; i < Vetor_jogador.length; ++i) {
            controle = true;
            for (int j = 0; j < (Vetor_jogador.length - 1); ++j) {

                if (Vetor_jogador[j].getPontuacao_jogador() < Vetor_jogador[j + 1].getPontuacao_jogador()) {

                    vetor_aux[0] = Vetor_jogador[j];
                    this.Vetor_jogador[j] = this.Vetor_jogador[j + 1];
                    this.Vetor_jogador[j + 1] = vetor_aux[0];
                    controle = false;
                }
            }
            if (controle) {
                break;
            }
        }

    }

    public void remover(int aux_remove) {

    }

    public void pesquisa(String nome) {
        for (int i = 0; i < this.Vetor_jogador.length; i++) {
            if (nome.equalsIgnoreCase(this.Vetor_jogador[i].getNome_jogador())) {

                System.out.printf("\nSeu ranking[%d]: nome:%s codigo:%s pontuaçao:%d\n", i + 1, Vetor_jogador[i].getNome_jogador(), Vetor_jogador[i].getCodigo_jogador(), Vetor_jogador[i].getPontuacao_jogador());

            }
        }

    }

    public void listagem() {
        for (int i = 0; i < 15; i++) {
            System.out.printf("Raning[%d]:nome: %s,codigo: %s, Pontuaçao:%d\n ", i + 1, Vetor_jogador[i].getNome_jogador(), Vetor_jogador[i].getCodigo_jogador(), Vetor_jogador[i].getPontuacao_jogador());
        }

    }

}
