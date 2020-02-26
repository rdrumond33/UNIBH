package аrvoreBinаriaDePesquia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author Rodrigo Drumond
 */
public class ArvoreBinariaDePesquia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno;
        ArvoreBinaria arvorebinaria = new ArvoreBinaria();
        Scanner ent = new Scanner(System.in);
        Scanner ent1 = new Scanner(System.in);

        int opcao = 0;

        
        do {
            System.out.println("1-para adicionar aluno");
            System.out.println("2-imprimir em ordem");
            System.out.println("3-imprimir em PosOrdem");
            System.out.println("4-imprimir em PreOrdem");
            System.out.println("5-finalizar");
            opcao = ent.nextInt();
            switch (opcao) {
                case 1:

                    String nome,
                     curso;
                    int matricula;
                    System.out.println("Digite o nome do aluno");
                    nome = ent1.nextLine();
                    System.out.println("Matricula");
                    matricula = ent.nextInt();
                    System.out.println("Curso");
                    curso = ent1.nextLine();
                    aluno = new Aluno(nome, matricula, curso);
                    arvorebinaria.insere(aluno);
                    break;
                case 2:
                    System.out.println("Em ordem");
                    arvorebinaria.imprimeEmOrdem();
                    break;
                case 3:
                    System.out.println("PosOrdem");
                    arvorebinaria.imprimePosOrdem();
                    break;
                case 4:

                    System.out.println("PreOrdem");
                    arvorebinaria.imprimePreOrdem();
                    break;
            }
        } while (opcao < 5);

    }

}
