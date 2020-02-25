/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila_pilha;

import java.util.*;

/**
 *
 * @author Rodrigo Drumond
 */
public class Fila_pilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Scanner ent1 = new Scanner(System.in);

        Pilha p = new Pilha();
        Fila f = new Fila();

        int var;
        do {
            System.out.println("\ndigite ");
            var = ent.nextInt();
            switch (var) {
                case 1:
                    System.out.println("\ndigite caracter: ");
                   p.Empilhar(ent1.nextLine());
                    break;
                case 2:

                    p.imprimePilha();
                    break;
                case 3:
                    p.excluir(ent1.nextLine());
                    break;
            }

        } while (true);

    }

}
