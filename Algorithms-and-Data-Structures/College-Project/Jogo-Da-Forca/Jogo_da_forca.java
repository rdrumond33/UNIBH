package jogo_da_forca;

import java.util.*;

public class Jogo_da_forca {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Scanner ent1 = new Scanner(System.in);

        /**
         * **********objetos********************
         */
        Forca forc = new Forca();
        Ranking rank = new Ranking();

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
            System.out.printf("\nDigite %s3%s  para listar o Rank ", "'", "'");
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
            }
        } while (parar == 1);

    }
}
