/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaixaRegistradora;

import java.util.Scanner;

public class Caixa_registradora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //-----------Scanners---------------------------------
        Scanner ent = new Scanner(System.in);
        Scanner ent1 = new Scanner(System.in);
        //-----------------declaracao das variaveis---------------------------
        double valor_uni = 0, soma, Total = 0, troco = 0, soma_troco = 0;
        int i = 0, quant, total_quant = 0;
        String cont;
        //--------------criei os vetores---------------------------------------
        double[] nota = {100, 50, 25, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01};
        double[] soma_nota = new double[12];
        int[] result_troco = new int[12];

//------------comeco do programa---------------------------
        for (i = 0; i < 12; i++) {
            soma_nota[i] = 0;
            result_troco[i] = 0;
        }
        do {
            System.out.printf("\nDigite o valor unitario: ");
            valor_uni = ent.nextDouble();
            while (valor_uni < 0.01) {
                System.out.println("valor digitado e menor que RS:0,01 digite um valor valido");
                System.out.printf("Digite o valor unitario: ");
                valor_uni = ent.nextDouble();
            }
            System.out.printf("Digite a quantidade: ");
            quant = ent.nextInt();
            while (quant <= 0) {
                System.out.println("valor digitado e menor ou igual a zero digite de novo um valor valido");
                System.out.printf("Digite a quantidade: ");
                quant = ent.nextInt();
            }
            total_quant += quant;
            soma = valor_uni * quant;
            Total += soma;
            System.out.printf("\n Total R$:%.2f ", Total);
            System.out.printf("\n\nquer acrecentar mais produtos Sim ou Não: ");
            cont = ent1.nextLine();
        } while ("sim".equalsIgnoreCase(cont) || "s".equalsIgnoreCase(cont));

        System.out.printf("\nTotal do Produto R$:%d ", total_quant);
        System.out.printf("\nTotal da compra R$:%.2f ", Total);
        System.out.printf("\n\n");

        for (i = 0; i < 12; i++) {
            if (i < 6) {
                System.out.printf("informe a quantidade de notas de R$:%.2f: ", nota[i]);
                soma_nota[i] = ent.nextDouble() * nota[i];
            } else if (i > 5) {
                System.out.printf("informe a quantidade de moedas de R$:%.2f: ", nota[i]);
                soma_nota[i] = ent.nextDouble() * nota[i];
            }
            soma_troco += soma_nota[i];
        }
        troco = soma_troco - Total;
        if (troco < 0) {
            troco = -troco;
        }
        while (soma_troco < troco) {
            for (i = 0; i < 12; i++) {
                soma_nota[i] = 0;
                soma_troco = 0;
            }
            System.out.println("valor informado menonor repita:");

            for (i = 0; i < 12; i++) {
                if (i < 6) {
                    System.out.printf("informe a quantidade de notas de R$:%.2f: ", nota[i]);
                    soma_nota[i] = ent.nextDouble() * nota[i];
                } else if (i > 5) {
                    System.out.printf("informe a quantidade de moedas de R$:%.2f: ", nota[i]);
                    soma_nota[i] = ent.nextDouble() * nota[i];
                }
                soma_troco += soma_nota[i];
            }
            troco = soma_troco - Total;
        }

        System.out.printf("\ntotal da compra:%.2f ", Total);
        System.out.printf("\ntotal Recebido:%.2f", soma_troco);
        System.out.printf("\nTroco         :%.2f ", troco);

        for (i = 0; i < 12; i++) {          //for que verifica e faz o trorco

            if ((troco / nota[i]) >= 1) {
                result_troco[i] = (int) (troco / nota[i]);
                troco -= nota[i] * result_troco[i];
            } else if (troco <= 0) {
                result_troco[i] = 0;
            }

        }
        for (i = 0; i < 12; i++) {
            if (i < 6) {
                System.out.printf("\n %d notas de R$:%.2f", result_troco[i], nota[i]);
            } else if (i > 5) {
                System.out.printf("\n %d moedas de R$:%.2f", result_troco[i], nota[i]);

            }
        }
    }

}
