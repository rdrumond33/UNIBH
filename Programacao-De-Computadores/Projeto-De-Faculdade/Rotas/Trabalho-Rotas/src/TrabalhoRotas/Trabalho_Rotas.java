/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoRotas;

import java.util.Scanner;

/**
 *
 * @author R-DRU
 */
public class Trabalho_Rotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] dis = {{0, 20, 32, 45, 85, 90}, {20, 0, 20, 40, 65, 70}, {32, 20, 0, 25, 48, 49}, {45, 40, 25, 0, 39, 52}, {85, 65, 45, 39, 0, 36}, {90, 70, 49, 52, 36, 0}};
        int[] rota = new int[6];
        String[] cidade = {"BH", "Contagem", "Betim", "Juatuba", "Paraminas", "Itauna"};
        int qui = 0, i = 0;
        double litro = 0, qui_litro = 0;
        Scanner ent = new Scanner(System.in);
        System.out.println("Informe o preco do litro de combustivel");
        litro = ent.nextDouble();
        while (litro <= 0) {
            System.out.println("valor informado invalido menor que 0");
            System.out.println("Informe o preco do litro de combustivel");
            litro = ent.nextDouble();
        }
        System.out.println("Quantos quilometros por litros seu veiculo faz: ");
        qui_litro = ent.nextDouble();
        while (qui_litro <= 0) {
            System.out.println("valor informado invalido menor que 0");
            System.out.println("Quantos quilometros por litros seu veiculo faz: ");
            qui_litro = ent.nextDouble();
        }
        System.out.println("Informe sua rota: ");
        System.out.printf("1.BH\n2.Contagem\n3.Betim\n4.Juatuba\n5.Paraminas\n6.Itauna\n");
        do {
            rota[i] = ent.nextInt();
            while (rota[i] > 6 || rota[i] < 1) {
                rota[i] = 0;
                System.out.println("valor invalido maior que 6 ou menor que 0 repita a rota");
                rota[i] = ent.nextInt();
            }
            rota[i]--;
            i++;
        } while (i < 6);
        /// teste ------------+
        for (i = 0; i < 6; i++) {
            System.out.printf("-%s", cidade[rota[i]]);
        }
        for (i = 0; i < 6; i++) {
            if (i < 5) {
                qui = qui + dis[rota[i]][rota[i + 1]];
            }
        }
        System.out.printf("\na quilometragem pecorida e de:%dkm.\nO custo da viagem sera R$:%.2f ", qui, litro * (qui_litro * qui));
    }

}
