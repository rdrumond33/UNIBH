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
public class Atividade_Forca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent = new Scanner(System.in);
        Scanner ent1 = new Scanner(System.in);

        /**
         * **********objetos********************
         */
        Forca forc = new Forca();
        Ranking rank = new Ranking();
        Lista_Encadeada lista = new Lista_Encadeada();
        Jogador J;

        /**
         * ***************variaveis*******************
         */
        int Conticao = -1;
        int parar = 1, pontuacao = 0;

        System.out.println("--------------vamos comecar---------------------\n");

        System.out.println("Digite a palavra secreta: ");
        forc.Ler_palavra(ent.nextLine());

        for (int i = 0; i < 100; i++) {
            System.out.println("");
        }

        do {
            System.out.printf("\nA palavra secreta e: %s\n", forc.getPalavra_digitada());
            System.out.printf("\nDigite %s1%s para mais uma letra:\n", "'", "'");
            System.out.printf("\nDigite %s2%s para chutar a Palavra secreta\n", "'", "'");
            System.out.printf("\nDigite %s3%s  para listar o Rank utilizando 'vetor' ", "'", "'");
            System.out.println("Digite 5 para utilizar lista");
            Conticao = ent1.nextInt();
            switch (Conticao) {
                case 0:
                    System.out.println("Muito obrigado por jogar: ");
                    parar = 0;
                    break;

                case 1:
                    if (forc.isCondicao() == false) {
                        System.out.println("Digite uma letra: ");
                        pontuacao = pontuacao + (20 * forc.Verificar_Letra(ent.nextLine().charAt(0)));
                        System.out.printf("A palavra secreta e: %s,%d \n", forc.getPalavra_digitada(), forc.getErro());

                    }
                    if (forc.isCondicao() == true) {
                        System.out.println("Muito bom voce acertou a palavra e ganhou 50 pontos: ");
                        System.out.printf("\nA palavra secreta era: %s\n", forc.getPalavra_digitada());
                        System.out.println("Digite seu nome, seu codigo: ");
                        rank.Adicao_jogador(ent.nextLine(), ent.nextLine(), pontuacao);
                        System.out.println("Agora digite uma outra palvra secreta: ");
                        forc.Ler_palavra(ent.nextLine());
                        pontuacao = 0;
                    }
                    if (forc.getErro() == 6) {
                        System.out.println("\nSinto muito voce foi enforcado: ");
                        System.out.printf("\nA palavra secreta era: %s\n", forc.getPalavra_secreta());
                        System.out.println("Agora digite uma outra palvra secreta: ");
                        forc.Ler_palavra(ent.nextLine());
                        pontuacao = 0;
                        for (int i = 0; i < 100; i++) {
                            System.out.println("");
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nDigite uma Palavra: ");
                    if (forc.Verificar_Palavra(ent.nextLine()) == 1) {
                        pontuacao = pontuacao + 50;
                        System.out.printf("\nMuito bom voce acertou a palavra e ganhou %dpontos: ", pontuacao);
                        System.out.printf("\nA palavra secreta era: %s\n", forc.getPalavra_digitada());
                        System.out.println("Digite seu nome, seu codigo: ");
                        rank.Adicao_jogador(ent.nextLine(), ent.nextLine(), pontuacao);
                        System.out.println("Agora digite uma outra palvra secreta: ");
                        forc.Ler_palavra(ent.nextLine());

                        for (int i = 0; i < 100; i++) {
                            System.out.println("");
                        }

                    } else if (forc.Verificar_Palavra(ent.nextLine()) == 0) {
                        System.out.println("\nSinto muito voce foi enforcado: ");
                        System.out.printf("\nA palavra secreta era: %s\n", forc.getPalavra_secreta());

                    }
                    break;
                case 3:
                    rank.listagem();
                    break;

                case 4:
                    System.out.print("\n Para pesquisar qual a posicao que esta digite seu nome de jogador: ");
                    rank.pesquisa(ent.nextLine());
                    break;

                case 5:
                    System.out.println("Incerir no inicio da lista");
                    J = new Jogador();
                    System.out.println("digite seu nome: ");
                    J.setNome_jogador(ent.nextLine());
                    System.out.println("Digite seu codigo; ");
                    J.setCodigo_jogador(ent.nextLine());
                    J.setPontuacao_jogador(pontuacao);
                    lista.inserirPrimeiro(J);
                    break;
                case 6:
                    System.out.println("Incerir no final da lista");
                    J = new Jogador();
                    System.out.println("digite seu nome: ");
                    J.setNome_jogador(ent.nextLine());
                    System.out.println("Digite seu codigo; ");
                    J.setCodigo_jogador(ent.nextLine());
                    J.setPontuacao_jogador(pontuacao);
                    lista.inserirUltimo(J);
                    break;
                case 7:
                    System.out.println("remover da lista");
                    if (lista.verificar()) {
                        System.out.println("A lista esta vazia: ");

                    } else {
                        System.out.println("remover um jogador digite o nome: ");
                        String nome = ent.nextLine();
                        if (lista.removerNodo(nome)) {
                            System.out.println(nome + "Foi removido com sucesso! ");

                        } else {
                            System.out.println("nao foi possivel remover");
                        }
                        break;
                    }

                case 8:
                    System.out.println("imprime lista");
                    System.out.println("Lista: " + lista.imprimirLista());
                    break;
            }
        } while (parar < 10);

    }

}
